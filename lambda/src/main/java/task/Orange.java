package task;
import lombok.*;

@Builder
@Data
public class Orange {
    private int weight;
    private Color color;




}

//@Builder generates an @AllArgsConst unless there is another @Xconst