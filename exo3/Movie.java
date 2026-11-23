package tp4.exo3;

public class Movie {
    private String title;
    private int productionYear;
    private String director;
    private String synopsis;
    
	
	public Movie() {}
	public Movie(String title, int productionYear, String director, String synopsis) {
		this.title = title;
		this.productionYear = productionYear;
		this.director = director;
		this.synopsis = synopsis;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public void display() {
	    System.out.println("Title: " + title);
	    System.out.println("Year: " + productionYear);
	    System.out.println("Director: " + director);
	    System.out.println("Synopsis: " + synopsis);
	}
}