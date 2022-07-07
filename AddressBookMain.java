package com.learning;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.addContactDetails();
        addressBook.addContactDetails();
        System.out.println(addressBook.contactList);

        addressBook.modifyContactDetails();
        System.out.println(addressBook.contactList);

        addressBook.removeContactDetails();
        System.out.println(addressBook.contactList);

        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContactDetails();
        addressBook1.addContactDetails();
        System.out.println(addressBook1.contactList);
        addressBook1.modifyContactDetails();
        System.out.println(addressBook1.contactList);
        addressBook1.removeContactDetails();
        System.out.println(addressBook1.contactList);
        
        Map<String, AddressBook> addressBookMap = new HashMap<>();
        addressBookMap.put("Book", addressBook);
        addressBookMap.put("Book1", addressBook1);
        System.out.println(addressBook);
        System.out.println(addressBook1);
        System.out.println(addressBookMap);

        List<ContactPerson> listContact1 = new ArrayList<>();
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook book = entry.getValue();
            List<ContactPerson> nameList =
                    book.contactList.stream().filter(x -> x.getName().equals("Sima"))
                            .collect(Collectors.toList());
            List<ContactPerson> nameList1 =
                    book.contactList.stream().filter(x -> x.getName().equals("Ridhima"))
                            .collect(Collectors.toList());
            listContact1.addAll(nameList);
            listContact1.addAll(nameList1);
        }
        System.out.println("Searched details are: " + listContact1);

        Map<String, List<ContactPerson>> cityMap = new LinkedHashMap<>();

        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook book = entry.getValue();
            book.contactList.stream().forEach(element -> {
                if (cityMap.containsKey(element.getCity())) {
                    List<ContactPerson> list = cityMap.get(element.getCity());
                    list.add(element);
                } else {
                    List<ContactPerson> list = new ArrayList<>();
                    list.add(element);
                    cityMap.put(element.getCity(), list);
                }
            });
        }
        System.out.println(cityMap);


        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook book = entry.getValue();
            long count = book.contactList.stream().filter(element -> element.getCity().equals("Nagpur")).count();
            System.out.println(count);
        }

        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook book = entry.getValue();
            book.contactList.stream().map(element -> element.getName()).
                    sorted().forEach(System.out::println);
        }

        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook book = entry.getValue();
            book.contactList.stream().map(element -> element.getZip()).
                    sorted().forEach(System.out::println);
        }
    }
}
