package com.airron.poi.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.graphbuilder.struc.LinkedList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;

public class Excel_reader {
	public LinkedList excel_reader(File file) throws FileNotFoundException, IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		Workbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 2003版本
		} catch (Exception ex) {
			workbook = new XSSFWorkbook(new FileInputStream(file));// 2007版本
		}

		if (file.exists()) {
			Sheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(0);// 获取第一行
			int row_first = sheet.getFirstRowNum();
			int row_last = sheet.getLastRowNum(); // 最大行数
			int cell_first = row.getFirstCellNum();
			int cell_last = row.getLastCellNum();

			System.out.println("first_row:" + row_first);
			System.out.println("last_row:" + row_last);
			System.out.println("cell_first:" + cell_first);
			System.out.println("cell_last:" + cell_last);
		
			
			//取表头
			for(int header_row_num = 0;header_row_num<row_last;header_row_num++){
				Row row_header = sheet.getRow(header_row_num);
				boolean closed = true;
				for(int i = 0;i<cell_last;i++){
					Cell cell_header = row_header.getCell(i);
					System.out.println("header"+i+":"+cell_header);
				}
				
				
				
			}
			
			
		}
		
			
		return null;
	}

}