package reduce;

import streamAPI.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RreduceDemo {

    public static void main(String args[]){
        Integer sum= Stream.of(1,2,3,4,5).reduce(0,(a,b)->a+b);
        System.out.println(sum);
        Integer max= Stream.of(1,2,3,4,5,6).limit(2).reduce(0,(a,b)-> a>b?a:b);
        System.out.println(max);
        Integer max1= Stream.of(1,2,3,4,5,6).limit(2).reduce(Integer::max).get();
        System.out.println(max1);
        Integer h= Stream.of(1,2,3,4,5).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("2nd highest"+h);
        List<Employee> empList = Arrays.asList(
                new Employee(1,"Vaibhav","A",40000),
                new Employee(2,"Priyal","B",70000),
                new Employee(3,"Rohini","B",30000),
                new Employee(4,"Rahul","A",50000)
        );
       Double avg= empList.stream().filter(i->i.getGrade().equalsIgnoreCase("A"))
                .map(i->i.getSalary()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avg);
    }
}
