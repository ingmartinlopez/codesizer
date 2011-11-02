package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectTypeActivitiesId generated by hbm2java
 */
@Embeddable
public class ProjectTypeActivitiesId implements java.io.Serializable {

	private int idActivity;
	private int idProjectType;

	public ProjectTypeActivitiesId() {
	}

	public ProjectTypeActivitiesId(int idActivity, int idProjectType) {
		this.idActivity = idActivity;
		this.idProjectType = idProjectType;
	}

	@Column(name = "id_activity", nullable = false)
	public int getIdActivity() {
		return this.idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	@Column(name = "id_project_type", nullable = false)
	public int getIdProjectType() {
		return this.idProjectType;
	}

	public void setIdProjectType(int idProjectType) {
		this.idProjectType = idProjectType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectTypeActivitiesId))
			return false;
		ProjectTypeActivitiesId castOther = (ProjectTypeActivitiesId) other;

		return (this.getIdActivity() == castOther.getIdActivity())
				&& (this.getIdProjectType() == castOther.getIdProjectType());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdActivity();
		result = 37 * result + this.getIdProjectType();
		return result;
	}

}