package com.cms.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;


/**
 * 
 *  @author pavan
 */


@Entity
@Data
@Table(name = "cms_users",
		uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String username ;
	
	private String password ;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "cms_user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>() ;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
