package com.HubalCRM.Service;


import java.util.List;

import com.HubalCRM.Entities.Lead;

public interface LeadService {
public void saveOneLead(Lead lead);

public Lead findOneLeadBuId(long id);

public void deleteOneLeadById(long id);

public List<Lead> listAll();

}
