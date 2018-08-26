package com.airron.poi.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	/*
	 * @Author airron
	 * @Dependency 
	 * 						  <dependency>
							    <groupId>org.apache.poi</groupId>
							    <artifactId>poi-ooxml</artifactId>
							    <version>3.15</version>
							  </dependency>
							  
	 * @func excelutils:getCell excel_reader
	 * 
	*/
	
	public String getCell(File file,String sheet_name,int row1,int cell1) throws FileNotFoundException, IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		Workbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 2003版本
		} catch (Exception ex) {
			workbook = new XSSFWorkbook(new FileInputStream(file));// 2007版本
		}	
		Sheet sheet = workbook.getSheet(sheet_name);
		Row row = sheet.getRow(row1);
		
		/*if(cell != null){
            String cellValue = "";
            // 以下是判断数据的类型
            switch (cell.getCellType())
            {
                case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                    cellValue = cell.getNumericCellValue() + "";
                    break;

                case HSSFCell.CELL_TYPE_STRING: // 字符串
                    cellValue = cell.getStringCellValue();
                    break;

                case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                    cellValue = cell.getBooleanCellValue() + "";
                    break;

                case HSSFCell.CELL_TYPE_FORMULA: // 公式
                    cellValue = cell.getCellFormula() + "";
                    break;

                case HSSFCell.CELL_TYPE_BLANK: // 空值
                    cellValue = "";
                    break;

                case HSSFCell.CELL_TYPE_ERROR: // 故障
                    cellValue = "非法字符";
                    break;

                default:
                    cellValue = "未知类型";
                    break;
            }

            
        }*/
		return row.getCell(cell1).getStringCellValue();
	}
	public List<Map<Integer, List<Cell>>> excel_reader(File file) throws FileNotFoundException, IOException,NullPointerException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		Workbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 2003版本
		} catch (Exception ex) {
			workbook = new XSSFWorkbook(new FileInputStream(file));// 2007版本
		}
		//excel 最大长度65536   index{0,1,...,65535}
		if (file.exists()) {
			Sheet sheet = workbook.getSheetAt(0);
			List<Map<Integer, List<Cell>>> resultList = new ArrayList<Map<Integer, List<Cell>>>();
			Row row = sheet.getRow(0);// 获取第一行
			int row_first = sheet.getFirstRowNum();
			int row_last = sheet.getLastRowNum(); // 最大行数
			try{
				int cell_first = row.getFirstCellNum();
				int cell_last = row.getLastCellNum();
				System.out.println("cell_first:" + cell_first);
				System.out.println("cell_last:" + cell_last);
			}catch(Exception ex) {
				System.out.println("行首不能为空");
			}
			System.out.println("first_row:" + row_first);
			System.out.println("last_row:" + row_last);

			Map<Integer, List<Cell>> rowMap = new HashMap<Integer, List<Cell>>();
			//tag
			rowtag:
			for(int text_row_num=0;text_row_num<row_last+1;text_row_num++) {
				Row row_text = sheet.getRow(text_row_num);
				List<Cell> cellList = new ArrayList<Cell>();	
				for(int cell_num=0;cell_num<row_text.getLastCellNum();cell_num++) {
					if(row_text.getCell(cell_num)!=null) {
						Cell text_cell = row_text.getCell(cell_num);
						cellList.add(text_cell);
					}
					else
					{
						Cell text_cell = row_text.getCell(cell_num);
						text_cell.setCellValue("第"+text_row_num+1+"行数据源存在空值");
						cellList.add(text_cell);break rowtag;
					}
				}		
				rowMap.put(text_row_num, cellList);
			}
				resultList.add(rowMap);
				Cell ss = resultList.get(0).get(2).get(1);
				System.out.println(ss);
				return resultList;
		}		
		return null;
	}

}