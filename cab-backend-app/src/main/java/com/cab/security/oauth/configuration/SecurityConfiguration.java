//package com.cab.security.oauth.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//	
//	
////	 @Override
////	    public void configure(WebSecurity web) throws Exception {
////	        web.ignoring().antMatchers("/resources/**");
////	    }
////	
////	 	@Override
////	    protected void configure(HttpSecurity http) throws Exception {
////	        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/rest/v1/location/")
////	            .hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
////	            .permitAll().and().logout().permitAll();
////	        http.csrf().disable();
////	    }
////	    @Override
////	    public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
////	        authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
////	            .authorities("ROLE_ADMIN");
////	    }
////	    
//	    
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http
//	            .antMatcher("/**")
//	                .authorizeRequests()
//	                .antMatchers("/oauth/token","/oauth/authorize**", "/login**", "/error**")
//	                .permitAll()
//	            .and()
//	                .authorizeRequests()
//	                .anyRequest().authenticated()
//	            .and()
//	                .formLogin().permitAll();
//	    }
//	  
//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	        auth
//	            .inMemoryAuthentication()
//	            .withUser("USER_1").password(passwordEncoder().encode("123456")).roles("USER");
//	    }
//	      
//	    @Bean
//	    public BCryptPasswordEncoder passwordEncoder(){
//	        return new BCryptPasswordEncoder();
//	    }
//
//}
