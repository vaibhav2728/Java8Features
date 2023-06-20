package optional;


import streamAPI.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String args[]){
        Customer customer = new Customer(1,null,30, Arrays.asList(123445,3243232));
        //empty
        //of
        //ofNullable
        Optional<Object> o1= Optional.empty();
        System.out.println(o1);
        //Optional<String> o2= Optional.of(customer.getName());
        //System.out.println(o2);
       Optional<String> o3= Optional.ofNullable(customer.getName());
        System.out.println(o3.orElse("Default"));

    }
}

