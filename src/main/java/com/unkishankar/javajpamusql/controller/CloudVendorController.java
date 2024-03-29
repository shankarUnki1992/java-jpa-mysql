package com.unkishankar.javajpamusql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unkishankar.javajpamusql.model.CloudVendor;
import com.unkishankar.javajpamusql.response.ResponseHandler;
import com.unkishankar.javajpamusql.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    @Autowired
    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public ResponseEntity<Object> getCloudVendorById(@PathVariable("vendorId") int vendorId) {
        return ResponseHandler.responseBuilder("Success", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));

    }

    @GetMapping("/")
    public ResponseEntity<Object> getAllCloudVendorById() {
        return ResponseHandler.responseBuilder("Success", HttpStatus.OK, cloudVendorService.getAllCloudVendors());
        // return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping()
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        cloudVendorService.createCloudVendor(cloudvendor);
        return "Cloudvendor created successfully !";
    }

    @PutMapping()
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloudvendor updated successfully !";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") int vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully !";
    }

}
