package com.phonebook.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.phonebook.application.*;
public class DataManagement{
    HashMap<Integer,ContactPojo> contactMap=new HashMap<>();

    public void addNewEntry() {
        Scanner scan=new Scanner(System.in);

        int id=100;
        System.out.println("Enter the Number of Entries you wanna Add:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++) {
            ContactPojo contact=new ContactPojo();
            System.out.println("Enter the User ID:");
            contact.setUserID(scan.nextInt());
            System.out.println("Enter the Name:");
            scan.nextLine();
            contact.setName(scan.nextLine());
            System.out.println("Enter the Phone Number:");
            contact.setPhoneNumber(scan.nextLong());
            //System.out.println("Address:");
            System.out.println("Enter the Door Number:");
            contact.setDoorNo(scan.nextInt());
            System.out.println("Enter the Street Name:");
            scan.nextLine();
            contact.setStreetName(scan.nextLine());
            System.out.println("Enter the City Name:");
            contact.setCity(scan.nextLine());
            contactMap.put(contact.getUserID(), contact);
        }
    }

    public void updateEntry() {
        Scanner scan=new Scanner(System.in);
        ContactPojo contact=new ContactPojo();
        System.out.println("Enter the User ID:");
        int id=scan.nextInt();
        Map.Entry c=null;
        for(Map.Entry contactEntry: contactMap.entrySet()){
            if(contactEntry.getKey().equals(id)){
                c=contactEntry;
                break;
            }
        }
        if(c!=null){
            //scan.next();
            System.out.println("Enter the Name:");
            scan.nextLine();
            contact.setName(scan.nextLine());
            System.out.println("Enter the Phone Number:");
            //scan.nextLong();
            contact.setPhoneNumber(scan.nextLong());
            //System.out.println("Address:");
            System.out.println("Enter the Door Number:");
            contact.setDoorNo(scan.nextInt());
            System.out.println("Enter the Street Name:");
            scan.nextLine();
            contact.setStreetName(scan.nextLine());
            System.out.println("Enter the City Name:");
            contact.setCity(scan.nextLine());
            contactMap.put(contact.getUserID(), contact);
            System.out.println("Data Updated Successfully!!");
            }
        }

    public void deleteEntry() {
        ContactPojo contactPojo=new ContactPojo();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the User ID of the Entry you wanna delete:");
        int rem= scan.nextInt();
        contactMap.remove(rem);
    }

    public void printData() {
        //ContactPojo contact=new ContactPojo();
        //System.out.println("test");
        for(Map.Entry<Integer,ContactPojo> viewMap:contactMap.entrySet()){
            //System.out.println(viewMap.getKey()+"\n"+viewMap.getValue());
            System.out.println("User ID:"+viewMap.getKey());
            ContactPojo valueEntry=viewMap.getValue();
            System.out.println("Name:"+valueEntry.getName());
            System.out.println("Phone Number:"+valueEntry.getPhoneNumber());
            System.out.println("Door Number:"+valueEntry.getDoorNo());
            System.out.println("Street Name:"+valueEntry.getStreetName());
            System.out.println("City:"+valueEntry.getCity());

        }
    }

    public void searchData() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the UserID to Search: ");
        int id=s.nextInt();
        for(Map.Entry<Integer,ContactPojo> contact:contactMap.entrySet())
        {
            if(contact.getKey().equals(id)) {
                System.out.println("User ID:"+contact.getKey());
                ContactPojo valueEntry=contact.getValue();
                System.out.println("Name:"+valueEntry.getName());
                System.out.println("Phone Number:"+valueEntry.getPhoneNumber());
                System.out.println("Door Number:"+valueEntry.getDoorNo());
                System.out.println("Street Name:"+valueEntry.getStreetName());
                System.out.println("City:"+valueEntry.getCity());
            }
            System.out.println();
//            else{
//                System.out.println("Entry Not Found!");
//            }
        }
    }

    public void deleteAllEntries() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do You Want to Delete All the Entries?(Yes/No)");
        String choice=scan.next();
        if(choice=="Yes"||choice=="yes"){
            contactMap.clear();
        }
        else {
            System.out.println();
        }
    }
}

