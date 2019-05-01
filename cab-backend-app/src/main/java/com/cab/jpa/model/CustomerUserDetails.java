//package com.cab.jpa.model;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//
//public class CustomerUserDetails implements UserDetails{	
//	
//	
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 8929820756277007167L;
//	private String userName;
//	private String password;	
//	private Collection<? extends GrantedAuthority> authorities;
//	
//
//	public CustomerUserDetails (User repoUser) {
//		this.userName = repoUser.getUserName();
//		this.password = repoUser.getPassword();
//		List<GrantedAuthority> auths = new ArrayList<>();
//		for (Role role: repoUser.getRoles()) {
//			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
//		}
//		this.authorities= auths;
//	}
//
//	
//	
//	
//	
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {		
//		return authorities;
//	}
//	@Override
//	public String getUsername() {
//	
//		return this.userName;
//	}
//	@Override
//	public String getPassword() {
//		return this.password;
//	}
//	@Override
//	public boolean isAccountNonExpired() {
//	
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//	
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//	
//		return true;
//	}
//
//
//
//
//
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//
//
//	
//	
//
//}
