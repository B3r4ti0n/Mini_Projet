package com.B3r4ti0n;

public class Hospital {
    private String name;
    private String adresse;
    private String speciality;

    public Hospital(String name, String adresse, String speciality) {
        this.name = name;
        this.adresse = adresse;
        this.speciality = speciality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
