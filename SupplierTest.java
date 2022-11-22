import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        System.out.println("TC Projects\n");

        List<String> project = new ArrayList<>();
        project.add("dm");
        project.add("konz");
        project.add("konka");
        project.add("konmr");
        project.add("vdr");

        project.forEach((item)->
            printProjects(()-> item));
    }

    private static void printProjects(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
