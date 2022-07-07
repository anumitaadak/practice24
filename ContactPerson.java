package com.learning;

public class ContactPerson {
    private String name;
    private int number;
    private String city;
    private String state;
    private int zip;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String personName) {
        name = personName;
    }

    public void setNumber(int contactNumber){
        number = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
