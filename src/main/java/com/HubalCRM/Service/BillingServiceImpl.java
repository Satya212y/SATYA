package com.HubalCRM.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HubalCRM.Entities.Billing;
import com.HubalCRM.Entities.Lead;
import com.HubalCRM.Repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billRepo;
	@Override
	public void saveOneBill(Billing bill) {
		billRepo.save(bill);
	}
	@Override
	public List<Billing> listAll() {
		List<Billing> bill = billRepo.findAll();
		return bill;
	}
	@Override
	public void deleteOneLeadById(long id) {
		billRepo.deleteById(id);
	}
	@Override
	public Billing findOneBillById(long id) {
		Optional<Billing> findById = billRepo.findById(id);
		
		return findById.get();
	}
	

}
