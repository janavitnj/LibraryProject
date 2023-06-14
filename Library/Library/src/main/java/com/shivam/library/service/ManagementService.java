package com.shivam.library.service;

import com.shivam.library.exception.ResourceNotFoundException;
import com.shivam.library.model.Author;
import com.shivam.library.model.Book;
import com.shivam.library.model.Management;
import com.shivam.library.repository.ManagementRepository;
import com.shivam.library.request.models.LoginRequest;
import com.shivam.library.responses.LoginResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {

    private final ManagementRepository managementRepository;

    public ManagementService(ManagementRepository managementRepository) {
        this.managementRepository = managementRepository;
    }

    public Management addManager(Management management) {
        return managementRepository.save(management);
    }

    public List<Management> getAllManagers() {
        return managementRepository.findAll();
    }

    public LoginResponse getManagerByEmail(LoginRequest request) {
        Management mgm = managementRepository.getManagementByEmail(request.email);
        if (request.password.equals(mgm.getPassword())) {
            return new LoginResponse(HttpStatus.ACCEPTED, "Login success", mgm.getManagerId());
        }
        return new LoginResponse(HttpStatus.NOT_FOUND, "Login failed", null);
    }
}
