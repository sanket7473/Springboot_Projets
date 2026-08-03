package com.thinkconstructive.rest_demo.service;

import com.thinkconstructive.rest_demo.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloud_vendorID);
    public CloudVendor getCloudVendor(String cloud_vendorID);
    public List<CloudVendor> getAllCloudVenors();


}
