package com.HubalCRM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HubalCRM.Entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
