package com.HubalCRM.Service;

import java.util.List;

import com.HubalCRM.Entities.Billing;

public interface BillingService {

	public void saveOneBill(Billing bill);

	public List<Billing> listAll();

	public void deleteOneLeadById(long id);

	public Billing findOneBillById(long id);

}
