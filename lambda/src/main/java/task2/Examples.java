package task2;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
// Predicate

    /*    Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<18;
            }
        };

        lesserThan.test(50);

     */


        Predicate<Integer> lesserThan =  a -> a<18;
        //Implementation of test method that beleng to the Predicate Interface
        Boolean r= lesserThan.test(50);
        System.out.println(r);

        //Consumer

        Consumer<Integer> disp = i -> System.out.println(i);
        disp.accept(50);

        //BiConsumer

        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,300);

        // fUNCTION

        Function<String , String > fun = s-> "Hello "+ s;
        String str = fun.apply("Asi");
        System.out.println(str);

        // Suplier
        Supplier<Double> randomValue= ()-> Math.random();
        System.out.println(randomValue.get());

    }
}
