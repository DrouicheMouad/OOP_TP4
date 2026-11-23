package tp4.exo3;

import java.util.ArrayList;

public class Cinema {
    private String name;
    private String address;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    
    public Cinema(String name, String address, ArrayList<Room> rooms, ArrayList<Customer> customers) {
		this.name = name;
		this.address = address;
		this.rooms = rooms;
		this.customers = customers;
	}
    public Cinema(String name, String address) {
		this.name = name;
		this.address = address;
	}
    public Cinema() { }
    
    
    public void addCustomer(Customer c) {
    	    customers.add(c);
    }
    public void addRoom(Room r) {
    	    r.setCinema(this);
    		rooms.add(r);
    }
    
    
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	public Customer findCustomer(int number) {
		for(Customer c : customers)
			if(c.getNumber()==number)
				return c;
		return null;
	}
	public void displayScreenings() {
	    for (Room r : rooms)
	        r.displayScreenings();
	}
	public boolean reserveSeat(int customerNum, int screeningNum) {
		if(findCustomer(customerNum)==null) {
			System.out.println("Customer not found, you have to register first");
			return false;
		}
		for(Room r : rooms) {
			for(Screening s : r.getScreenings()) {
				if(s.getNumber()==screeningNum)
					return s.reserveSeat(customerNum);
			}
		}
		return false;
	}	
}