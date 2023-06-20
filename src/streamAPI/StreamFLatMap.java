package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFLatMap {
    public static void main(String [] args){
        List<Customer> custList = new ArrayList<>();
        custList.add(new Customer(1,"Vaibhav",30, Arrays.asList(123453,123434)));
        custList.add(new Customer(1,"Priyal",26, Arrays.asList(99868,78567)));
        custList.add(new Customer(1,"Rahul",35, Arrays.asList(54663,64675)));
        custList.add(new Customer(1,"Vaibhav",27, Arrays.asList(43453,576576)));

        System.out.println("Get age of all customers");
        custList.stream().map(i->i.getAge()).forEach(System.out::println);
        System.out.println("Get phone of all customers");
        custList.stream().map(i->i.getPhoneList()).forEach(System.out::println);
        custList.stream().flatMap(i->i.getPhoneList().stream()).forEach(System.out::println);
    }
}
