package com.airron.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbParamContrastMapper;
import com.airron.mapper.WarnProPlanMapper;
import com.airron.mapper.WarnProjectMapper;
import com.airron.vo.TbParamContrast;
import com.airron.vo.TbParamContrastExample;
import com.airron.vo.WarnProPlan;
import com.airron.vo.WarnProject;
import com.airron.vo.TbParamContrast;
import com.airron.vo.WarnProjectExample;
import com.airron.vo.WarnProjectExample.Criteria;

@Service
public class WarningServiceImpl implements WarningService {
	
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
	
	public String Upload(int tb_no){
		
		//获取需要对应表格
		WarnProjectExample example = new WarnProjectExample();
		Criteria cri = example.createCriteria();
		cri.andWnTbNoEqualTo(tb_no);
		List<WarnProject> warnList= warnProjectMapper.selectByExample(example);
		//获取对应表格
		List<TbParamContrast> list = tbParamContrastService.listByTb_no(tb_no);
		int tb_size = list.size();
		//wesun_name  -- sys_name
		
		
		
		
		
		
		
		
		return null;
		
	}
	
	
	
	
	
}
