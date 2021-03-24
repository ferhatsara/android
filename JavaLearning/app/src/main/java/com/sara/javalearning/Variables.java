package com.sara.javalearning;

public class Variables {

    public static void main(String[] args){
        String name="Ferhat";
        String surname="Şara";
        String fullname=name+" "+surname;
        System.out.println(fullname);

        //Boolean
        boolean isAlive=true;
        isAlive=false;
        System.out.println(isAlive);

        //Final
        int myInteger=5;
        System.out.println("myInteger: "+ myInteger);
        myInteger=4;
        System.out.println("myInteger: "+ myInteger);

        final float pi=3.14f;

    }
}
