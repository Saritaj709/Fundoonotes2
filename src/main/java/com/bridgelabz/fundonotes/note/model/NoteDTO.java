package com.bridgelabz.fundonotes.note.model;

import java.io.Serializable;

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
	String creationDate;
	@ApiModelProperty(hidden = true)
	String userEmail;
	@ApiModelProperty(hidden = true)
	String lastModifiedDate;

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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Notes [noteEmail=" + noteEmail + ", title=" + title + ", description=" + description + ", creationDate="
				+ creationDate + ", userEmail=" + userEmail + ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}
