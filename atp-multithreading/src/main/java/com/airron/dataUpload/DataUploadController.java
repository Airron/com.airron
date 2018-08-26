package com.airron.dataUpload;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.airron.poi.excelutils.Excel_reader;
import com.airron.service.DataUploadService;
import com.airron.vo.TbDictExchange;

@RestController
public class DataUploadController {
	/*
	 * @autor airron
	 * @func:上传数据，接收excel文档
	*/
	
	@Autowired
	private DataUploadService dataUploadService;
	public String dataUpload(String tbName,File file) {
		//根据表名，获取数据：获取导入的数据对照表格
		List<TbDictExchange> tblist = dataUploadService.GetTbDictByName(tbName);
		//
		Excel_reader reader = new Excel_reader();
		try {
			List<Map<Integer, List<Cell>>> excelList = reader.excel_reader(file);
			
			for(int row=0;row<excelList.size();row++){
				
				
				
				//Class tbClass = Class.forName(tbName);
				//List<tbClass> tbList = new ArrayList();
				
				
				
				for(int cell=0;cell<excelList.get(0).size();cell++) {
					//excelList.get(0).get(cell)
				}
				
			}
		} catch (NullPointerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}
}
