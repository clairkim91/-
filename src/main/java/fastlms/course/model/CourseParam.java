package fastlms.course.model;

import com.zerobase.fastlms.common.model.CommonParam;
import lombok.Data;

@Data
public class CourseParam extends CommonParam {

    long id;//course.id
    long categoryId;

}
