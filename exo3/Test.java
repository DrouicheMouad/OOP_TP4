package tp4.exo3;

public class Test {

	public static void main(String[] args) {

		// Movies
		Movie m1 = new Movie("Inception", 2010, "Christopher Nolan", "A thief enters people's dreams.");
		Movie m2 = new Movie("Interstellar", 2014, "Christopher Nolan", "A team travels through a wormhole.");
		Movie m3 = new Movie("Parasite", 2019, "Bong Joon-ho", "A poor family infiltrates a rich one.");

		// Cinema + rooms 
		Cinema cinema = new Cinema("Rex", "Sidi Bel Abbes");
		Room r1 = new Room(1, 50); //number + capacity
		Room r2 = new Room(2, 40);
		Room r3 = new Room(3, 1);
		cinema.addRoom(r1);
		cinema.addRoom(r2);
		cinema.addRoom(r3);

		// Screenings: 2 per room (early afternoon + early evening)
		r1.addScreening(new Screening("2026-11-25", "14:00", m1, 800));
		r1.addScreening(new Screening("2026-11-25", "18:00", m2, 900));
		r2.addScreening(new Screening("2026-11-25", "14:30", m2, 800));
		r2.addScreening(new Screening("2026-11-25", "18:30", m3, 900));
		r3.addScreening(new Screening("2026-11-25", "14:15", m3, 700));
		r3.addScreening(new Screening("2026-11-25", "18:15", m1, 700));

		// Customers
		Customer c1 = new Customer("Ali", 12);      // ordinary
		Customer c2 = new Customer("Sara", 30);     // gets the 5% discount
		cinema.addCustomer(c1);
		cinema.addCustomer(c2);

		// 1) all movies + screening info
		System.out.println("========= All screenings =========");
		cinema.displayScreenings();

		// 2) totals
		System.out.println("\n========= Totals =========");
		System.out.println("Customers: " + Customer.getCustomersCount());
		System.out.println("Screenings: " + Screening.getScreeningsCount());

		// 3) ordinary customer (by number)
		System.out.println("\n========= Ordinary customer =========");
		cinema.reserveSeat(c1.getNumber(), 1);

		// 4) customer with 30 screenings (by Customer object)
		System.out.println("\n========= Customer with 30 screenings =========");
		Screening s2 = r1.getScreenings().get(1);
		s2.reserveSeat(c2);

		// 5a) unsuccessful: non-existing customer
		System.out.println("\n========= Non-existent customer =========");
		cinema.reserveSeat(99, 1);

		// 5b) unsuccessful: fully booked screening (room 3, capacity 1)
		System.out.println("\n========= Fully booked screening =========");
		cinema.reserveSeat(c1.getNumber(), 5);   // fills the only seat
		cinema.reserveSeat(c2.getNumber(), 5);   // no seat left
	}
}