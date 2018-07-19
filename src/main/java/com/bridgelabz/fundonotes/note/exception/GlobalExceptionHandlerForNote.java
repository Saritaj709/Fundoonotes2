package com.bridgelabz.fundonotes.note.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.fundonotes.note.controller.NoteController;
import com.bridgelabz.fundonotes.note.model.NoteResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandlerForNote {

	public static final Logger logger = LoggerFactory.getLogger(NoteController.class);

	@ExceptionHandler(NoteException.class)
	public ResponseEntity<NoteResponseDTO> noteExceptionHandler(NoteException e) {
		logger.error("note entry error");
		NoteResponseDTO response = new NoteResponseDTO();
		response.setMessage("note entry error " + e.getMessage());
		response.setStatus(1);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	/*@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseDTO> controller(Exception e) {
		logger.error("other exceptions");
		ResponseDTO response=new ResponseDTO();
		response.setMessage("Some exceptions occured, "+e.getMessage());
		response.setStatus(-1);
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}*/
}
