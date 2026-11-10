package tp4.exo2;

public class Test {
    public static void main(String[] args) {
    	
        Score s1 = new Score();
        Score s2 = new Score("Alice");
        Score s3 = new Score("Bob");

        System.out.println("========= Initial States ==========");
        s1.display();
        s2.display();
        s3.display();

        System.out.println("\n========= Modifying Scores =========");

        s1.setCurrentScore(-25);
        s1.display();
        
        s2.addPoints(45);
        s2.display();

        s3.addPoints(120);
        s3.display();
        
        System.out.println("\n========= Bob's max score is updated to 150 =========");
        s3.setMaxScore(150);
        s3.addPoints(120);
        s3.display();

  
    }
}