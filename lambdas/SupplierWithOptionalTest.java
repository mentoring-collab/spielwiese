package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SupplierWithOptionalTest {

    public static void main(String[] args) {

        List<String> project = new ArrayList<>();
        project.add("dm");
        project.add("konz");
        project.add("konka");
        project.add(" ");
        project.add("konmr");
        project.add("vdr");

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("tc");
        Optional.ofNullable(name);

        if(name == null) {
            System.out.println(name.length());
        }
        Optional<String> optional = Optional.of("tc projects");
        String tc = optional.get();
        System.out.println(project.get(1));
        System.out.println(tc);
        System.out.println(name);
        System.out.println(nullName);
    }
}
