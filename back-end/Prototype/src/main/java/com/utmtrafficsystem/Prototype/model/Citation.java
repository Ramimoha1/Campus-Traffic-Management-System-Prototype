package com.utmtrafficsystem.Prototype.model;


import java.time.LocalDateTime;
import java.util.UUID;

public class Citation {
    private UUID id ;
    private String matric;
    private String citation_type;
    private LocalDateTime citation_time ;
    private String address;
    private byte[] violation_photo;
    private boolean registered;


    public Citation() {
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public Citation(String matric, String citation_type, LocalDateTime citation_time, byte[] violation_photo, String address, boolean registered) {
        this.matric = matric;

        this.citation_type = citation_type;
        this.citation_time = citation_time;
        this.violation_photo = violation_photo;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMatric() {
        return matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }



    public String getCitation_type() {
        return citation_type;
    }

    public void setCitation_type(String citation_type) {
        this.citation_type = citation_type;
    }

    public LocalDateTime getCitation_time() {
        return citation_time;
    }

    public void setCitation_time(LocalDateTime citation_time) {
        this.citation_time = citation_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getViolation_photo() {
        return violation_photo;
    }

    public void setViolation_photo(byte[] violation_photo) {
        this.violation_photo = violation_photo;
    }
}
