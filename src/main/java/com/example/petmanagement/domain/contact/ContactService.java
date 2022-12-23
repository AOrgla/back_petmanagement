package com.example.petmanagement.domain.contact;


import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.contact.ContactRepository;
import com.example.petmanagement.validation.Validation;
import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {

    @Resource
    private ContactRepository contactRepository;

    public void addContact(Contact contact) {
        List<Contact> allContacts = contactRepository.findAll();
        Validation.validateEmailExists(contact, allContacts);
        contactRepository.save(contact);
    }
}
