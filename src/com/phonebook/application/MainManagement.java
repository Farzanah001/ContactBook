package com.phonebook.application;
//import com.phonebook.application.AdminLogin;
//import com.phonebook.application.DataManagement;

import java.util.Scanner;

public class MainManagement extends DataManagement{
    public static void main(String[] args) {
        AdminLogin adminLogin=new AdminLogin();
        DataManagement dataManagement=new DataManagement();
        Scanner scan=new Scanner(System.in);
        byte choice;
        do{
            System.out.println("\t\t\tADDRESS BOOK-MENU");
            System.out.println("1. Login as Admin");
            System.out.println("2. Search Contact");
            System.out.println("3. View All Entries");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice= scan.nextByte();
            switch (choice){
                case 1:
                    adminLogin.Login();
                    break;
                case 2:
                    dataManagement.searchData();
                    break;
                case 3:
                    dataManagement.printData();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while (choice<=4);
    }
}