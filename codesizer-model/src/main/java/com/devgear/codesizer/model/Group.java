package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name = "groups", schema = "public")
public class Group implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idGroup;
	private Client client;
	private String name;
	private Set<User> users = new HashSet<User>(0);
	private Set<Role> roles = new HashSet<Role>(0);

	public Group() {
	}

	public Group(int idGroup, Client client) {
		this.idGroup = idGroup;
		this.client = client;
	}

	public Group(int idGroup, Client client, String name, Set<User> users,
			Set<Role> roles) {
		this.idGroup = idGroup;
		this.client = client;
		this.name = name;
		this.users = users;
		this.roles = roles;
	}

	@Id
	@Column(name = "id_group", unique = true, nullable = false)
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_client", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "groups_users", schema = "public", joinColumns = { @JoinColumn(name = "id_group", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_user", nullable = false, updatable = false) })
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "groups_roles", schema = "public", joinColumns = { @JoinColumn(name = "id_group", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_role", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}