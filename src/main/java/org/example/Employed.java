package org.example;

public class Employed extends Person {
    private String employedStudies;

    public Employed(String name, int age, String employedStudies){
        super(name,age);
        this.employedStudies = employedStudies;
    }

    public String getEmployedStudies() {
        return employedStudies;
    }

    public void setEmployedStudies(String employedStudies) {
        this.employedStudies = employedStudies;
    }
}
