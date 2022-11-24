import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenTest {

    public static void main(String[] args)
    {
        List<String> projects = Arrays.asList("dm", "konz", "konka", "konmr", "vdr");

        Consumer<List<String>> testConsumer = list -> {
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(2));
                list.set(1, "Toll Collect");
            }
        };
        Consumer<List<String>> printConsumer = list -> list.forEach(System.out::println);

        testConsumer.andThen(printConsumer).accept(projects);
    }


}
