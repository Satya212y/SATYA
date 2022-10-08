package com.HubalCRM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HubalCRM.Entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
