package Projects;

import java.util.ArrayList;
import java.util.Collections;

public class SORTING_Arraylist {

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
        num.add(-40);
        num.add(32);
        num.add(4);
        num.add(-6);
        num.add(5);

        System.out.println("Initial array list: " + num);
        Collections.sort(num);
        System.out.println("SORTING THE ARRAY AT ASCENDING ORDER : " + num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println("SPRTING THE ARRAY AT DESCENDING ORDER : "+num);
    }

}
