package com.example.petmanagement.domain.contact;

import com.example.petmanagement.domain.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}