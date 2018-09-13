package com.airron.mapper;

import com.airron.vo.TbDictExchange;
import com.airron.vo.TbDictExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDictExchangeMapper {
    int countByExample(TbDictExchangeExample example);

    int deleteByExample(TbDictExchangeExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(TbDictExchange record);

    int insertSelective(TbDictExchange record);

    List<TbDictExchange> selectByExample(TbDictExchangeExample example);

    TbDictExchange selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") TbDictExchange record, @Param("example") TbDictExchangeExample example);

    int updateByExample(@Param("record") TbDictExchange record, @Param("example") TbDictExchangeExample example);

    int updateByPrimaryKeySelective(TbDictExchange record);

    int updateByPrimaryKey(TbDictExchange record);
}