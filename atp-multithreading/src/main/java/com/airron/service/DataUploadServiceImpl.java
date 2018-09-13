package com.airron.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airron.mapper.TbDictExchangeMapper;
import com.airron.mapper.TbParamContrastMapper;
import com.airron.mapper.WarnProjectMapper;
import com.airron.vo.TbParamContrast;
import com.airron.vo.WarnProPlan;
import com.airron.vo.WarnProject;


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
	@Autowired
	private DictService dictService;
	
	//上传生产计划预警
	public String Upload_To_ProPlan(File file,String warn_type) throws IOException{
		
		/*
		 * 路径：路径前缀+日期路径+文件名
		 * 路径前缀：来自数据字典，根据项目名查询
		 * 日期路径：可选择，若数据字典中存在该项目日期路径，则使用数据字典中的路径，若不存在则获取当前日期作为路径
		 * 文件名：项目表中项目名的模糊查询
		*/
		
		String path = dictService.getByOthername("生产计划预警").get(0).getDictValue();
		String datePath = dictService.getByOthername("生产计划预警日期路径").get(0).getDictValue();
		if(datePath!=null){
			path = path+datePath+"\\";
		}
		else{
			SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
			String now = sd.format(new Date());
			path = path+now;
		}
		
		System.out.println(path);
		
		//获取该文件夹下文件名数组
		String[] filelist = file.list();
		//模糊查询遍历所有符合的文件
		for(int i=0;i<filelist.length;i++){
			String filename = filelist[i].substring(8, 15);
			
			//若文件名匹配项目，则开始执行上传
			if(filename.equals("生产计划预警")){
				File warnfile = new File(path+filelist[i]);
				InputStreamReader reader = new InputStreamReader(new FileInputStream(warnfile));
				Workbook workbook = null;
				try {
					workbook = new HSSFWorkbook(new FileInputStream(warnfile));// 2003版本
				} catch (Exception ex) {
					workbook = new XSSFWorkbook(new FileInputStream(warnfile));// 2007版本
				}
				Sheet sheet = workbook.getSheetAt(0);
				Row row = sheet.getRow(0);
				int lastrow = sheet.getLastRowNum();
				int realrow = lastrow-3;
				int lastcell = row.getLastCellNum();
				for(int row_num=0;row_num<realrow;row_num++){
					
					
					
				}
				
				
				Map warnmap = new HashMap();
				
				
			}
			
		}
		
		
		
		
		return null;
		
	}
	
	

	@Override
	public List GetTbDictByName(int table_no) {
		// TODO Auto-generated method stub
		return null;
		
	}

}
