package com.airron.atp.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.airron.poi.excelutils.Excel_reader;
import com.graphbuilder.struc.LinkedList;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directory = new File("");//参数为空 
		String courseFile = directory.getCanonicalPath() ; 
		System.out.println(courseFile); 
		
		File file = new File("E:/user/my_doc/tencent/wechat/WeChat Files/Aricocolo/Files/系统2018.08.22.xls");
		
		
		
		Excel_reader exr = new Excel_reader(); 
		LinkedList list = exr.excel_reader(file);
		System.out.println(list.size());
//		for(int i=0;i<20;i++){
//			list.getHead();
//			list.size();
//		}
//		
//		ExcelUpload eud = new ExcelUpload();
//		eud.excelUpload(file);
		
		
	}

}
