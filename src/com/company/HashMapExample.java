package com.company;

import java.util.HashMap;

public class HashMapExample {
    public static  void main (String[] args){
        HashMap<String , String> sozluk = new HashMap<String, String>();
        sozluk.put("car","araba");
        sozluk.put("home", "ev");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk);
        System.out.println("--------------");
        //
        //
        sozluk.clone();
        System.out.println(sozluk);
        System.out.println("--------------");
        //
        //
        sozluk.remove("car");
        System.out.println(sozluk);
    }
}
