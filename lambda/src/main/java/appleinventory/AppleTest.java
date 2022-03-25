package appleinventory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(Color.Green, 300));
        inventory.add(new Apple(Color.Red, 100));
        inventory.add(new Apple(Color.Green, 200));
        inventory.add(new Apple(Color.Red, 50));



//        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
//        System.out.println(heavyApple);
//
//        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
//        System.out.println(greenApple);


        List<Apple> greenApple = filterApples(inventory, apple -> apple.getColor().equals(Color.Green) );
        System.out.println(greenApple);



    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//
//        return result;
//    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate) {

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }


}