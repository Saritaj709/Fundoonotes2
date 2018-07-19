package com.bridgelabz.fundonotes.note.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import io.swagger.annotations.ApiModelProperty;

@Document(collection = "notes")
@Service
public class NoteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String noteEmail;
	String title;
	String description;
	@ApiModelProperty(hidden = true)
	Date createdAt;
	@ApiModelProperty(hidden = true)
	String userEmail;
	@ApiModelProperty(hidden = true)
	Date lastModifiedAt;
	String label;
	String testColor;

	public NoteDTO() {
		super();
	}

	public String getNoteEmail() {
		return noteEmail;
	}

	public void setNoteEmail(String noteEmail) {
		this.noteEmail = noteEmail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTestColor() {
		return testColor;
	}

	public void setTestColor(String testColor) {
		this.testColor = testColor;
	}

	@Override
	public String toString() {
		return "NoteDTO [noteEmail=" + noteEmail + ", title=" + title + ", description=" + description + ", createdAt="
				+ createdAt + ", userEmail=" + userEmail + ", lastModifiedAt=" + lastModifiedAt + ", label=" + label
				+ ", testColor=" + testColor + "]";
	}
}
