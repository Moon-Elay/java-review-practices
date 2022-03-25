import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        //Creating Stream from Arrays
        String [] courses= {"Java", "JS", "TS"};
        Stream<String> coursesStream= Arrays.stream(courses);

        //Creating Stream from the Collection
        List<String> courseList= Arrays.asList("Java", "JS", "TS");
        Stream<String> courseStream2= courseList.stream();

List<CourseStream> myCourses = Arrays.asList(
        new CourseStream("Java", 100),
        new CourseStream("JS", 200)
);
Stream<CourseStream> myCourseStream = myCourses.stream();

//Creating Stream from Values
        Stream<Integer> stream= Stream.of(1,2,3,4);

    }

}
