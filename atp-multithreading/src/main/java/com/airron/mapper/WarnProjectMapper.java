package com.airron.mapper;

import com.airron.vo.WarnProject;
import com.airron.vo.WarnProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarnProjectMapper {
    int countByExample(WarnProjectExample example);

    int deleteByExample(WarnProjectExample example);

    int deleteByPrimaryKey(Integer wnFid);

    int insert(WarnProject record);

    int insertSelective(WarnProject record);

    List<WarnProject> selectByExampleWithBLOBs(WarnProjectExample example);

    List<WarnProject> selectByExample(WarnProjectExample example);

    WarnProject selectByPrimaryKey(Integer wnFid);

    int updateByExampleSelective(@Param("record") WarnProject record, @Param("example") WarnProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") WarnProject record, @Param("example") WarnProjectExample example);

    int updateByExample(@Param("record") WarnProject record, @Param("example") WarnProjectExample example);

    int updateByPrimaryKeySelective(WarnProject record);

    int updateByPrimaryKeyWithBLOBs(WarnProject record);

    int updateByPrimaryKey(WarnProject record);
}