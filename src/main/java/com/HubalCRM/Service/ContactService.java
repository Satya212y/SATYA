package com.HubalCRM.Service;

import java.util.List;

import com.HubalCRM.Entities.Contact;
import com.HubalCRM.Entities.Lead;

public interface ContactService {
	public void saveOneLead(Contact contact);

	public List<Contact> listAll();

	public void delteOneLeadById(long id);

	public Contact findOneLeadBuId(long id);

}
