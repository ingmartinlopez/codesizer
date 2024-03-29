package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TemplateProjectTypeActivityId generated by hbm2java
 */
@Embeddable
public class TemplateProjectTypeActivityId implements java.io.Serializable {

	private int idProjectType;
	private int idActivity;

	public TemplateProjectTypeActivityId() {
	}

	public TemplateProjectTypeActivityId(int idProjectType, int idActivity) {
		this.idProjectType = idProjectType;
		this.idActivity = idActivity;
	}

	@Column(name = "id_project_type", nullable = false)
	public int getIdProjectType() {
		return this.idProjectType;
	}

	public void setIdProjectType(int idProjectType) {
		this.idProjectType = idProjectType;
	}

	@Column(name = "id_activity", nullable = false)
	public int getIdActivity() {
		return this.idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TemplateProjectTypeActivityId))
			return false;
		TemplateProjectTypeActivityId castOther = (TemplateProjectTypeActivityId) other;

		return (this.getIdProjectType() == castOther.getIdProjectType())
				&& (this.getIdActivity() == castOther.getIdActivity());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdProjectType();
		result = 37 * result + this.getIdActivity();
		return result;
	}

}
