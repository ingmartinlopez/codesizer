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
 * TemplateProjectTypeActivity generated by hbm2java
 */
@Entity
@Table(name = "t_project_type_activities", schema = "public")
public class TemplateProjectTypeActivity implements java.io.Serializable {

	private TemplateProjectTypeActivityId id;
	private TemplateActivity templateActivity;
	private TemplateProjectType templateProjectType;
	private double percentage;

	public TemplateProjectTypeActivity() {
	}

	public TemplateProjectTypeActivity(TemplateProjectTypeActivityId id,
			TemplateActivity templateActivity,
			TemplateProjectType templateProjectType, double percentage) {
		this.id = id;
		this.templateActivity = templateActivity;
		this.templateProjectType = templateProjectType;
		this.percentage = percentage;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idProjectType", column = @Column(name = "id_project_type", nullable = false)),
			@AttributeOverride(name = "idActivity", column = @Column(name = "id_activity", nullable = false)) })
	public TemplateProjectTypeActivityId getId() {
		return this.id;
	}

	public void setId(TemplateProjectTypeActivityId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_activity", nullable = false, insertable = false, updatable = false)
	public TemplateActivity getTemplateActivity() {
		return this.templateActivity;
	}

	public void setTemplateActivity(TemplateActivity templateActivity) {
		this.templateActivity = templateActivity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_project_type", nullable = false, insertable = false, updatable = false)
	public TemplateProjectType getTemplateProjectType() {
		return this.templateProjectType;
	}

	public void setTemplateProjectType(TemplateProjectType templateProjectType) {
		this.templateProjectType = templateProjectType;
	}

	@Column(name = "percentage", nullable = false, precision = 17, scale = 17)
	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}