package com.fdmgroup.issuetracker.model.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int role_id;
	@Column(name="role_name", unique=true)
	private String roleName;
	public static final String ADMIN = "admin";
	public static final String DEPT_ADMIN ="department_admin";
	
	@OneToMany(mappedBy = "role")
	private List<User> users;
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String role_name) {
		this.roleName = role_name;
	}
	
	public void setAdmin(){
		this.roleName = ADMIN;
	}
	public void setDeptAdmin(){
		this.roleName = DEPT_ADMIN;
	}

}

//
//package com.fdmgroup.issuetracker.model.impl;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "User_Role")
//public class UserRole {
//
//	@OneToOne(cascade=CascadeType.ALL)
//	private User user;
//	@OneToOne(cascade=CascadeType.ALL)
//	private Role role;
//}
