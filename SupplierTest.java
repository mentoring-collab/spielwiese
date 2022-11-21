import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        System.out.println("TC Projects\n");

        List<String> names = new ArrayList<>();
        names.add("dm");
        names.add("konz");
        names.add("konka");
        names.add("konmr");

        //Statement lambda can be replaced with expression lambda
        names.forEach((item)-> {
            printProjects(()-> item);
        });
    }

    private static void printProjects(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
