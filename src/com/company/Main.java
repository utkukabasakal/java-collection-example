package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	ArrayList sayilar = new ArrayList();

	sayilar.add(58);
	sayilar.add(345);
	sayilar.add(285);

        for(Object i:sayilar){
            System.out.println(i);
        }
        System.out.println("--------------");
	System.out.println(sayilar.size());
	System.out.println("--------------");
    //
	//
    sayilar.set(2,250);
    System.out.println(sayilar.get(2));
    System.out.println("--------------");
    //
    //
    sayilar.remove(0);
    System.out.println(sayilar.get(0));
    System.out.println("--------------");
    //
    //

    ArrayList<Customer> customers = new ArrayList<Customer>();
    customers.add(new Customer(1, "Ali","Yıldız"));
    customers.add(new Customer(2, "Veli","Yılmaz"));
    customers.add(new Customer(3,"Ayse", "Koc"));
    for(Customer customer:customers){
        System.out.println(customer.getNumber()+" "+customer.getFirstName()+" "+customer.getLastName());
    }
    }
}