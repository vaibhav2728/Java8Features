package streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[]args){
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"Vaibhav");
        map.put(2,"Priyal");
        map.put(33,"Rahul");
        map.put(4,"Rohini");
        Map<Integer,Integer> map1= new HashMap<>();
        List<Map.Entry<Integer, Integer>> collect = map1.entrySet().stream().filter(i -> i.getValue() == 2).collect(Collectors.toList());
        System.out.println("Sort Map Java 8:");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("Sort Custom Map Java 8:");
        Map<Employee,Integer> empMap= new HashMap<>();
        empMap.put(new Employee(1,"Vaibhav","computer",50000),1);
        empMap.put(new Employee(2,"Priyal","MBA",850000),1);
        empMap.put(new Employee(3,"Rahul","Electronics",45000),1);
        empMap.put(new Employee(4,"Rohini","Finance",42000),1);
        empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);
        map.forEach((key,value)-> System.out.println("key:"+key+" value:"+value));
        map.entrySet().stream().forEach(i->System.out.println(i));
        map.entrySet().stream().filter(i->i.getKey()%2==0).forEach(System.out::println);
    }
}
