package streamAPI;

import java.util.List;

public class Customer {
    int id;
    String name;
    int age;
    List<Integer> phoneList;

    public Customer(int id, String name, int age, List<Integer> phoneList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneList = phoneList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Integer> phoneList) {
        this.phoneList = phoneList;
    }
}
