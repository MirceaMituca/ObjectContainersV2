package org.example;

public class Address {
    private String adressName;
    private Country countryName;

    public Address(String adressName, Country countryName) {
        this.adressName = adressName;
        this.countryName = countryName;
    }

    public String getAdressName() {
        return adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName;
    }

    public Country getCountryName() {
        return countryName;
    }

    public void setCountryName(Country countryName) {
        this.countryName = countryName;
    }
}
