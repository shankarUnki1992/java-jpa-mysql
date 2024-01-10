package com.unkishankar.javajpamusql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unkishankar.javajpamusql.exception.CloudVendorNotFoundException;
import com.unkishankar.javajpamusql.model.CloudVendor;
import com.unkishankar.javajpamusql.repository.CloudVendorRepository;
import com.unkishankar.javajpamusql.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
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
    public String deleteCloudVendor(int vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Delete Success !";
    }

    @Override
    public CloudVendor getCloudVendor(int vendorId) {
        if (cloudVendorRepository.findById(vendorId).isEmpty())
            throw new CloudVendorNotFoundException(vendorId + " Not found");
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

}
