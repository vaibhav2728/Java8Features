package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamCustumObject {
    public static void main(String[] args){
        System.out.println("Employee list start:");
        List<Employee> empList= Arrays.asList(
                new Employee(1,"Vaibhav","computer",50000),
                new Employee(2,"Priyal","MBA",850000),
                new Employee(3,"Rahul","Electronics",45000),
                new Employee(4,"Rohini","Finance",42000)
        );
        empList.stream().forEach(System.out::println);
        System.out.println("Employee list filter start:");
        empList.stream().filter(i->i.getSalary()>50000).forEach(System.out::println);
        System.out.println("Employee list sorting start:");
        empList.stream().sorted((i,j)->(j.getSalary()-i.getSalary())).forEach(System.out::println);
    }
}
