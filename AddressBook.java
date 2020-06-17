package com.bridgelabz.addressbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static List<Person> record = new LinkedList<Person>();
    public static void main(String[]args){
        System.out.println("welcome to the address book");
       AddressBook obj = new AddressBook();
       int repeat=1;
        while(repeat==1) {
       Scanner choice = new Scanner(System.in);
           System.out.println("Enter the choice \n1 AddPerson \n2 ViewRecords \n3 EditInformation \n4 deleteRecord");
           int choice2 = choice.nextInt();
           switch (choice2) {
               case 1:
                   Person p = obj.addPerson();
                   boolean isPresent=false
                   for (Person p1:record) {
                       if((p.getFirstName()+ " " +p.getLastName()).equals(p1.getFirstName()+ " " +p1.getLastName())){
                           System.out.println("name already present");
                           isPresent=true;
                           break;
                       }

                   }
                   if(isPresent==false)
                   record.add(p);
                   break;
               case 2:
                   System.out.println("record view");
                   for(Person p1:record) {
                       System.out.println(p1);
                   }
                   break;
               case 3:
                   System.out.println("Edit the information");
                   System.out.println("Enter first and last Name");
                   Scanner input=new Scanner(System.in);
                   String name1=input.nextLine();
                   int listSize=record.size();
                   for (int i= 0; i<record.size();i++){
                       String name=record.get(i).getFirstName() + " " + record.get(i).getLastName();
                       if(name1.equals(name)==true){
                           System.out.println("Enter the choice \n1 State \n2 city \n3 zip \n4 phoneNumber");
                           int choice3=input.nextInt();
                           switch (choice3) {
                               case 1 :
                                   System.out.println("Enter the State");
                                   String state=input.next();
                                   record.get(i).setState(state);
                                   break;

                               case 2 :
                                   System.out.println("Enter the City");
                                   String city=input.next();
                                   record.get(i).setCity(city);
                                   break;

                               case 3 :
                                   System.out.println("Enter the Zip");
                                   String zip=input.next();
                                   record.get(i).setZip(zip);
                                   break;

                               case 4 :
                                   System.out.println("Enter the phoneNumber");
                                   String phoneNumber=input.next();
                                   record.get(i).setPhoneNumber(phoneNumber);
                                   break;

                               default:
                                   System.out.println("Invalid Choice");
                                   break;
                           }
                       }
                   }
                   break;

               case 4 :

                   System.out.println("Enter the Person first and last Name");
                   Scanner input1=new Scanner(System.in);
                  String name3=input1.nextLine();
                  // int listSize=record.size();

                   for (int i= 0; i<record.size();i++){
                       String name4=record.get(i).getFirstName() + " " + record.get(i).getLastName();
                       if(name3.equals(name4)==true){
                           record.remove(i);
                       }

                       }
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
