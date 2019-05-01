package com.cab.jpa.configuration;

import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaDialect;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.google.common.collect.Maps;


@EnableJpaRepositories(basePackages = { "com.cab.jpa.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
@EnableAspectJAutoProxy
@Configuration
@ComponentScan (basePackages="com.cab.jpa.repository.impl")
@EnableScheduling
@EnableRetry
@EntityScan("com.cab.jpa.model")
@PropertySource("classpath:/test-cab-jpa-defaults.properties")
public class JPAConfigurationTest extends JpaBaseConfiguration {

	protected JPAConfigurationTest(DataSource dataSource, JpaProperties properties,
			ObjectProvider<JtaTransactionManager> jtaTransactionManager,
			ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
		super(dataSource, properties, jtaTransactionManager, transactionManagerCustomizers);
	}

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {

		return new EclipseLinkJpaVendorAdapter() {
			private final EclipseLinkJpaDialect jpaDialect = new EclipseLinkJpaDialect();

			@Override
			public EclipseLinkJpaDialect getJpaDialect() {
				return jpaDialect;
			}
		};

	}

	@Override
	protected Map<String, Object> getVendorProperties() {
		final Map<String, Object> properties = Maps.newHashMapWithExpectedSize(7);
		// Turn off dynamic weaving to disable LTW lookup in static weaving mode
		properties.put(PersistenceUnitProperties.WEAVING, "false");
		// needed for reports
		properties.put(PersistenceUnitProperties.ALLOW_NATIVE_SQL_QUERIES, "true");
		// flyway
		properties.put(PersistenceUnitProperties.DDL_GENERATION, "none");
		// Embeed into OTA logging
		properties.put(PersistenceUnitProperties.LOGGING_LOGGER, "JavaLogger");
		// Ensure that we flush only at the end of the transaction
		properties.put(PersistenceUnitProperties.PERSISTENCE_CONTEXT_FLUSH_MODE, "COMMIT");

		// Enable batch writing
		properties.put(PersistenceUnitProperties.BATCH_WRITING, "JDBC");
		// Batch size
		properties.put(PersistenceUnitProperties.BATCH_WRITING_SIZE, "500");

		return properties;
	}
	
}
