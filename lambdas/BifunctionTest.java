package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BifunctionTest {


    public static void main(String[] args) {
        Double d = ((BiFunction<String, String, Integer>) String::indexOf)
                .andThen(Integer::doubleValue)
                .apply("toll", "collect");

        System.out.println(d);

        BifunctionTest tc = new BifunctionTest();

        List<String> list = Arrays.asList("dm", "konz", "konmr", "konka");

        List<String> result = tc.filterList(list, 3, tc::filterByLength);

        System.out.println(result);   // [node, java, javascript]

        List<String> result1 = tc.filterList(list, 3, (l1, size) -> {
            if (l1.length() > size) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result1);

        List<String> result2 = tc.filterList(list, "k", (l1, condition) -> {
            if (l1.startsWith(condition)) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result2);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result3 = tc.filterList(number, 2, (l1, condition) -> {
            if (l1 % condition == 0) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result3);

    }

    public String filterByLength(String str, Integer size) {
        if (str.length() > size) {
            return str;
        } else {
            return null;
        }
    }

    public <T, U, R> List<R> filterList(List<T> list1, U condition,
                                        BiFunction<T, U, R> func) {

        List<R> result = new ArrayList<>();

        for (T t : list1) {
            R apply = func.apply(t, condition);
            if (apply != null) {
                result.add(apply);
            }
        }

        return result;

    }

}

