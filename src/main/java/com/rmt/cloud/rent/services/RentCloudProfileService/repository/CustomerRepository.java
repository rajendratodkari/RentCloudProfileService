package com.rmt.cloud.rent.services.RentCloudProfileService.repository;

import com.rmt.cloud.rent.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/** CustomerRepository */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {}
