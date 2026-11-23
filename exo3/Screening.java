package tp4.exo3;

public class Screening {
    private int number;
    private String date;
    private String startTime;
    private Movie movie;
    private double ticketPrice;
    private int reservedSeats;
    private static int screeningsCount;
    private Room room;
    
	public Screening() {
		number=++screeningsCount;
	}
	public Screening(Room room, String date, String startTime, Movie movie, double ticketPrice, int reservedSeats) {
		this.date = date;
		this.startTime = startTime;
		this.movie = movie;
		this.ticketPrice = ticketPrice;
		this.reservedSeats = reservedSeats;
		this.room= room;
		number=++screeningsCount;
	}
	// In case we build a screening before building a room, use this cnstrctr then add the screening to the room
	public Screening(String date, String startTime, Movie movie, double ticketPrice) {
		this.date = date;
		this.startTime = startTime;
		this.movie = movie;
		this.ticketPrice = ticketPrice;
		this.reservedSeats = 0;
		number=++screeningsCount;
	}
	
	public boolean isFull() {
		return room.getCapacity()== reservedSeats;
	}
	public boolean reserveSeat(Customer customer){
		if(isFull()) {
			System.out.println("All seats are booked");
			return false;
		}
		if(customer.getsDiscount()) {
			System.out.println("Customer with number " + customer.getNumber() + " has a 5% discount");
			System.out.println("New ticket price " + ticketPrice*0.95);
		}
		System.out.println("Customer with number " + customer.getNumber() + " has booked successfully");
		reservedSeats++;
		return true;
	}
	public boolean reserveSeat(int customerNumber){
		Customer customer = room.getCinema().findCustomer(customerNumber);
		return reserveSeat(customer);
	}
	public void display() {
	    System.out.println("\nScreening #" + number);
	    System.out.println("Movie: " + movie.getTitle());
	    System.out.println("Room: " + room.getNumber());
	    System.out.println("Date: " + date + " at " + startTime);
	    System.out.println("Ticket price: " + ticketPrice);
	    System.out.println("Seats: " + reservedSeats + "/" + room.getCapacity());
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Room getRoom() {
		return room;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getReservedSeats() {
		return reservedSeats;
	}
	public void setReservedSeats(int reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	public static int getScreeningsCount() {
		return screeningsCount;
	}
}