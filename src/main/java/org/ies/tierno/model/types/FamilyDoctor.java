package org.ies.tierno.model.types;

import org.ies.tierno.model.Doctor;

import java.util.Objects;

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

    public String getNameCenter() {
        return nameCenter;
    }

    public void setNameCenter(String nameCenter) {
        this.nameCenter = nameCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FamilyDoctor that = (FamilyDoctor) o;
        return Objects.equals(nameCenter, that.nameCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameCenter);
    }

    @Override
    public boolean isInHospital() {
        return false;
    }
}
