package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
      System.out.println("Printing:" +integer);
    }

    public static void main(String[]args){
        Consumer<Integer> c=(a)->System.out.println(a);
        c.accept(3);
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        list.stream().forEach(System.out::println);

    }
}
