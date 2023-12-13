package com.unkishankar.javajpamusql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unkishankar.javajpamusql.model.CloudVendor;
import com.unkishankar.javajpamusql.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorById(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping("/")
    public List<CloudVendor> getAllCloudVendorById() {
        return cloudVendorService.getAllCloudVendors();
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
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully !";
    }

}
