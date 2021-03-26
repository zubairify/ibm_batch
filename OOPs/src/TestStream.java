import com.ibm.steam.Movie;
import com.ibm.steam.Series;
import com.ibm.steam.Subscription;
import com.ibm.steam.User;

public class TestStream {
	
	public static void main(String[] args) {
		Subscription sub = new Subscription();
		User u1 = new User("Polo", 17, "Male", 2000);
		User u2 = new User("Lili", 21, "Female", 150);
		User u3 = new User("Kim", 51, "Female", 00);
		
		Movie m1 = new Movie("Hangover", "Erotic", false);
		Movie m2 = new Movie("Evil Dead", "Horror", true);
		Movie m3 = new Movie("Avatar", "Action", false);
		
		Series s1 = new Series("GoT", "Erotic", false, 7, 10);
		Series s2 = new Series("LOST", "Action", false, 3, 10);
		
		
	}
}
