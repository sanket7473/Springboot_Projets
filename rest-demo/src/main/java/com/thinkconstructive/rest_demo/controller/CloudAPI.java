package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudcendor")
public class CloudAPI {
    CloudVendorService cloudVendorService;
    public CloudAPI(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorID)
    {
        return cloudVendorService.getCloudVendor(vendorID);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVenors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
    cloudVendorService.createCloudVendor(cloudVendor);
    return "Cloud vendor created Succesfull";
    }

    @PutMapping
   public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteClouudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
      cloudVendorService.deleteCloudVendor(vendorId);
        return "cloud vendor deleted successfully!";
    }

}
