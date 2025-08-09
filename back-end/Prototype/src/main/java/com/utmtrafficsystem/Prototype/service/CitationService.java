package com.utmtrafficsystem.Prototype.service;

import com.utmtrafficsystem.Prototype.model.Citation;
import com.utmtrafficsystem.Prototype.repository.CitationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CitationService {
    private final CitationRepository citationRepository;

    public CitationService(CitationRepository citationRepository) {
        this.citationRepository = citationRepository;
    }

    public void addCitation(String matric, String citation_type, LocalDateTime citation_time, String address, byte[] violation_photo){
        citationRepository.addCitation( matric, citation_type, citation_time, address, violation_photo);
    }
    public List<Citation> getAllCitations(){
        return citationRepository.showAllCitations();
    }

}
