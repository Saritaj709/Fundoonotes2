package com.bridgelabz.fundonotes.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundonotes.note.model.NoteResponseDTO;
import com.bridgelabz.fundonotes.note.services.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

	@Autowired
	NoteService noteService;
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ResponseEntity<NoteResponseDTO> createNote(){
		NoteResponseDTO response=new NoteResponseDTO();
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
