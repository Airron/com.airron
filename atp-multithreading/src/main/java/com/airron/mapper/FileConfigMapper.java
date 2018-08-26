package com.airron.mapper;

import com.airron.vo.FileConfig;
import com.airron.vo.FileConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileConfigMapper {
    int countByExample(FileConfigExample example);

    int deleteByExample(FileConfigExample example);

    int deleteByPrimaryKey(Integer pfId);

    int insert(FileConfig record);

    int insertSelective(FileConfig record);

    List<FileConfig> selectByExampleWithBLOBs(FileConfigExample example);

    List<FileConfig> selectByExample(FileConfigExample example);

    FileConfig selectByPrimaryKey(Integer pfId);

    int updateByExampleSelective(@Param("record") FileConfig record, @Param("example") FileConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") FileConfig record, @Param("example") FileConfigExample example);

    int updateByExample(@Param("record") FileConfig record, @Param("example") FileConfigExample example);

    int updateByPrimaryKeySelective(FileConfig record);

    int updateByPrimaryKeyWithBLOBs(FileConfig record);

    int updateByPrimaryKey(FileConfig record);
}