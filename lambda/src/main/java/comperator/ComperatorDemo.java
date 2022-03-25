package comperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComperatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5,8,10);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

Collections.sort(list, new MyComporator());
        System.out.println(list);


    }



}
