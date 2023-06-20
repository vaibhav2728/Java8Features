package skiplLimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo {

    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Limit::::");
        list.stream().limit(4).forEach(System.out::println);

        System.out.println("Skip::::");
        list.stream().skip(2).forEach(System.out::println);

        System.out.println("Skip::::Limit");
        list.stream().skip(2).limit(7).forEach(System.out::println);

        List<String> list1=Files.readAllLines(Paths.get("C:/Users/LENOVO/Desktop/Resume/CoverLetter.txt"));
        String s = Files.readString(Path.of("C:/Users/LENOVO/Desktop/Resume/CoverLetter.txt"));
        Files.writeString(Path.of("C:/Users/LENOVO/Desktop/Resume/CoverLetter.txt"),"Hello Java11", StandardOpenOption.CREATE);
        System.out.println(list1);
    }
}
