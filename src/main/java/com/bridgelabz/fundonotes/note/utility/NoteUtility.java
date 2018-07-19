package com.bridgelabz.fundonotes.note.utility;

import com.bridgelabz.fundonotes.note.exception.NoteException;
import com.bridgelabz.fundonotes.note.model.NoteDTO;

public class NoteUtility {
	
	private final static String EMAIL = "^\\w+@\\w+\\..{2,3}(.{2,3})?$";
	private final static String DATE="";
	
	public void validateNote(NoteDTO note) throws NoteException {
		if(!note.getCreationDate().matches(DATE)) {
			throw new NoteException("invalid creation date format");
		}
		if(!note.getNoteEmail().matches(EMAIL)) {
			throw new NoteException("invalid email format for note");
		}
		if(!note.getUserEmail().matches(EMAIL)) {
			throw new NoteException("invalid email format for user");
		}
		if(note.getDescription().length()<3) {
			throw new NoteException("description should be at least of 3 characters");
		}
		if(!note.getLastModifiedDate().matches(DATE)) {
			throw new NoteException("invalid last modified date format");
		}
	}

}  
