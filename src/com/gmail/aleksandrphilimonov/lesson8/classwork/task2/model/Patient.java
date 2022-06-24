package com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;
    private Doctor doctor;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        if (treatmentPlan == 1) {
            this.treatmentPlan = TreatmentPlan.CODE_1;
            this.doctor = new Surgeon("unknown");
        } else if (treatmentPlan == 2) {
            this.treatmentPlan = TreatmentPlan.CODE_2;
            this.doctor = new Therapist("unknown");
        } else {
            this.treatmentPlan = TreatmentPlan.CODE_3;
            this.doctor = new Dentist("unknown");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void treatPatient() {
        this.doctor.treat();
    }
}
