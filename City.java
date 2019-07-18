package Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class City {
	
	
    public  String findTheatre(HashMap<String,HashMap<String,ArrayList<String>>> city){
		
		Scanner sc = new Scanner(System.in);
		 Set<String> keys = city.keySet();
		 
		 System.out.println("Enter the theatre you want to book:");
	     
		 for(String key: keys){
	            System.out.println(key);
	        }
	    String choice = sc.next();
	    
	    return choice;
	   
	    //sc.close();
		
	}

}
