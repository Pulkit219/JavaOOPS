package practicePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws IOException {
		

		
//		int line;
//		String input;
//		 
//		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		    
//		    try {
//		    	System.out.println("Please enter an ineteger\n");
//		    	input = br.readLine();
//		    	 line = Integer.parseInt(input);
//		    	 for(int i=0; i<line ; i++)
//				    {
//				    	System.out.println("hello");
//				    	
//				    }
//			} catch (Exception e) {
//				 System.out.println("Must enter a number!");
//		        
//				
//			}
		    
		while(true) {
			  Scanner input=new Scanner(System.in);
			  try {
			     System.out.println("ENTER A NUMBER: ");
			     int n = input.nextInt();
			     break;
			 }catch(InputMismatchException e) {
			   System.out.println("ERROR!!!");
			   input.next(); // eat some chars
			 }
			}
		  
		    

		  
		}

	}

