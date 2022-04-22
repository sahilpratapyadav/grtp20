package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.contact.Contact;


public interface RepoContact  extends JpaRepository<Contact, Long> {

}
