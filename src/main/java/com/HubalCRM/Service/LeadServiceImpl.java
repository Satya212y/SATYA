package com.HubalCRM.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HubalCRM.Entities.Lead;
import com.HubalCRM.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
    @Autowired
    private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		


}
	@Override
	public Lead findOneLeadBuId(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		
			Lead lead = findById.get();
			return lead;
		
	}
	@Override
	public void deleteOneLeadById(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
}