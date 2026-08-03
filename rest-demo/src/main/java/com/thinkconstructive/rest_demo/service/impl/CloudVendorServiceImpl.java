package com.thinkconstructive.rest_demo.service.impl;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloud_vendorID) {
        cloudVendorRepository.deleteById(cloud_vendorID);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloud_vendorID) {
       return cloudVendorRepository.findById(cloud_vendorID).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVenors() {
        return cloudVendorRepository.findAll();
    }
}
