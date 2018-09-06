package com.airron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbParamContrastMapper;
import com.airron.vo.TbParamContrast;
import com.airron.vo.TbParamContrastExample;
import com.airron.vo.TbParamContrastExample.Criteria;



@Service
public class TbParamContrastServiceImpl implements TbParamContrastService {
	
	@Autowired
	private TbParamContrastMapper tbParamContrastMapper;
	@Autowired
	private TbParamContrast tbParamContrast;
	
	public List<TbParamContrast> listByTb_no(int tb_no) {
		TbParamContrastExample example =new TbParamContrastExample();
		Criteria cri = example.createCriteria();
		cri.andTbNoEqualTo(tb_no);
		List<TbParamContrast> resultList = tbParamContrastMapper.selectByExample(example);
		return resultList;
	}
}
