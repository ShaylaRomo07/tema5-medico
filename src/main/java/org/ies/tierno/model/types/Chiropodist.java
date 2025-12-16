package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

public class Chiropodist extends Doctor {
    private String hospital;
    private int floor;

    public Chiropodist(String name, String surname, int licenseNumber, String[] patients, String hospital, int floor) {
        super(name, surname, licenseNumber, patients);
        this.hospital = hospital;
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("Podologo: " + surname + ", " + name + "     " + licenseNumber + ",");
        System.out.println("Del hospital: " + hospital);
        System.out.println("Piso: " + floor);
    }

    @Override
    public boolean isInHospital() {
        return true;
    }
}
