package com.sara.javalearning;




import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Arrays {
    public static void main(String[] args){
        String[] myStringArray=new String[3];
        myStringArray[0]="James";
        myStringArray[1]="Jamess";
        myStringArray[2]="Jamesss";

        System.out.println(myStringArray[1]);

        int[] myNumberArray= {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[0]);

        //Lists

        ArrayList<String> myMusicians= new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add("Rob");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.size());

        //Set: listeyle kullanımı aynıdır farkı ise örnek olarak james iki kere yazılsa bile bir kabul edilir.
        HashSet<String> mySet = new HashSet<String>();

        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap
        HashMap<String,String> myHashMap= new HashMap<String,String>();

        myHashMap.put("name","james");
        myHashMap.put("instrument","guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap= new HashMap<String, Integer>();

        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);
        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));



    }
}
