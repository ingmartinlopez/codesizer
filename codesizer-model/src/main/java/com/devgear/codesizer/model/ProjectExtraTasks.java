package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProjectExtraTasks generated by hbm2java
 */
@Entity
@Table(name = "project_extra_tasks", schema = "public")
public class ProjectExtraTasks implements java.io.Serializable {

	private ProjectExtraTasksId id;
	private Project project;
	private ExtraTask extraTask;
	private double multiplier;
	private String justification;

	public ProjectExtraTasks() {
	}

	public ProjectExtraTasks(ProjectExtraTasksId id, Project project,
			ExtraTask extraTask, double multiplier) {
		this.id = id;
		this.project = project;
		this.extraTask = extraTask;
		this.multiplier = multiplier;
	}

	public ProjectExtraTasks(ProjectExtraTasksId id, Project project,
			ExtraTask extraTask, double multiplier, String justification) {
		this.id = id;
		this.project = project;
		this.extraTask = extraTask;
		this.multiplier = multiplier;
		this.justification = justification;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false)),
			@AttributeOverride(name = "idExtraTask", column = @Column(name = "id_extra_task", nullable = false)) })
	public ProjectExtraTasksId getId() {
		return this.id;
	}

	public void setId(ProjectExtraTasksId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_project", nullable = false, insertable = false, updatable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_extra_task", nullable = false, insertable = false, updatable = false)
	public ExtraTask getExtraTask() {
		return this.extraTask;
	}

	public void setExtraTask(ExtraTask extraTask) {
		this.extraTask = extraTask;
	}

	@Column(name = "multiplier", nullable = false, precision = 17, scale = 17)
	public double getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	@Column(name = "justification")
	public String getJustification() {
		return this.justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

}
