package tp4.exo1;

public class Point {

	private String name;
    private double x;
    private double y;
    private int ident;

    private static int counter = 0;

    public Point() {
        this.name = "Unknown";
        this.x = 0.0;
        this.y = 0.0;
        this.ident = ++counter; 
    }
    
    public Point(double x, double y) {
        this.name = "Unknown";
        setX(x);
        setY(y);
        this.ident = ++counter; 
    }
    
    public Point(String name, double x, double y) {
        setName(name); 
        setX(x);
        setY(y);
        this.ident = ++counter; 
    }
    
    public void display() {
        System.out.printf("Point #%d: %s - P(%.3f, %.3f)\n", ident, name, x, y);
    }

    public String toString() {
        return "Point " + name + " (" + x + ", " + y + ")";
    }

    public void move(double dx, double dy) {
        setX(this.x + dx);
        setY(this.y + dy);
    }
    
    public void move(Point p) {
        if (p != null) {
            this.x += p.x;
            this.y += p.y;
        }
    }

    public void moveX(double dx) {
        setX(this.x + dx);
    }

    public void moveY(double dy) {
        setY(this.y + dy);
    }
    
    public double distance(Point p) {
        if (p == null) return 0.0;
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
    public boolean equals(Point p) {
        if (p == null) return false;
        return this.x == p.x && this.y == p.y;
    }
    
    // Setters 
    public void setX(double x) {
        if (!Double.isFinite(x)) {
            System.out.println("Error: x cannot be NaN or infinity.");
        } else {
            this.x = x;
        }
    }

    public void setY(double y) {
        if (!Double.isFinite(y)) {
            System.out.println("Error: y cannot be NaN or infinity.");
        } else {
            this.y = y;
        }
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || !Character.isLetter(name.charAt(0))) {
            System.out.println("Error: the name must start with a letter.");
        } else {
            this.name = name;
        }
    }
    
    //Getters
    
    public int getIdent() {
        return ident;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public String getName() {
        return name;
    }
    
    public static int getIdentMax() {
     	return counter ;
    }
    
}