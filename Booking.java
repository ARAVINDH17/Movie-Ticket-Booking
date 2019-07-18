package Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Booking {
	
	HashMap<String,ArrayList<String>> theatre;
	String choice;
	
	Booking(HashMap<String,ArrayList<String>> theatre,String choice){
		
		this.theatre=theatre;
		this.choice=choice;
	}
	
	public String[] bookseats(ArrayList<String> totaltickets){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of tickets want to book: ");
		int tickets=sc.nextInt();
		String[] arr=new String[tickets];
		System.out.println("Enter the tickets need to be booked: ");
		
		for(int i=0;i<tickets;i++){
		    String ticket=sc.next();
			arr[i]=ticket;
			totaltickets.remove(ticket);
			
		}
		return arr;
		//sc.close();
}
	  public int generateCost(int size){
		  int cost=0;
		  for(int i=0;i<size;i++){
			  cost=cost+100;
		  }
		  return cost;
	  }
}
