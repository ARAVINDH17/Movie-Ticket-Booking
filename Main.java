package Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
	static ArrayList<User> user=new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Add_details a = new Add_details();
		a.addCities();
		boolean flag=false;
		int choice;
		
	 
		System.out.println(a);
		
		while(true){
		
		System.out.println("1.Book\n2.exit");
		
		choice=sc.nextInt();
		
		switch(choice){
		
		case 1:
		 
			User u=new User();
			user.add(u);
		    break;
		  
		case 2:
			
			flag=true;
			break;
			
		}
		if(flag){
			
			printChart();
			break;
		}
		
		}
		
		//sc.close();
	}
	public  String findCity(HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> cities){
		
		Scanner sc = new Scanner(System.in);
		 Set<String> keys = cities.keySet();
		 
		 System.out.println("Enter the city you want to book");
		 
	        for(String key: keys){
	            System.out.println(key);
	        }
	        
	    String choice = sc.next();
	  
	   //sc.close();
	    return choice;
	}
	public static void printChart(){
		Add_details a = new Add_details();
		System.out.println(a);
		for(int i=0;i<user.size();i++){
			User u=user.get(i);
			System.out.println(u);
			
		}
	}
}

