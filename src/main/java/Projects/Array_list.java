package Projects;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Array_list {

    public static void main(String[] args) {

        //to store arraylist
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        System.out.println("INITIAL SIZE = " + num.size());
        System.out.println(" ");
        System.out.println("TAKING ARRAY ELEMENTS: ");
        //adding elemnet
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(60);
        num.add(50);

        num1.add(90);
        num1.add(110);
        num1.add(550);
        num1.add(450);
        num1.add(605);
        num1.add(504);

        

        //1. System.out.println(" "+num);
        //2.FOR EACH
//num
        System.out.println("FIRST ARRAY LIST:");
        for (int x : num) {
            System.out.print(" " + x);
        }
        System.out.println(" ");
        System.out.println("SECOND ARRAY LIST:");
//num1
        for (int y : num1) {
            System.out.print(" " + y);
        }
        System.out.println(" ");
        System.out.println("THIRD ARRAY LIST:");
//num2
       num2.addAll(num);
        System.out.println(" "+num2);
        
        //             to check equality
        boolean o = num.equals(num2);
                System.out.println("NUM = NUM2 : "+o);
                
        /*3.ITERATOR METHOD
        Iterator sum = num.iterator();
        while(sum.hasNext()){
            System.out.print(" "+sum.next());
        }*/

        System.out.println(" ");

        System.out.println("NOW THE SIZE IS: " + num.size());
        System.out.println(" ");

        /*                       REMOVING AN ELEMENT
        num.remove(2);
        System.out.println("AFTER REMOVING AN ELEMENT: ");
        System.out.println(" " + num);
        System.out.println("NOW THE SIZE IS: " + num.size()); */
        System.out.println(" ");
        System.out.println(" ");
        /*                       REMOVE ALL method
        num.removeAll(num);
        System.out.println("AFTER REMOVING ALL:");
        System.out.println(" " + num);
        System.out.println("NOW THE SIZE IS: " + num.size()); */

 /*                     Isempty method
        boolean b=num.isEmpty();
        System.out.println("ARRAY LIST IS EMPTY: "+b);*/
        //                     contais method
        boolean c = num.contains(30);
        System.out.println("ARRAYLIST CONTAINTS 30 ? : " + c);

        //                      TO SEE INDEX
        int d = num.indexOf(30);
        System.out.println("INDEX OF 30 IS: " + d);

        //                     TO REPLACE ELEMENT
        int s = num.set(3, 101);
        System.out.println("THE NEW ARRAY IS : " + num);

        //                 TO GET ELEMENT
        int g = num.get(3);
        System.out.println("THE ELEMNT IS : " + g);

    }
}
