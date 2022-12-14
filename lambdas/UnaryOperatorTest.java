package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main (String[] args){
        UnaryOperator<Integer> mal5 = i -> i * 5;
        UnaryOperator<Integer> plus5 = i -> i + 5;
        System.out.println("Value mal 5:" + mal5.apply(5));
        System.out.println("Value mal 5 plus 5:" + mal5.andThen(plus5).apply(4));
        System.out.println("Result:" +mal5.compose(plus5).apply(3));
    }
}
