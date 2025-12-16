package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

public class Surgeon extends Doctor {
    private String hospital;
    private int bayNumber;

    public Surgeon(String name, String surname, int licenseNumber, String[] patients, String hospital, int bayNumber) {
        super(name, surname, licenseNumber, patients);
        this.hospital = hospital;
        this.bayNumber = bayNumber;
    }

    @Override
    public void showInfo() {
        System.out.println("Cirujano: " + surname + ", " + name + "     " + licenseNumber + ",");
        System.out.println("En el box: " + bayNumber);
        System.out.println("Del hospital: " + hospital);
    }

    @Override
    public boolean isInHospital() {
        return true;
    }
}
