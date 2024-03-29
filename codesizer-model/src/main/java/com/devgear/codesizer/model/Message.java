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
 * Message generated by hbm2java
 */
@Entity
@Table(name = "messages", schema = "public")
public class Message implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageId id;
	private Language language;
	private String localizedString;

	public Message() {
	}

	public Message(MessageId id, Language language, String localizedString) {
		this.id = id;
		this.language = language;
		this.localizedString = localizedString;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "messageKey", column = @Column(name = "message_key", nullable = false)),
			@AttributeOverride(name = "idLanguage", column = @Column(name = "id_language", nullable = false)) })
	public MessageId getId() {
		return this.id;
	}

	public void setId(MessageId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_language", nullable = false, insertable = false, updatable = false)
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Column(name = "localized_string", nullable = false, length = 50)
	public String getLocalizedString() {
		return this.localizedString;
	}

	public void setLocalizedString(String localizedString) {
		this.localizedString = localizedString;
	}

}
