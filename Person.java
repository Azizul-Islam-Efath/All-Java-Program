package com.mycompany.problme_solve;
import java.util.*;
public class Person {

    String name;
    int age;
    String address;
    private int NID;;
    
    public Person(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
        }
    
    public int getNID(){
    return NID;
       }
    public void setNID(int NID){
    this.NID=NID;
      }
    
    public void display_info(){
    
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(NID);
    
    }
   
}
