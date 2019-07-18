package Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Add_details {
	
	static HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> details=new HashMap<>();
	
	public void addCities(){
		
		System.out.println("Enter no of cities:");
		Scanner sc = new Scanner(System.in);
		int noofcities = sc.nextInt();
		
		for(int i = 1;i <= noofcities;i++){
			System.out.println("Enter city"+i+" name:");
		    details.put(sc.next(),addTheatres());
		}
		//sc.close();
	}
		public static HashMap<String,HashMap<String,ArrayList<String>>> addTheatres(){
			
			HashMap<String,HashMap<String,ArrayList<String>>> theatre = new HashMap<>();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter no. of theatres:");
			
			int nooftheatres = sc.nextInt();
			
			for(int i = 1;i <= nooftheatres;i++){
				System.out.println("Enter theatre"+i+" name:");
				theatre.put(sc.next(),addMovies());
			}
			//sc.close();
			
			return theatre;
		}
		 
		public static HashMap<String,ArrayList<String>> addMovies(){
			HashMap<String,ArrayList<String>> movie = new HashMap<>();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter no of movie:");
			
			int noofmovies = sc.nextInt();
			for(int i = 1;i <= noofmovies;i++){
				System.out.println("Enter movie"+i+" name:");
				String moviename = sc.next();
				System.out.println("Enter movie timing:");
				String timing = sc.next();
				System.out.println("Enter no of seats:");
				
				int seats=sc.nextInt();
				
				ArrayList<String> arr=new ArrayList<>();
				arr.add(timing);
				
				for(int j=1;j<=seats;j++){
					arr.add("T"+j);
				}
				movie.put(moviename,arr);
			}
			//sc.close();
			
			return movie;
			
		}

		@Override
		public String toString() {
			return "Add_details [details=" + details + "]";
		}
		

}
