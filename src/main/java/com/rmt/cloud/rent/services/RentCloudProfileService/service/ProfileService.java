package com.rmt.cloud.rent.services.RentCloudProfileService.service;

import com.rmt.cloud.rent.commons.model.Customer;
import java.util.List;

/** ProfileService */
public interface ProfileService {

  Customer save(Customer customer);

  Customer fetchById(int id);

  List<Customer> fetchAll();
}
