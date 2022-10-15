package com.rmt.cloud.rent.services.RentCloudProfileService.controller;

import com.rmt.cloud.rent.commons.model.Customer;
import com.rmt.cloud.rent.services.RentCloudProfileService.service.ProfileServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** ProfileController */
@RestController
@RequestMapping(value = "/service")
public class ProfileController {

  @Autowired ProfileServiceImpl profileService;

  @RequestMapping(value = "/profile", method = RequestMethod.POST)
  public Customer save(@RequestBody Customer customer) {
    return profileService.save(customer);
  }

  @RequestMapping(value = "/profile", method = RequestMethod.GET)
  public ResponseEntity<Customer> fetch(@RequestParam int id) {
    Customer customer = profileService.fetchById(id);
    if (customer == null) {
      return ResponseEntity.notFound().build();
    } else {
      return ResponseEntity.ok(customer);
    }
  }

  @RequestMapping(value = "/profiles", method = RequestMethod.GET)
  public List<Customer> fetchAll() {
    return profileService.fetchAll();
  }
}
