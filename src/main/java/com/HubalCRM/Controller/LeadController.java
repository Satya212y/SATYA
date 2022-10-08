package com.HubalCRM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.HubalCRM.Entities.Billing;
import com.HubalCRM.Entities.Contact;
import com.HubalCRM.Entities.Lead;
import com.HubalCRM.Service.BillingService;
import com.HubalCRM.Service.ContactService;
import com.HubalCRM.Service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/")
	public String createOneLead() {
		return "create_lead";
		
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@RequestMapping("/convert")
	public String convertOneLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.findOneLeadBuId(id);
		Contact contact= new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setGender(lead.getGender());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactService.saveOneLead(contact);
		
		leadService.deleteOneLeadById(id);
		
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		return "contact_details";
		
	}
	@RequestMapping("/listall")
	public String GetContactLeads(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		return "contact_details";
		
	}
	@RequestMapping("/delete")
	public String deleteOneLeadById(@RequestParam("id") long id,ModelMap model) {
		contactService.delteOneLeadById(id);
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("leads", contacts);
		
		return "contact_details";
		
	}
	@RequestMapping("/leadLists")
	public String GetAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "Lead_details";
		
	}
	@RequestMapping("/deleteLead")
	public String deleteOneLeadById1(@RequestParam("id") long id,ModelMap model) {
		leadService.deleteOneLeadById(id);
		List<Lead> lead = leadService.listAll();
		model.addAttribute("leads", lead);
		
		return "Lead_details";

}
	@RequestMapping("/getLeadInfo")
	public String getLeadInfo(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.findOneLeadBuId(id);
		model.addAttribute("lead", lead);
		return "lead_info_details";
		
	}
	@RequestMapping("/getOneContactInfo")
	public String getContactInfo(@RequestParam("id") long id,Model model) {
		Contact contact = contactService.findOneLeadBuId(id);
		model.addAttribute("contact", contact);
		return "contact_list";
	}
	@RequestMapping("/convertToLead")
	
	public String ConvertToLead(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.findOneLeadBuId(id);
		Lead lead =new Lead();
		lead.setFirstName(contact.getFirstName());
		lead.setLastName(contact.getLastName());
		lead.setEmail(contact.getEmail());
		lead.setGender(contact.getGender());
		lead.setLeadSource(contact.getLeadSource());
		lead.setMobile(contact.getMobile());
		leadService.saveOneLead(lead);	
		contactService.delteOneLeadById(id);
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "Lead_details";
		
	}
	@RequestMapping("/BillinDetails")
	public String billingDetails(@RequestParam("id") long id,ModelMap model) {
		Contact Billing = contactService.findOneLeadBuId(id);
		model.addAttribute("billing", Billing);
		return "Create_billing";
		
	}
	@RequestMapping("/saveBilling")
	public String saveOneBill(@ModelAttribute("Bill")Billing bill,ModelMap model) {
		billingService.saveOneBill(bill);
		model.addAttribute("bill", bill);
		return "bill_info";
		
	}
	@RequestMapping("/bill_Lists")
	public String GetAllBills(ModelMap model) {
		List<Billing> bills = billingService.listAll();
		model.addAttribute("bill", bills);
		
		return "Billing_list";
		
	}
	@RequestMapping("/deletebills")
	public String deleteOneBillById1(@RequestParam("id") long id,ModelMap model) {
		billingService.deleteOneLeadById(id);
		List<Billing> bills = billingService.listAll();
		model.addAttribute("bill", bills);
		return "Billing_list";
	}
	@RequestMapping("/getOneBillInfo")
	
	public String GetOneBillInfo(@RequestParam("id") long id,ModelMap model) {
		Billing OneBill = billingService.findOneBillById(id);
		model.addAttribute("bill", OneBill);
		return "bill_info";
		
	}
	@RequestMapping("/UpdateLead")
	public String updateOneLeadById1(@RequestParam("id") long id,ModelMap model) {
		Lead leads = leadService.findOneLeadBuId(id);
		model.addAttribute("leads", leads);
		
		return "update_leads";
	}
	@RequestMapping("/updateOneLead")
	public String updateLeads(@ModelAttribute("leads") Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads", leads);
		return "Lead_details";
	}
}
