package Movie;

import java.util.Arrays;
import java.util.Scanner;


public class User {
	
	String name,city,theatre,movie,tickets[];
	int cost;
	
	
    User(){
    	this.name=getName();
    	this.city=getCity();
    	this.theatre=getTheatre();
    	this.movie=getMovie();
    	this.tickets=getTickets();
    	this.cost=getCost();
    	
    }

    public String getName(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Your Name: ");
		String uname=sc.nextLine();
		return uname;
    }
	public String getCity() {
		
		Main m=new Main();
		String city=m.findCity(Add_details.details);
		
		return city;
	}


	

	public String getTheatre() {
		City c=new City();
		String theatre=c.findTheatre(Add_details.details.get(city));
		return theatre;
	}


	

	public String getMovie() {
		Theater t=new Theater();
		String movie=t.findMovie(Add_details.details.get(city).get(theatre));
		return movie;
	}
	
	public String[] getTickets(){
		Booking b=new Booking(Add_details.details.get(city).get(theatre),movie);
		String arr[]=b.bookseats(Add_details.details.get(city).get(theatre).get(movie));
		return arr;
	}
	public int getCost(){
		Booking b=new Booking(Add_details.details.get(city).get(theatre),movie);
		int cost=b.generateCost(tickets.length);
		return cost;
	}

	@Override
	public String toString() {
		return "Name: "+name+"\nCity: "+city+"\nTheatre"+theatre+"\nMovie:"+movie+"\nSeats"+Arrays.toString(tickets)+"\nCost"+cost+"\n";
	}

	


	
}
