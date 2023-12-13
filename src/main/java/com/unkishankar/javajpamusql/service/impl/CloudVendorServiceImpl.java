package com.unkishankar.javajpamusql.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unkishankar.javajpamusql.model.CloudVendor;
import com.unkishankar.javajpamusql.repository.CloudVendorRepository;
import com.unkishankar.javajpamusql.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    private final CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success !";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success !";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Delete Success !";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

}
