package com.devgear.codesizer.model;

// Generated 24-oct-2011 0:54:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Parameter generated by hbm2java
 */
@Entity
@Table(name = "parameters", schema = "public")
public class Parameter implements java.io.Serializable {

	private int idParameter;
	private ParameterType parameterType;
	private double multiplier;
	private Integer minValue;
	private Integer maxValue;
	private Set<Task> tasks = new HashSet<Task>(0);

	public Parameter() {
	}

	public Parameter(int idParameter, ParameterType parameterType,
			double multiplier) {
		this.idParameter = idParameter;
		this.parameterType = parameterType;
		this.multiplier = multiplier;
	}

	public Parameter(int idParameter, ParameterType parameterType,
			double multiplier, Integer minValue, Integer maxValue,
			Set<Task> tasks) {
		this.idParameter = idParameter;
		this.parameterType = parameterType;
		this.multiplier = multiplier;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.tasks = tasks;
	}

	@Id
	@Column(name = "id_parameter", unique = true, nullable = false)
	public int getIdParameter() {
		return this.idParameter;
	}

	public void setIdParameter(int idParameter) {
		this.idParameter = idParameter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_parameter_type", nullable = false)
	public ParameterType getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(ParameterType parameterType) {
		this.parameterType = parameterType;
	}

	@Column(name = "multiplier", nullable = false, precision = 17, scale = 17)
	public double getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	@Column(name = "min_value")
	public Integer getMinValue() {
		return this.minValue;
	}

	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}

	@Column(name = "max_value")
	public Integer getMaxValue() {
		return this.maxValue;
	}

	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "parameters")
	public Set<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

}
