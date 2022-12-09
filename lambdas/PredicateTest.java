package lambdas;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> containsK = t -> t.contains("k");
        Predicate<String> containsO = t -> t.contains("o");
        System.out.println(containsK.or(containsO).test("dm"));
        System.out.println(containsK.or(containsO).test("konz"));
        System.out.println(containsK.or(containsO).negate().test("konmr"));
        System.out.println(containsK.or(containsO).test("konka"));
        System.out.println(containsK.or(containsO).negate().test("vdr"));

        int[] years = { 2000, 2016, 1978, 1856, 2022 };

        IntPredicate actual = n -> n >= 2000;

        Arrays.stream(years).filter(actual).forEach(System.out::println);
    }
}
