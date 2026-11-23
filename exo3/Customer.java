package tp4.exo3;

public class Customer {
    private int number;
    private String name;
    private int attendedScreenings;
    private static int customersCount = 0;

	public Customer() {
		number = ++customersCount;	
	}
	public Customer(String name, int attendedScreenings) {
		this.name = name;
		this.attendedScreenings = attendedScreenings;
		number = ++customersCount;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendedScreenings() {
		return attendedScreenings;
	}
	public void setAttendedScreenings(int attendedScreenings) {
		this.attendedScreenings = attendedScreenings;
	}
	public static int getCustomersCount() {
		return customersCount;
	}
	public boolean getsDiscount() {
		return attendedScreenings >= 25;
	}
	
}