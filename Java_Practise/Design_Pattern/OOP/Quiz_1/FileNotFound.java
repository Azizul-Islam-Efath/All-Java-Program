package OOP.Quiz_1;

import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("Data.txt");
            file.read();
            file.close();
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }catch(IOException e){
            System.out.println("Input Output Exception Occured");
        }
        System.out.println("Program Executed.!");
    }
    
}
