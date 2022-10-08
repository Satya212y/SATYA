package com.HubalCRM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HubalCRM.Entities.Billing;
import com.HubalCRM.Service.BillingService;

@RestController
@RequestMapping("/bills")
public class BillRestController {
	@Autowired
	private BillingService billservice;
	@GetMapping
	public List<Billing> getAllLead() {
		List<Billing> bills = billservice.listAll();
		return bills;
		
	}
	@PostMapping
	public void saveOneBill(@RequestBody Billing bill) {
		billservice.saveOneBill(bill);
	}
	@PutMapping
	public void updateOneBill(@RequestBody Billing bill) {
		billservice.saveOneBill(bill);
	}
	@DeleteMapping("{id}")
	public void deleteOneBillById(@PathVariable("id") long id) {
		billservice.deleteOneLeadById(id);
	}
	@GetMapping("/api/{id}")
	public Billing getOneLead(@PathVariable("id") long id) {
		Billing Bills = billservice.findOneBillById(id);
		return Bills;
		
		
	}


}
