package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

import java.util.Objects;

public class Surgeon extends Doctor {
    private String hospital;
    private int bayNumber;

    public Surgeon(String name, String surname, int licenseNumber, String[] patients, String hospital, int bayNumber) {
        super(name, surname, licenseNumber, patients);
        this.hospital = hospital;
        this.bayNumber = bayNumber;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getBayNumber() {
        return bayNumber;
    }

    public void setBayNumber(int bayNumber) {
        this.bayNumber = bayNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Surgeon surgeon = (Surgeon) o;
        return bayNumber == surgeon.bayNumber && Objects.equals(hospital, surgeon.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, bayNumber);
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
