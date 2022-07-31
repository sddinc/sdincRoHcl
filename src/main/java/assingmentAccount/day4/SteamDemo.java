package assingmentAccount.day4;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamDemo {

    public static void main(String[] args) {


        Stream<Integer> stream = Stream.of(14,18,63,70);

        stream.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {

                System.out.println(t);

            }


        });

        System.out.println("---------------------------------");
        stream = Stream.of(14,18,63,70);
        stream.forEach((ele)->System.out.println(ele));

        stream = Stream.of(14,18,63,70);
        int minValue = stream.min(new Comparator<Integer>() {

            @Override
            public int compare(Integer obj1, Integer obj2) {

                return obj1 - obj2;
            }

        }).get();

        System.out.println(minValue);


        stream = Stream.of(14,18,63,70);
        int result = stream.min((x,y)->(x-y) ).get();
        System.out.println(result);

    }//end of main



}
