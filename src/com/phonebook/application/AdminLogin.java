package com.phonebook.application;

import java.util.HashMap;
import java.util.Scanner;
import com.phonebook.application.*;

public class AdminLogin {
    ContactPojo contact=new ContactPojo();
    static final String adminUser="Admin";
    static final String adminPassword="admin123";
    Scanner scan=new Scanner(System.in);
    DataManagement dataManagement=new DataManagement();
    public void Login() {
        System.out.println("Enter the Username:");
        contact.setName(scan.nextLine());
        System.out.println("Enter the Password:");
        String password=scan.nextLine();
        if(contact.getName().equals(adminUser) &&  password.equals(adminPassword)){
            System.out.println("Login Successful!");
            boolean end=true;
            while(end==true){
                System.out.println("\t1. Add New Entry");
                System.out.println("\t2. Edit Available Entry");
                System.out.println("\t3. View All the Entries");
                System.out.println("\t4. Search for an Entry");
                System.out.println("\t5. Delete Entry");
                System.out.println("\t6. Delete All Entries");
                System.out.println("\t7. Exit");
                System.out.println("Enter your Choice:");
                byte choice= scan.nextByte();
                switch (choice){
                    case 1:
                        dataManagement.addNewEntry();
                        break;
                    case 2:
                        dataManagement.updateEntry();
                        break;
                    case 3:
                        dataManagement.printData();
                        break;
                    case 4:
                        dataManagement.searchData();
                        break;
                    case 5:
                        dataManagement.deleteEntry();
                        break;
                    case 6:
                        dataManagement.deleteAllEntries();
                        break;
                    case 7:
                        end=false;
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
        else {
            System.out.println("Invalid Username or Password!");
        }

    }
}
