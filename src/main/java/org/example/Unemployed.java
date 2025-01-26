package org.example;

public class Unemployed extends Person {
    private String unemployedStudies;

    public Unemployed(String name, int age, String unemployedStudies){
        super(name,age);
        this.unemployedStudies = unemployedStudies;

    }

    public String getUnemployedStudies() {
        return unemployedStudies;
    }

    public void setUnemployedStudies(String unemployedStudies) {
        this.unemployedStudies = unemployedStudies;
    }
}
