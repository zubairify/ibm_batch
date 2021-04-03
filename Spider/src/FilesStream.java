import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesStream {

	public static void main(String[] args) throws Exception {
		Stream<String> bands = Files.lines(Paths.get("src/bands.txt"));
//		List<String> baja = bands.collect(Collectors.toList());
//		baja.forEach(System.out::println);
		
//		bands.sorted().filter(b -> b.length() > 10).forEach(System.out::println);
		
		Stream<String> data = Files.lines(Paths.get("src/data.txt"));
//		System.out.println((int)data.filter(r -> r.length() > 5).count());
//		data.map(r -> r.split(","))
//			.filter(ar -> ar.length == 3)
//			.filter(ar -> Integer.parseInt(ar[1]) > 15)
//			.forEach(ar -> System.out.println(ar[0] + " " + ar[1] + " " + ar[2]));
		
		Map<String, Double> map = data.map(r -> r.split(","))
									.filter(ar -> ar.length == 3)
									.collect(Collectors.toMap(ar -> ar[0], ar -> 
										Double.parseDouble(ar[1]) + Double.parseDouble(ar[2])));
		
		for(String k : map.keySet())
			System.out.println(k + " = " + map.get(k));
	}
}
