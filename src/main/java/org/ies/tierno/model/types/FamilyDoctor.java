package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

public class FamilyDoctor extends Doctor {
    private String nameCenter;

    public FamilyDoctor(String name, String surname, int licenseNumber, String[] patients, String nameCenter) {
        super(name, surname, licenseNumber, patients);
        this.nameCenter = nameCenter;
    }

    @Override
    public void showInfo() {
        System.out.println("Medico de familia: " + surname + ", " + name + "     " + licenseNumber + ",");
        System.out.println("Centro de salud: " + nameCenter);
    }

    @Override
    public boolean isInHospital() {
        return false;
    }
}
