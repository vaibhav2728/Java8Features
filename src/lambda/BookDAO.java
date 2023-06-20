package lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getbookList(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"Java",100));
        list.add(new Book(2,"Spring",200));
        list.add(new Book(3,"Hibernate",300));
        list.add(new Book(4,"SpringBoot",400));
        return list;
    }
}
