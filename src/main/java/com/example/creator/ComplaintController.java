package com.example.creator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "https://creator.zoho.in")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        return service.saveComplaint(complaint);
    }
    
    @GetMapping
    public List<Complaint> getAllComplaints() {
        return service.getAllComplaints();
    }



}
