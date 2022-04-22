package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.contact.Contact;
import com.example.demo.serviceimp.ServiceContactimp;

@RestController
public class AddContact {
	@Autowired
	private ServiceContactimp serv;

	@PostMapping("/contact")
	public String AddContract(@RequestBody Contact Obj) {
		String addContact = serv.addContact(Obj);

		return "success";

	}

	@GetMapping("/contact/delete/{id}")
	public String deleteContact(@PathVariable("id") Long id) {
		String deleteContact = serv.deleteContact(id);
		return "succefull deleted" + deleteContact;

	}

	@GetMapping("/contacts")
	public String showAllContacts() {

		List<Contact> showAllContacts = serv.showAllContacts();
		return ""+ showAllContacts;

	}
	
	@GetMapping("/contact")
	public String getContact(@RequestParam("id") Long id) {
		String contact = serv.getContact(id);
		return "hi";
		
	}

	/*
	 * @GetMapping("/ticket") 
	 * public ResponseEntity<String>
	 * getTicketStatus(@RequestParam("pnr") String pnr){
	 * 
	 * String tkStatus="tikcet is bookeding";
	 * 
	 * return new ResponseEntity<>(tkStatus, HttpStatus.OK);
	 * 
	 * }
	 * 
	 * 
	 * @GetMapping("/ticket/{pnr}/info") public ResponseEntity<String>
	 * getTicketStatuss(@PathVariable("pnr") String pnr){
	 * 
	 * String tkStatus="tikcet is bookeded";
	 * 
	 * return new ResponseEntity<>(tkStatus, HttpStatus.OK);
	 * 
	 * }
	 */

}
