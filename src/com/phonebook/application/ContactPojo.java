package com.phonebook.application;

public class ContactPojo {
    private String name;
    public static int userID=100;

    private String doorNo;
    private String streetName;

    private String city;
    private String phoneNumber;

    @Override
    public String toString() {
        return "ContactPojo{" +
                "name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
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


    ContactPojo(String name,int userID,String phoneNumber,String doorNo,String streetName,String city){
        this.name=name;
        this.userID=userID++;
        this.phoneNumber=phoneNumber;
        this.doorNo=doorNo;
        this.streetName=streetName;
        this.city=city;
    }
    public ContactPojo(){

    }
}
