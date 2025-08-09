package com.utmtrafficsystem.Prototype.model;

public class Student {

    private String matric ;
    private String name ;
    private String faculty ;
    private int year ;
    private byte[] profile_photo;

    public Student(String matric, String name, String faculty, int year, byte[] profile_photo) {
        this.matric = matric;
        this.name = name;
        this.faculty = faculty;
        this.year = year;
        this.profile_photo = profile_photo;
    }

    public String getMatric() {
        return matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte[] getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(byte[] profile_photo) {
        this.profile_photo = profile_photo;
    }

    public Student() {
    }
}
