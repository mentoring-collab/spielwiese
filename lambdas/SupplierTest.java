package lambdas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.*;

public class SupplierTest {
    public static void main(String[] args) {

        List<String> project = List.of("dm", "konz", "konka", "konmr", "vdr");

        System.out.println(project.get(1));

        String client = "tc";
        double price = 659.50;

        BooleanSupplier boolSupplier = () -> client.length() == 10;
        IntSupplier intSupplier = () -> client.length() - 2;
        DoubleSupplier doubleSupplier = () -> price -20;
        LongSupplier longSupplier = () -> new Date().getTime();
        Supplier<String> supplier = () -> client.toUpperCase();
        Supplier<String> supplierLow = () -> client.toLowerCase();


        System.out.println(boolSupplier.getAsBoolean());
        System.out.println(intSupplier.getAsInt());
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(longSupplier.getAsLong());
        System.out.println(supplier.get());
        System.out.println(supplierLow.get());
    }
}
