package com.airron.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbDictExchangeMapper;
import com.airron.mapper.TbParamContrastMapper;
import com.airron.mapper.WarnProjectMapper;
import com.airron.vo.TbDictExchange;
import com.airron.vo.TbParamContrast;
import com.airron.vo.WarnProPlan;
import com.airron.vo.WarnProject;
import com.airron.vo.WarnProjectExample;
import com.airron.vo.WarnProjectExample.Criteria;


@Service
public class DataUploadServiceImpl implements DataUploadService{

	@Autowired
	private TbDictExchangeMapper tbDictExchangeMapper;
	
	@Autowired
	private WarnProjectMapper warnProjectMapper;
	@Autowired
	private WarnProject warnProject;
	@Autowired
	private TbParamContrastMapper tbParamContrastMapper;
	@Autowired
	private TbParamContrast TbParamContrast;
	@Autowired
	private TbParamContrastService tbParamContrastService;
	@Autowired
	private WarnProPlan warnProPlan;
	
	public String Upload_To_ProPlan(File file,String warn_type){
		//获取文件信息
		String fileName = file.getName();
		String filePath = file.getAbsolutePath();
		
		//获取需要对应表格
		WarnProjectExample example = new WarnProjectExample();
		Criteria cri = example.createCriteria();
		cri.andWnFnameEqualTo(warn_type);
		List<WarnProject> warnList= warnProjectMapper.selectByExample(example);
		//
		int tb_no = warnList.get(0).getWnTbNo();
		//获取对应表格
		List<TbParamContrast> list = tbParamContrastService.listByTb_no(tb_no);
		int tb_size = list.size();
		//wesun_name  -- sys_name
		
		
		
		
		
		
		
		
		return null;
		
	}
	
	

	@Override
	public List GetTbDictByName(int table_no) {
		// TODO Auto-generated method stub
		return null;
		
	}

}
