package r2ware.practice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import r2ware.practice2.func.Sum;

import java.net.Inet4Address;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class Practice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice2Application.class, args);
        Sum sum = new Sum() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

//        System.out.println(sum.add(1, 2));

        Sum sum2 = (x, y) -> x + 100 + y;
//        System.out.println(sum2.add(3, 2));

        Function<String, Integer> changeInt = str -> Integer.parseInt(str);
        Integer apply = changeInt.apply("100");
//        System.out.println("apply = " + apply);

        Consumer<String> print = (str) -> System.out.println("Hello" + str);

        Function<Integer,  Integer> xxx = x -> x + 100;

        BiFunction<Integer, Integer, Integer> sum3 = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> mul = (x, y) -> x * y;
        sum3.apply(10, 10);
        mul.apply(1, 10);

        System.out.println(Practice2Application.draw(xxx, 10));
        Function<Integer, Integer> yyy = y -> y + 1000;


    }

    public static Integer draw(Function<Integer, Integer> add, Integer i) {
        return add.apply(i);
    }

}


