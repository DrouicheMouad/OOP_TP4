package tp4.exo3;

import java.util.ArrayList;

public class Room {
    private int number;
    private int capacity;
    private ArrayList<Screening> screenings = new ArrayList<Screening>() ;
    private Cinema cinema ;
    
    public Room(int number, int capacity) {
    	// didn't want to add Cinema as parameter cuz this will make room points to cinema but cinema still didn't have room in its rooms list
		this.number = number;
		this.capacity = capacity;
	}
    public void addScreening(Screening s) {
      	s.setRoom(this);
    		screenings.add(s);
    }
	public void setCinema(Cinema cinema) {
    	this.cinema = cinema;
    }
    public Cinema getCinema() {
    return cinema;
    }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public ArrayList<Screening> getScreenings() {
		return screenings;
	}
	public void setScreenings(ArrayList<Screening> screenings) {
		this.screenings = screenings;
	}
	public void displayScreenings() {
	    System.out.println("\n===== Room " + number + " =====\n");
	    if (screenings.isEmpty()) {
	        System.out.println("No screenings in this room.\n");
	        return;
	    }
	    for (Screening s : screenings) {
	        s.display();
	        System.out.println("-----");
	    }
	}
}