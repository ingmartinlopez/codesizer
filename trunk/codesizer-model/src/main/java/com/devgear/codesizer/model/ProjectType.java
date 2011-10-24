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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * ProjectType generated by hbm2java
 */
@Entity
@Table(name = "project_types", schema = "public")
public class ProjectType implements java.io.Serializable {

	private int idProjectType;
	private int version;
	private Client client;
	private ProjectType projectType;
	private String name;
	private char available;
	private Set<ParameterType> parameterTypes = new HashSet<ParameterType>(0);
	private Set<ProjectTypeFeatureTypes> projectTypeFeatureTypeses = new HashSet<ProjectTypeFeatureTypes>(
			0);
	private Set<Project> projects = new HashSet<Project>(0);
	private Set<ProjectType> projectTypes = new HashSet<ProjectType>(0);
	private Set<ExtraTask> extraTasks = new HashSet<ExtraTask>(0);
	private Set<ProjectTypeActivities> projectTypeActivitieses = new HashSet<ProjectTypeActivities>(
			0);

	public ProjectType() {
	}

	public ProjectType(int idProjectType, Client client, String name,
			char available) {
		this.idProjectType = idProjectType;
		this.client = client;
		this.name = name;
		this.available = available;
	}

	public ProjectType(int idProjectType, Client client,
			ProjectType projectType, String name, char available,
			Set<ParameterType> parameterTypes,
			Set<ProjectTypeFeatureTypes> projectTypeFeatureTypeses,
			Set<Project> projects, Set<ProjectType> projectTypes,
			Set<ExtraTask> extraTasks,
			Set<ProjectTypeActivities> projectTypeActivitieses) {
		this.idProjectType = idProjectType;
		this.client = client;
		this.projectType = projectType;
		this.name = name;
		this.available = available;
		this.parameterTypes = parameterTypes;
		this.projectTypeFeatureTypeses = projectTypeFeatureTypeses;
		this.projects = projects;
		this.projectTypes = projectTypes;
		this.extraTasks = extraTasks;
		this.projectTypeActivitieses = projectTypeActivitieses;
	}

	@Id
	@Column(name = "id_project_type", unique = true, nullable = false)
	public int getIdProjectType() {
		return this.idProjectType;
	}

	public void setIdProjectType(int idProjectType) {
		this.idProjectType = idProjectType;
	}

	@Version
	@Column(name = "version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_client", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_project_type_v1")
	public ProjectType getProjectType() {
		return this.projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "available", nullable = false, length = 1)
	public char getAvailable() {
		return this.available;
	}

	public void setAvailable(char available) {
		this.available = available;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "project_type_parameter_types", schema = "public", joinColumns = { @JoinColumn(name = "id_project_type", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_parameter_type", nullable = false, updatable = false) })
	public Set<ParameterType> getParameterTypes() {
		return this.parameterTypes;
	}

	public void setParameterTypes(Set<ParameterType> parameterTypes) {
		this.parameterTypes = parameterTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectType")
	public Set<ProjectTypeFeatureTypes> getProjectTypeFeatureTypeses() {
		return this.projectTypeFeatureTypeses;
	}

	public void setProjectTypeFeatureTypeses(
			Set<ProjectTypeFeatureTypes> projectTypeFeatureTypeses) {
		this.projectTypeFeatureTypeses = projectTypeFeatureTypeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectType")
	public Set<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectType")
	public Set<ProjectType> getProjectTypes() {
		return this.projectTypes;
	}

	public void setProjectTypes(Set<ProjectType> projectTypes) {
		this.projectTypes = projectTypes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "project_type_extra_tasks", schema = "public", joinColumns = { @JoinColumn(name = "id_project_type", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_extra_task", nullable = false, updatable = false) })
	public Set<ExtraTask> getExtraTasks() {
		return this.extraTasks;
	}

	public void setExtraTasks(Set<ExtraTask> extraTasks) {
		this.extraTasks = extraTasks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectType")
	public Set<ProjectTypeActivities> getProjectTypeActivitieses() {
		return this.projectTypeActivitieses;
	}

	public void setProjectTypeActivitieses(
			Set<ProjectTypeActivities> projectTypeActivitieses) {
		this.projectTypeActivitieses = projectTypeActivitieses;
	}

}
