package fastlms.course.model;

import com.zerobase.fastlms.common.model.CommonParam;
import lombok.Data;

@Data
public class TakeCourseParam extends CommonParam {

    long id;
    String status;
    
    String userId;
    
    
    long searchCourseId;
}
