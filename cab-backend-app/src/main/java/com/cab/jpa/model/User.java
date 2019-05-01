//package com.cab.jpa.model;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="Users")
//public class User{
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="id", nullable=false,updatable=false)
//	private Long id;
//	
//	@Column(name="username", nullable=false,unique=true)
//	private String userName;
//	
//	@Column(name="password", nullable=false)
//	private String password;
//	
//	@Column(name="enabled", nullable=false)
//	private boolean enabled;
//	
//	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
//	private List<Role> roles;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//
//	public List<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}	
//	
//
//}
