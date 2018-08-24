package com.airron.atp.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;

import com.airron.poi.excelutils.ExcelUpload;
import com.airron.poi.excelutils.Excel_reader;
import com.graphbuilder.struc.LinkedList;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directory = new File("");//参数为空 
		String courseFile = directory.getCanonicalPath() ; 
		System.out.println(courseFile); 
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\成品出库流水.xls");
		
		
		
		Excel_reader exr = new Excel_reader(); 
		List<Map<Integer, List<Cell>>> mapList2 = exr.excel_reader(file);
		mapList2.get(0).get(0).get(0);
		System.out.println(mapList2.get(0).get(0).get(0));
		//System.out.println(exr.getCell(file, 124, 3));
		//List<Map> mapList = exr.excel_reader(file);
		//System.out.println(mapList.get(1).get(3));
//		for(int i=0;i<20;i++){
//			list.getHead();
//			list.size();
//		}
//		
	/*	ExcelUpload eud = new ExcelUpload();
		eud.excelUpload(file);
		
		ExcelUpload exp = new ExcelUpload();
				List<Map> mapList = exp.excelUpload(file);
				
		mapList.get(1).get(1);*/
//		
	}

}
