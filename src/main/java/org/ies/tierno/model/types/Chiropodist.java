package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

import java.util.Objects;

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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chiropodist that = (Chiropodist) o;
        return floor == that.floor && Objects.equals(hospital, that.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, floor);
    }

    @Override
    public boolean isInHospital() {
        return true;
    }
}
