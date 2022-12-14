package fastlms.member.mapper;


import com.zerobase.fastlms.admin.member.model.MemberParam;
import com.zerobase.fastlms.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    long selectListCount(MemberParam parameter);
    List<MemberDto> selectList(MemberParam parameter);

}
