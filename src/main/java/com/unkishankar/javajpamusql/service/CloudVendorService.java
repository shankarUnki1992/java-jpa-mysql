package com.unkishankar.javajpamusql.service;

import java.util.List;

import com.unkishankar.javajpamusql.model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(int vendorId);

    public CloudVendor getCloudVendor(int vendorId);

    public List<CloudVendor> getAllCloudVendors();
}
