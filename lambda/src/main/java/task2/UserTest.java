package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    //Print all user in the list
    // Print all users that last name start with D

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("David", "Joe", 25));
        users.add(new User("David", "Doe", 25));
        users.add(new User("David", "Joe", 25));

        printName(users, p-> true);
        printName(users, p -> p.getLastName().startsWith("D"));


    }

    private  static  void printName(List<User> users, Predicate<User> p){
      for (User user: users){
          if (p.test(user)){
              System.out.println(user.toString());
          }
      }
    }

}
