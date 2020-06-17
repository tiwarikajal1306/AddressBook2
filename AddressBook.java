package com.bridgelabz.addressbook;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class AddressBook {
    public static void main(String[]args){
        System.out.println("Welcome to addressBook");
        List<String> record = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName=input.next();
        System.out.println("Enter last name");
        String lastName=input.next();
        System.out.println("Enter State");
        String state=input.next();
        System.out.println("Enter City");
        String city=input.next();
        System.out.println("Enter zip");
        String zip=input.next();
        System.out.println("Enter PhoneNumber");
        String phoneNumber=input.next();
        record.add(firstName);
        record.add(lastName);
        record.add(state);
        record.add(city);
        record.add(zip);
        record.add(phoneNumber);
/*
        Iterable itr = record.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next);
*/
     for(String detail:record)
         System.out.println(detail);



    }
}
