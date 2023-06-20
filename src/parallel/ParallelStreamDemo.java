package parallel;

import java.util.Date;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String [] args){
        /*long start= System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        long end= System.currentTimeMillis();
        System.out.println("Stream Time taken: "+(end-start));
        start= System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end= System.currentTimeMillis();
        System.out.println("Parallel Stream Time taken: "+(end-start));
       */
        IntStream.range(1,10).forEach(i->{
            System.out.println("Thread: "+Thread.currentThread()+" :"+i);
        });

        IntStream.range(1,10).parallel().forEach(i->{
            System.out.println("Thread: "+Thread.currentThread()+" :"+i);
        });
    }
}

