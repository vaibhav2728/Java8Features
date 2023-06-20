package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate {
    public static void main(String[]args){
        Predicate<Integer> p= (a)->a%2==0?true:false;
        p.test(43);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
