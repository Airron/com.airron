package com.airron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbDictExchangeMapper;
import com.airron.vo.TbDictExchange;


@Service
public class DataUploadServiceImpl implements DataUploadService{

	@Autowired
	private TbDictExchangeMapper tbDictExchangeMapper;
	
	
	@Override
	public List GetTbDictByName(String name) {
		// TODO Auto-generated method stub
		List<TbDictExchange> tbList = tbDictExchangeMapper.getTbDictByName(name);
		return tbList;
	}

}
