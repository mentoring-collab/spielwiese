package Optional;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.empty();
        System.out.println("Konz is a TC Projekt");
        optional1
                .map(num -> Math.pow(num, 3))
                .ifPresent(System.out::println);
        System.out.println("dm is a TC Projekt");
        Optional<Integer> optional2 = Optional.of(3);
        optional2
                .map(num -> Math.pow(num, 3))
                .ifPresent(System.out::println);

    }

}