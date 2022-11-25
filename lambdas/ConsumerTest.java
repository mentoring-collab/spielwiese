package lambdas;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {
    public static void main(String[] args) {


        Consumer<String> printTCProjects = System.out::println;
        Stream<String> koProjects = Stream.of("konz", "konka", "konmr");
        koProjects.forEach(printTCProjects);

    }

}
