//package com.cab.security.oauth.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
//
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//	
//	@Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//	
//	
//	@Override
//    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//        security
//            .tokenKeyAccess("permitAll()")
//            .checkTokenAccess("isAuthenticated()")
//            .allowFormAuthenticationForClients();
//    }
//	
//	@Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients
//        .inMemory().
//        withClient("CAB_USER").secret(passwordEncoder.encode("123456")).
//        authorizedGrantTypes("authorization_code","password","refresh_token	")
//            .scopes("READ_LOCATION").authorities("CAB_CLIENT");
//    }
//
//}
