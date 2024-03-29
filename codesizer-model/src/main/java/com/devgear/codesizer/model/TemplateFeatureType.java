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
 * TemplateFeatureType generated by hbm2java
 */
@Entity
@Table(name = "t_feature_types", schema = "public")
public class TemplateFeatureType implements java.io.Serializable {

	private int idFeatureType;
	private TemplateActivity templateActivity;
	private String name;
	private Set<TemplateProjectTypeFeatureType> templateProjectTypeFeatureTypes = new HashSet<TemplateProjectTypeFeatureType>(
			0);

	public TemplateFeatureType() {
	}

	public TemplateFeatureType(int idFeatureType,
			TemplateActivity templateActivity, String name) {
		this.idFeatureType = idFeatureType;
		this.templateActivity = templateActivity;
		this.name = name;
	}

	public TemplateFeatureType(int idFeatureType,
			TemplateActivity templateActivity, String name,
			Set<TemplateProjectTypeFeatureType> templateProjectTypeFeatureTypes) {
		this.idFeatureType = idFeatureType;
		this.templateActivity = templateActivity;
		this.name = name;
		this.templateProjectTypeFeatureTypes = templateProjectTypeFeatureTypes;
	}

	@Id
	@Column(name = "id_feature_type", unique = true, nullable = false)
	public int getIdFeatureType() {
		return this.idFeatureType;
	}

	public void setIdFeatureType(int idFeatureType) {
		this.idFeatureType = idFeatureType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_activity", nullable = false)
	public TemplateActivity getTemplateActivity() {
		return this.templateActivity;
	}

	public void setTemplateActivity(TemplateActivity templateActivity) {
		this.templateActivity = templateActivity;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "templateFeatureType")
	public Set<TemplateProjectTypeFeatureType> getTemplateProjectTypeFeatureTypes() {
		return this.templateProjectTypeFeatureTypes;
	}

	public void setTemplateProjectTypeFeatureTypes(
			Set<TemplateProjectTypeFeatureType> templateProjectTypeFeatureTypes) {
		this.templateProjectTypeFeatureTypes = templateProjectTypeFeatureTypes;
	}

}
