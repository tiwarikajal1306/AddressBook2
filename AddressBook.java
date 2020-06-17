package com.bridgelabz.addressbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Person> record = new LinkedList<Person>();
    public static void main(String[]args){

        System.out.println("Welcome to addressBook");
       AddressBook obj = new AddressBook();
       int repeat=1;
        while(repeat==1) {
       Scanner choice = new Scanner(System.in);
           System.out.println("Enter the choice \n1 addPerson \n2 view \n3 edit ");
           int choice2 = choice.nextInt();
           switch (choice2) {
               case 1:
                   Person p = obj.addPerson();
                   record.add(p);
                   break;
               case 2:
                   System.out.println("record view");

                   System.out.println(obj.record);

                   break;
               case 3:
                   System.out.println("Edit the information");
                   break;
               default:
                   System.out.println("Invalid choice");
                   break;
           }
           System.out.println("To continue press 1 \n and for exit press any number ");
           repeat = choice.nextInt();

       }
        if (repeat != 1) {
            System.out.println("Exit");
        }

    }

    public Person addPerson(){
        Person p = new Person();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName=input.next();
        p.setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName=input.next();
        p.setLastName(lastName);
        System.out.println("Enter State");
        String state=input.next();
        p.setState(state);
        System.out.println("Enter City");
        String city=input.next();
        p.setCity(city);
        System.out.println("Enter zip");
        String zip=input.next();
        p.setZip(zip);
        System.out.println("Enter PhoneNumber");
        String phoneNumber=input.next();
        p.setPhoneNumber(phoneNumber);
        return p;
    }
}
