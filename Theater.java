package Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Theater {
	

	
	 public String findMovie(HashMap<String,ArrayList<String>> theatre){
			
			Scanner sc = new Scanner(System.in);
			 Set<String> keys = theatre.keySet();
			 
			 System.out.println("Enter the movie you want to book:");
		     
			 for(String key: keys){
		            System.out.println(key+" "+theatre.get(key).get(0));
		           
		        }
		    String choice = sc.next();
		    
		    for(int i=1;i<theatre.get(choice).size();i++)
		    System.out.print(theatre.get(choice).get(i)+" ");
		    System.out.println();
		   
		  
		    return choice;
		   
		    //sc.close();
			
		}

	

}
