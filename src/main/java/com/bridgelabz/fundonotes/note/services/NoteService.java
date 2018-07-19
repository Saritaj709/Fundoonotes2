package com.bridgelabz.fundonotes.note.services;

import java.util.Date;

public interface NoteService {
	void createNote();

	void updateNote();

	void deleteNote();

	void readNote();

	boolean moveNoteToTrash();

	void addReminder(Date date);

	void deleteReminder(Date date);
}
