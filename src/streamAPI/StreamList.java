package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[]args){
        List<String> list = new ArrayList<>();
        list.add("Vaibhav");
        list.add("Priyal");
        list.add("Rahul");
        list.add("Rohini");
       System.out.println("With tradition approach:");
        for(String a:list){
            System.out.println(a);
        }
       System.out.println("With Java 8:");
        list.stream().forEach(System.out::println);


       list.stream().filter(i->i.startsWith("R")).forEach(System.out::println);
        List<Integer> intList = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<10;i++){
            intList.add(r.nextInt(100));
        }
       // System.out.println(intList.stream().count();
        System.out.println("Integer List:");
        intList.stream().forEach(System.out::println);
        System.out.println("Sorted Integer List:");
        intList.stream().sorted().forEach(System.out::println);
        intList.stream().sorted().collect(Collectors.toList());
        System.out.println("Reverse Sorted Integer List:");
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
