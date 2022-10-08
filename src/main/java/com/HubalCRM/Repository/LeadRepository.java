package com.HubalCRM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HubalCRM.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
