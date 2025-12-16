package org.ies.tierno.model;

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

    public abstract void showInfo();
    public abstract boolean isInHospital();
}
