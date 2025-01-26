package org.example;

import java.util.List;

public class Hobby{
    private String hobbyName;
    private int hobbyFrequency;
    private Address hobbyAddresses;


    public Hobby(String hobbyName, int hobbyFrequency, Address hobbyAddresses) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
        this.hobbyAddresses = hobbyAddresses;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getHobbyFrequency() {
        return hobbyFrequency;
    }

    public void setHobbyFrequency(int hobbyFrequency) {
        this.hobbyFrequency = hobbyFrequency;
    }

    public Address getHobbyAddresses() {
        return hobbyAddresses;
    }

    public void setHobbyAddresses(Address hobbyAddresses) {
        this.hobbyAddresses = hobbyAddresses;
    }

}
