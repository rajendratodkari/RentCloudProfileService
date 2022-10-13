package com.rmt.cloud.rent.services.RentCloudProfileService.service;

import com.rmt.cloud.rent.commons.model.Customer;
import com.rmt.cloud.rent.services.RentCloudProfileService.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** ProfileServiceImpl */
@Service
public class ProfileServiceImpl implements ProfileService {

  @Autowired CustomerRepository customerRepository;

  @Override
  public Customer save(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public Customer fetchById(int id) {
    Optional<Customer> customer = customerRepository.findById(id);
    if (customer.isPresent()) {
      return customer.get();
    } else {
      return null;
    }
  }

  @Override
  public List<Customer> fetchAll() {
    return customerRepository.findAll();
  }
}
