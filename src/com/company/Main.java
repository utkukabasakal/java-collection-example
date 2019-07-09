package com.company;
import  java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

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
    ArrayList <String> sehirler = new ArrayList<String>();
        sehirler.add("Sivas");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("İstanbul");
    for (String sehir:sehirler){
        System.out.println(sehir);
    }
    System.out.println("--------------");
    //
    //
    sehirler.remove(0);
    Collections.sort(sehirler);
    System.out.println(sehirler);
    //
    //
    ArrayList<Customer> customers = new ArrayList<Customer>();
    customers.add(new Customer(1, "Ali","Yıldız"));
    customers.add(new Customer(2, "Veli","Yılmaz"));
    customers.add(new Customer(3,"Ayse", "Koc"));
    for(Customer customer:customers){
        System.out.println(customer.number +" "+customer.firstName+" "+customer.lastName);
    }
    System.out.println("--------------");
    //
    //
        HashMap <String , String> sozluk = new HashMap<String, String>();
        sozluk.put("car","araba");
        sozluk.put("home", "ev");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk);
        System.out.println("--------------");
    //
    //
        for(String item: sozluk.keySet())
        System.out.println(item);
    }
}
