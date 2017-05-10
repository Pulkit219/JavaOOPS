package polymorphism1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter the blog you wanna read from \n"
        		+ "1: Mashable \n" +  "2:Techreader");
        
        int choice =  Integer.parseInt(reader.readLine());
        Reader blogReader = null;
        
        switch(choice)
        
        {
        
        case 1:
        blogReader = new MashableReader();
        break;
        
        case 2:
            blogReader = new Techcrunchreader();
            break;
            
        default:
        	System.out.println("please enter an appropirate choice ");
        break;
        
        
        }
	}

}
