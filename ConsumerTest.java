import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        List<String> tc = Arrays.asList("dm", "konz", "konka", "konmr", "vdr");
        forEach(tc, projects -> System.out.println(projects));

    }

    static <T> void forEach(List<T> tc, Consumer<T> consumer) {
        for (T t : tc) {
            consumer.accept(t);
        }
    }
}
