package com.shivam.library.controller;

import com.shivam.library.model.Author;
import com.shivam.library.model.Book;
import com.shivam.library.model.Management;
import com.shivam.library.request.models.LoginRequest;
import com.shivam.library.responses.LoginResponse;
import com.shivam.library.service.ManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managements")
public class ManagementController {

    private final ManagementService managementService;

    public ManagementController(ManagementService managementService) {
        this.managementService = managementService;
    }

    @GetMapping
    public List<Management> getAllManagers() {
        return managementService.getAllManagers();
    }

    @PostMapping
    public void addManager(@RequestBody Management book) {
        managementService.addManager(book);
    }

    @PostMapping("/login")
    public LoginResponse getAuthorByEmail(@RequestBody LoginRequest request) {
        return managementService.getManagerByEmail(request);
    }

    /*
     * @PostMapping("/{id}/approve-publication")
     * public void approvePublication(@PathVariable("id") Long id) {
     * managementService.approvePublication(id);
     * }
     */
}
