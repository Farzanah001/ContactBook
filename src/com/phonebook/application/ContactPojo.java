package com.phonebook.application;

public class ContactPojo {
    private String name;
    private int userID;



    private int doorNo;
    private String streetName;

    private String city;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    ContactPojo(String name, int userID, long phoneNumber, int doorNo, String streetName, String city){
        this.name=name;
        this.userID=userID;
        this.phoneNumber=phoneNumber;
        this.doorNo=doorNo;
        this.streetName=streetName;
        this.city=city;
    }
    public ContactPojo(){

    }
}
