package lambda;

interface Calculator{
    public int sum(int a,int b);

}
public class CalculatorImpl{

    public static void main(String[] args) {
        Calculator c=(a,b)-> {
          return a+b;
        };
        c.sum(1,2);

    }


}
