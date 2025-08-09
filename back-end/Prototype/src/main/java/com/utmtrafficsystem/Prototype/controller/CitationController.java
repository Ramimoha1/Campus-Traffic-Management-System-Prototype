package com.utmtrafficsystem.Prototype.controller;

import com.utmtrafficsystem.Prototype.model.Citation;
import com.utmtrafficsystem.Prototype.repository.CitationRepository;
import com.utmtrafficsystem.Prototype.service.CitationService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CitationController {
    private final CitationService citationService;
    CitationController(CitationService citationService) {
        this.citationService = citationService;
    }
    @PostMapping("/citations/new")
    public ResponseEntity<String> newCitation(
            @RequestParam(value = "matric", required = false) String matric,
            @RequestParam("citationType") String citationType,
            @RequestParam("citationTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime citationTime,
            @RequestParam("address") String address,
            @RequestParam("violationPhoto") MultipartFile violationPhoto) {
        try {
            byte[] photoBytes = violationPhoto.getBytes();

            citationService.addCitation(matric, citationType, citationTime, address, photoBytes);

            return new ResponseEntity<>("Citation created", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed to create citation", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/citations/viewall")
    public ResponseEntity<List<Citation>> newCitation()
    {

        try {
            List<Citation> citations = citationService.getAllCitations();
            return new ResponseEntity<>(citations, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();

        }
    }




}
