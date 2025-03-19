package Projects;

public class Wrapper_class {
    public static void main(String[] args) {
       //   ** autoboxing(premitive to object)
      int x=30;
      Integer y = Integer.valueOf(x);
        System.out.println("y ="+y);
        
        
        // **
        // **Unboxing(Object to premitive)
        Double d= new Double (10.23);
        System.out.println("D= "+d);
        
        double e=d.doubleValue();
        System.out.println("E= "+e);
        
        //**
        
        //** Premitive to string-
        
        int i=100;
        
        String s = Integer.toString(i);
        System.out.println("S ="+s);
        
        //**
        
        boolean b = true;
        String a = Boolean.toString(b);
        System.out.println("A ="+a);
        
        //**
        
        //** String to premitive 
        
        String z = "32";
        double v = Double.parseDouble(z);
        System.out.println("V ="+z);
        
        //**
        
         
    }
    
}
