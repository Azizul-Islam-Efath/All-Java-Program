package com.mycompany.problme_solve;

public class Lecturer extends Faculty {
String sub;


public Lecturer(String name,int age,String address,String Faculty_Id,String sub){
super(name,age,address,Faculty_Id);
this.sub=sub;
}
public void teach(){

}


 public void display_info(){
    
     System.out.println("Name is:"+name+"\nAge :"+age+"\nAddress :"+address+"\nNID :"+getNID()+"\nFaculty ID :"+Faculty_Id+"\nSUBJECT :"+sub);
    
    }

}
