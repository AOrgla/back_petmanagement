package com.example.petmanagement.domain.contact;


import com.example.petmanagement.validation.Validation;
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
