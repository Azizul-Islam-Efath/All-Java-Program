package Projects;

public class String_Java {
    public static void main(String[] args) {
        String s1 = " Azizul Islam";
        String s2 = " EFATH";    

        String[] name={"EFATH","MISHKA","MARIA"};
        System.out.println("PRINTING THE NAMES : ");
        for (int i=0;i<3;i++){
            System.out.println(name[i]);
        }
        
        System.out.println("S1 = "+s1+"\nS2 = "+s2);
        
        int len=s1.length();
        System.out.println("The length of the string is "+len);
         
        if(s1.equals(s2)){
        System.out.println("BOTH OF THEM ARE EQUALS");
        }
        else {
            System.out.println("DOESNT MATCH");
        }  
        
        boolean con=s2.contains("A");
        System.out.println("S2 CONTAINS A      ? :  "+con);
        
        boolean emp=s1.isEmpty();
        System.out.println("S1 is Empty        ? :  "+emp);
        
        boolean str=s1.startsWith("Z");
        System.out.println("S1 STARTS WITH Z   ? :  "+str);
        
        boolean en=s2.endsWith("H");
        System.out.println("S2 ENDS WITH H     ? :  "+en);
        
        String s3= s1.concat(s2);
        System.out.println("S3                   :  "+s3);
        
        String s4=s1.toUpperCase();
        System.out.println("THE UPPER S1 IS      :  "+s4);
        
        String s5 =s2.toLowerCase();
        System.out.println("THE LOWER S2 IS      :  "+s5);
        
        String s6=s3.toUpperCase();
        System.out.println("UPPER STRING IS : "+s6);
        
        char ch=s1.charAt(2);
        System.out.println("THE CHARACTER AT\nINDEX[2] IS          : "+ch);
        
        int point=s1.codePointAt(2);
        System.out.println("CODE POINT           :  "+point);
        
        int pos=s1.indexOf("I");
        System.out.println("POSITION OF I IS     :  "+pos );
        
        int ps=s1.lastIndexOf("I");
        System.out.println("LAST INDEX OF Z IS   :  "+ps);
        
        
        String s7=s6.replace("I","i");
        System.out.println("Replaced String      :  "+s7);
        
        System.out.println("THE SPLITTED STRING  :  ");
        String[] s8=s6.split(" ");
        for(String x : s8){
            System.out.println("                    "+x);
        }
    
        
    
    }
    
}
