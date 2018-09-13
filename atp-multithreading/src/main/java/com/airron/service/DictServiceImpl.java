package com.airron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbDictExchangeMapper;
import com.airron.vo.TbDictExchange;
import com.airron.vo.TbDictExchangeExample;
import com.airron.vo.TbDictExchangeExample.Criteria;

@Service
public class DictServiceImpl implements DictService {

	@Autowired
	private TbDictExchangeMapper tbDictExchangeMapper;
	
	
	@Override
	public List<TbDictExchange> getByOthername(String othername) {
		// TODO Auto-generated method stub
		/*
		 * 按照项目名字精确查询
		*/
		TbDictExchangeExample example = new TbDictExchangeExample();
		Criteria cri = example.createCriteria();
		cri.andOtherNanmeEqualTo(othername);
		List<TbDictExchange> resultList = tbDictExchangeMapper.selectByExample(example);
		return resultList;
	}
	
	
}
