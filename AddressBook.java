package com.learning;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

    List<ContactPerson> contactList = new ArrayList<>();

    public void addContactDetails(){

        ContactPerson contactPerson = new ContactPerson();

        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter contact number");
        int number = scanner1.nextInt();

        System.out.println("Enter city");
        Scanner scanner2 = new Scanner(System.in);
        String city = scanner.next();

        System.out.println("Enter zip");
        int zip = scanner1.nextInt();

        System.out.println("Enter state");
        String state = scanner1.next();

        contactPerson.setName(name);
        contactPerson.setNumber(number);
        contactPerson.setCity(city);
        contactPerson.setState(state);
        contactPerson.setZip(zip);

        System.out.println(contactPerson.getName());

        contactList.add(contactPerson);

    }

    public void removeContactDetails() {
        System.out.println("Enter the name of person you want to delete ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (ContactPerson contactPerson : contactList) {
            if (contactPerson.getName().equals(name)) {
                contactList.remove(contactPerson);
                break;
            }
        }


        System.out.println("Modified list: " + contactList);
    }
    public void modifyContactDetails() {
        System.out.println("Enter the name of person you want to edit ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println(" list: "+contactList);

        for(ContactPerson contactPerson : contactList) {
            if(contactPerson.getName().equals(name)){
                contactPerson.setName("Sima");
                break;
            }
        }
        System.out.println("Modified list: "+contactList);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return contactList.equals(that.contactList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactList);
    }

    List<ContactPerson> contactList2 = contactList.stream()
            .filter(p -> p.getName() == name)// filtering data
            .map(p->p.getName())        // fetching price
            .collect(Collectors.toList()); // collecting as list
        System.out.println(contactList2);*/



    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }
}
