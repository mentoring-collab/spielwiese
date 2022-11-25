package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        List<String> tcProjects = Arrays.asList(
                "konz", "konka", "konmr", "dm", "vdr");
        Optional<List<String>> listOptional = Optional.of(tcProjects);

        int size = listOptional
                .map(List::size)
                .orElse(0);

        //assert size <= 5;

        if (size <= 5 )
        {
            System.out.println("Yes!");
        }

        else
        {
            System.out.println("Ooooh");
        }
    }


}
