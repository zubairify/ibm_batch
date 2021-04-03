import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2Demo {
	public static void main(String[] args) {
		String[] star = {"Cherry","Mango","Grapes","Apple","Banana","Stawberry","Papaya","Pineapple"};
		List<String> input = Arrays.asList(star);
		input.forEach(System.out::println);
		
		System.out.println("------");
		input.stream().sorted().forEach(System.out::println);
		
		System.out.println("------");
		input.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		System.out.println("------");
		input.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("------");
		input.stream().filter(str -> str.startsWith("P")).forEach(System.out::println);
		
		System.out.println("------");
		input.stream().filter(str -> str.contains("ple")).forEach(System.out::println);
		
		System.out.println("------");
		Stream.of("Anna","Sean","James","Bret").sorted().forEach(System.out::println);
		
		System.out.println(Arrays.stream(star).filter(s -> s.contains("p")).count());
	}
}
