package com.example.creator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {

	@Autowired
    private ComplaintRepository repository;

    public Complaint saveComplaint(Complaint complaint) {
        return repository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }
}

