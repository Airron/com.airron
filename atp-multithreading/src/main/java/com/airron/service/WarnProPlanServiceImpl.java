package com.airron.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.WarnProPlanMapper;
import com.airron.vo.WarnProPlan;

@Service
public class WarnProPlanServiceImpl implements WarnProPlanService {

	@Autowired
	private WarnProPlanMapper warnProPlanMapper;
	@Autowired
	private WarnProPlan warnProPlan;
	
	
	@Override
	public int insert(WarnProPlan warnProPlan) {
		// TODO Auto-generated method stub
		int result = warnProPlanMapper.insert(warnProPlan);
		
		
		return result;
	}

}
