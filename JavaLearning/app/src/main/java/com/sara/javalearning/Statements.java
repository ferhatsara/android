package com.sara.javalearning;

public class Statements {
    private static int i;

    public static void main(String[] args){
        int x= 5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(y>x);
        y=30;
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x==y);
        System.out.println(x!=y);

        //and &&
        //or ||
        x=30;
        y=30;
        int z=5;
        System.out.println(x<y||z<y);

        //if statements
        if (x<y){
            System.out.println("y is bigger");
        }else if (y<x){
            System.out.println("x is bigger");
        }else if (x==y){
            System.out.println("x=y");
        }

        //switch
        int day =1;
        String dayString="";

        switch (day){
            case 1:
            dayString="Monday";
            break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Sunday";
        }


        //for loop

        int [] myNumbers= {12,15,18,21,24};

        for (i=0;i<myNumbers.length;i++){
            int sayi= myNumbers[i]/3*5;
            System.out.println(sayi);
        }

        for (int number: myNumbers){   //üstteki for ile aynı işlem.
            System.out.println(number/3*5);
        }


         //while loop
        int j=0;

        while (j<10){
            int m= j+10;
            System.out.println(m);
            j++;
        }
    }
}
