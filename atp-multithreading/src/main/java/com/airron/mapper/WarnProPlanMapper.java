package com.airron.mapper;

import com.airron.vo.WarnProPlan;
import com.airron.vo.WarnProPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarnProPlanMapper {
    int countByExample(WarnProPlanExample example);

    int deleteByExample(WarnProPlanExample example);

    int deleteByPrimaryKey(String wnProLockNo);

    int insert(WarnProPlan record);

    int insertSelective(WarnProPlan record);

    List<WarnProPlan> selectByExample(WarnProPlanExample example);

    WarnProPlan selectByPrimaryKey(String wnProLockNo);

    int updateByExampleSelective(@Param("record") WarnProPlan record, @Param("example") WarnProPlanExample example);

    int updateByExample(@Param("record") WarnProPlan record, @Param("example") WarnProPlanExample example);

    int updateByPrimaryKeySelective(WarnProPlan record);

    int updateByPrimaryKey(WarnProPlan record);
}