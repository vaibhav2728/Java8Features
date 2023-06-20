package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier {
    @Override
    public Object get() {
        return null;
    }
    public static void main(String[]args){
        Supplier<String> s= ()-> "Hello";
        System.out.println(s.get());
        List<String > list= Arrays.asList("a","b");
        System.out.println(list.stream().findAny().orElse("Empty String"));
    }
}
