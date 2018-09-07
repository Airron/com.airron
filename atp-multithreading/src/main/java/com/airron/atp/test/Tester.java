package com.airron.atp.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
/*		File directory = new File("");//参数为空 
		String courseFile = directory.getCanonicalPath() ; 
		System.out.println(courseFile);
 */
		
		File file = new File("D:\\用户目录\\我的文档\\My RTX Files\\g170780\\成型派工单与系统数据核查18.9.05号.xls");
		
		Excel_reader exr = new Excel_reader(); 
		List<Map<Integer, List<Cell>>> mapList2 = exr.excel_reader(0, file);
		mapList2.get(0).get(0).get(0);
		System.out.println(mapList2.get(0).get(86).get(9));

/*		File file = new File("C:\\Users\\Administrator\\Desktop\\预警项目记录\\2018-09-04\\20180904补料申请单预警.xls");
		
		Excel_reader exr = new Excel_reader(); 
		System.out.println(exr.getCell(file, "Sheet1", 3, 3));
		
		*/
		
		
		
/*		File file2 = new File("E:\\user\\private_share\\config\\erpconf.txt");
		String str = file2.getName();
		String[] s = str.split(".");
		int len = s.length;
		String type = s[0];
		System.out.println("#####"+file2.getName());
		System.out.println("type"+type);
		
		*/
/*		String path="C:\\Users\\Administrator\\Desktop\\预警项目记录\\2018-09-04\\";
		String[] ss= {"20180904不良材料入库单预警.xls","20180904其他入库申请单预警.xls","20180904其他出库申请单预警.xls","20180904存货类别为空预警.xls","20180904日清为处理预警（组装A）.xls","20180904日清为处理预警（组装B）.xls","20180904日清为处理预警（表处A）.xls","20180904日清为处理预警（表处B）.xls","20180904补料申请单预警.xls","20180904辅料采购申请未审核报警.xls","20180904辅料领用申请未审核报警.xls","20180904采购收货单预警.xls","20180904采购退货预警.xls","20180904采购送检单预警.xls"};
		List<File> filelist= new ArrayList();
		for(int i=0;i<ss.length;i++){
			File file3 = new File(path+ss[i]);
			filelist.add(file3);
		}
		File file = new File("C:\\Users\\Administrator\\Desktop\\预警项目记录\\test.xls");
		Excel_reader exr = new Excel_reader();
		if(!file.exists()){
			file.createNewFile();
			exr.excelmerge(file, filelist);
		}
		
		exr.excelmerge(file, filelist);*/
		
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
