package lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {


    public static void main(String[] args) {
         List<Book> list= new BookDAO().getbookList();
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        List<Book> list2= new BookDAO().getbookList();
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(list2);
        List<Book> list3= new BookDAO().getbookList();
        list3.stream().sorted(Comparator.comparing(Book::getName))
                .forEach(System.out::println);

    }


}

class MyComparator implements Comparator<Book>{


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}