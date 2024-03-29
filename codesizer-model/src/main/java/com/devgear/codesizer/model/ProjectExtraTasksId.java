package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectExtraTasksId generated by hbm2java
 */
@Embeddable
public class ProjectExtraTasksId implements java.io.Serializable {

	private int idProject;
	private int idExtraTask;

	public ProjectExtraTasksId() {
	}

	public ProjectExtraTasksId(int idProject, int idExtraTask) {
		this.idProject = idProject;
		this.idExtraTask = idExtraTask;
	}

	@Column(name = "id_project", nullable = false)
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	@Column(name = "id_extra_task", nullable = false)
	public int getIdExtraTask() {
		return this.idExtraTask;
	}

	public void setIdExtraTask(int idExtraTask) {
		this.idExtraTask = idExtraTask;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectExtraTasksId))
			return false;
		ProjectExtraTasksId castOther = (ProjectExtraTasksId) other;

		return (this.getIdProject() == castOther.getIdProject())
				&& (this.getIdExtraTask() == castOther.getIdExtraTask());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProject();
		result = 37 * result + this.getIdExtraTask();
		return result;
	}

}
