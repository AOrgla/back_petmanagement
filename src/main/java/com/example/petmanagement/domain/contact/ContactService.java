package com.example.petmanagement.domain.contact;


import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.contact.ContactRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContactService {

    @Resource
    private ContactRepository contactRepository;

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }
}
