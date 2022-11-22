import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> containsA = t -> t.contains("k");
        Predicate<String> containsB = t -> t.contains("o");
        System.out.println(containsA.or(containsB).test("dm"));
        System.out.println(containsA.or(containsB).test("konz"));
        System.out.println(containsA.or(containsB).negate().test("konmr"));
        System.out.println(containsA.or(containsB).test("konka"));
        System.out.println(containsA.or(containsB).negate().test("vdr"));

        int[] years = { 2000, 2016, 1978, 1856, 2022 };

        IntPredicate actual = n -> n >= 2000;

        Arrays.stream(years).filter(actual).forEach(System.out::println);
    }
}
