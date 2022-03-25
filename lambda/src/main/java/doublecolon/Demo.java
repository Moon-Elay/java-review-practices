package doublecolon;

public class Demo {
    public static void main(String[] args) {
// Reference to the static method
        Calculate s1 = (x,y)-> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2= Calculator :: findSum;
        s2.calculate(10,70);

        //Reference to instance methot
        Calculate m1= (x1, y1) -> new Calculator().findMultiply(x1, y1);
        m1.calculate(2,5);

        Calculate m2= new Calculator() :: findMultiply;
        m2.calculate(4,3);


    }

}
