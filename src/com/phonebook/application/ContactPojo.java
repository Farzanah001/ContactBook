package com.phonebook.application;

public class ContactPojo {
    private String name;
    //private int userID;

    private String doorNo;
    private String streetName;

    private String city;
    private String phoneNumber;

    @Override
    public String toString() {
        return "ContactPojo{" +
                "name='" + name + '\'' +
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
       // this.userID=userID;
        this.phoneNumber=phoneNumber;
        this.doorNo=doorNo;
        this.streetName=streetName;
        this.city=city;
    }
    public ContactPojo(){

    }
}
