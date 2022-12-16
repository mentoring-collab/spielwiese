package lambdas;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class FunctionalTest {

    public static void main(String[] args){

        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    Function<String, String> capitalize = tc -> tc.toUpperCase();
    Function<String, Integer> length = tc -> tc.length();
        System.out.println(capitalize.apply("toll collect"));
        System.out.println("Length of \"toll collect\" is: " + length.apply("toll collect"));
    }
}
