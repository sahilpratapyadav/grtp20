package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.contact.Contact;
import com.example.demo.repo.RepoContact;
import com.example.demo.service.ContactService;

@Service
public class ServiceContactimp implements ContactService {
	@Autowired
	private  RepoContact repo;

	
	public String addContact(Contact obj){
	repo.save(obj);
	
	
	return "succesfull";
	}


	@Override
	public String deleteContact(Long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		
		
		return "id succes full delete"+id;
	}


	@Override
	public List<Contact> showAllContacts() {
		// TODO Auto-generated method stub
		
		List<Contact> AllContact = repo.findAll();
		return AllContact ;
		
	}


	@Override
	public String getContact(Long id) {
	Contact t=	repo.getById(id);
		return "seccesfully id get"+ t;
	}

	
	
}

                                            
            


                          
                                           
                                                                                                                                                                                                                                                                                                                                                         