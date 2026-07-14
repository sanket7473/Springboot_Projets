package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudcendor")
public class CloudAPI {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {
        return cloudVendor;
//        return new CloudVendor("c1","vendo1","Himalaya","838938333");

    }

    @PostMapping
   public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor=cloudVendor;
        return "Cloud vendor displayed successfully";
    }

}
