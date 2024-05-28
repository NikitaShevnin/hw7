package ru.gb.hw7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ResourceController {

    @GetMapping("public-data")
    public String getPublicData() {
        return "This is public data, accessible to all authenticated users.";
    }

    @GetMapping("private-data")
    public String getPrivateData() {
        return "This is private data, accessible only to users with the ADMIN role.";
    }
}

