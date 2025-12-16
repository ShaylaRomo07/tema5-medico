package org.ies.tierno.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Doctor {
    protected String name;
    protected String surname;
    protected int licenseNumber;
    protected String[] patients;

    public Doctor(String name, String surname, int licenseNumber, String[] patients) {
        this.name = name;
        this.surname = surname;
        this.licenseNumber = licenseNumber;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String[] getPatients() {
        return patients;
    }

    public void setPatients(String[] patients) {
        this.patients = patients;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return licenseNumber == doctor.licenseNumber && Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.deepEquals(patients, doctor.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, licenseNumber, Arrays.hashCode(patients));
    }

    public abstract void showInfo();
    public abstract boolean isInHospital();
}
