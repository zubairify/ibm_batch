import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream3Demo {

	public static void main(String[] args) {
		Map<String, String> people = new HashMap<String, String>();
		people.put("Polo", "Pune");
		people.put("Mili", "Mumbai");
		people.put("Den", "Delhi");
		
		people.values().stream().forEach(System.out::println);
		List<String> cities = people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<String, List<String>>();
		contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Sean", Arrays.asList("2212-3534","5666-7888","8989-4040"));
		contacts.put("Ben", Arrays.asList("2112-3334","5633-1188","8090-2321"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
	}
}
