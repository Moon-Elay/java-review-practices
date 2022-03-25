import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(1,2,3,4,45,3,2);
     myList.forEach(System.out:: println);

     //Filter

        System.out.println("FILTER");

        myList.stream()
                .filter(i -> i%3 ==0)
                .distinct()
                .forEach(System.out::println);






    }


}
