package com.example.demo.service;

import java.util.List;

import com.example.demo.contact.Contact;

public interface ContactService {
	public String addContact(Contact obj);
	public String deleteContact(Long id);  
	public  List<Contact> showAllContacts();
	public String getContact(Long id);  

}
