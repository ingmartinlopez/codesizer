package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subsystems generated by hbm2java
 */
@Entity
@Table(name = "subsystems", schema = "public")
public class Subsystems implements java.io.Serializable {

	private int idSubsystem;
	private Project project;
	private String name;
	private Set<Module> modules = new HashSet<Module>(0);

	public Subsystems() {
	}

	public Subsystems(int idSubsystem, Project project, String name) {
		this.idSubsystem = idSubsystem;
		this.project = project;
		this.name = name;
	}

	public Subsystems(int idSubsystem, Project project, String name,
			Set<Module> modules) {
		this.idSubsystem = idSubsystem;
		this.project = project;
		this.name = name;
		this.modules = modules;
	}

	@Id
	@Column(name = "id_subsystem", unique = true, nullable = false)
	public int getIdSubsystem() {
		return this.idSubsystem;
	}

	public void setIdSubsystem(int idSubsystem) {
		this.idSubsystem = idSubsystem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_project", nullable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subsystems")
	public Set<Module> getModules() {
		return this.modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

}
