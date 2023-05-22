package Assignment1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Task3 {
    public static void main(String[] args) {
        // predict
        Predicate<String>checkLength = str -> str.length () >5;
        System.out.println(checkLength.test("HelloWorld"));

        // function
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello World"));

        // consumer
        List<String> Fruits = Arrays.asList("Apples", "Oranges", "Grapes");
        Consumer<String> printFruit = fruit -> System.out.println(fruit);
        Fruits.forEach(printFruit);

        // supplier
        Supplier<String> message = () -> "Hello World!";
        System.out.println(message.get());

    }
}