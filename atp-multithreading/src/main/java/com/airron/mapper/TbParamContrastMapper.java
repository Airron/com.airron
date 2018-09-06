package com.airron.mapper;

import com.airron.vo.TbParamContrast;
import com.airron.vo.TbParamContrastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbParamContrastMapper {
    int countByExample(TbParamContrastExample example);

    int deleteByExample(TbParamContrastExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(TbParamContrast record);

    int insertSelective(TbParamContrast record);

    List<TbParamContrast> selectByExample(TbParamContrastExample example);

    TbParamContrast selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") TbParamContrast record, @Param("example") TbParamContrastExample example);

    int updateByExample(@Param("record") TbParamContrast record, @Param("example") TbParamContrastExample example);

    int updateByPrimaryKeySelective(TbParamContrast record);

    int updateByPrimaryKey(TbParamContrast record);
}