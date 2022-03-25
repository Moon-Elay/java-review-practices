import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CourseStream {
    private String courseName;
    private Integer courseId;

}
