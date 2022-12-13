package lambdas;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

public class FunctionalTest {

    public static void main(String[] args){


    Function<String, String> capitalize = tc -> tc.toUpperCase();
    Function<String, Integer> length = tc -> tc.length();
        System.out.println(capitalize.apply("toll collect"));
        System.out.println("Length of \"toll collect\" is: " + length.apply("toll collect"));
    }
}
