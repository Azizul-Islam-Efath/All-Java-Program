package Projects;

import java.util.Scanner;

public class IDPASS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		      System.out.println("ENTER YOUR LOG IN INFO: ");
		int count=0;
                      for(int i = 1; i<=3; i++) {    //3 times chances...

			System.out.print("ENTER NAME: ");
			String name = input.next();
			
			System.out.print("PASSWORD: ");
			int pass = input.nextInt();
			
			if(name=="AZIZUL ISLAM" && pass == 125676) {
				System.out.println("Welcome SIR !..");
				break;
			}
                        else{
				System.out.println("Wrong pass or user name ");
                        count++;
                            System.out.println("YOU HAVE ATTEMPTED "+count+" TIMES ,ATTEMPT LEFT "+(3-count)+" TIMES ");
                        }
                        if(count==3)
                        {
                            System.out.println("SHUT THE FUCK UP YOU BULLSHIT!!!");
                        }
                }
		 
	}
}

  
