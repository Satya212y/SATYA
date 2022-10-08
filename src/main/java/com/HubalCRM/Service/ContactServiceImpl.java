package com.HubalCRM.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HubalCRM.Entities.Contact;
import com.HubalCRM.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
@Autowired
 private ContactRepository contactRepo;
	@Override
	public void saveOneLead(Contact contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contact> listAll() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}
	@Override
	public void delteOneLeadById(long id) {
		contactRepo.deleteById(id);
	}
	@Override
	public Contact findOneLeadBuId(long id) {
		Optional<Contact> contacts = contactRepo.findById(id);
		Contact contact = contacts.get();
		return contact;
		
	}

}
