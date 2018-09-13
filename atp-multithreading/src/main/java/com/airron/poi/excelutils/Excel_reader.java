package com.airron.poi.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
	 * 
	 * @Dependency <dependency> <groupId>org.apache.poi</groupId>
	 * <artifactId>poi-ooxml</artifactId> <version>3.15</version> </dependency>
	 * 
	 * @func excelutils:getCell excel_reader
	 * 
	 */

	public String getCell(File file, String sheet_name, int row1, int cell1) throws FileNotFoundException, IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		Workbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 2003版本
		} catch (Exception ex) {
			workbook = new XSSFWorkbook(new FileInputStream(file));// 2007版本
		}
		Sheet sheet = workbook.getSheet(sheet_name);
		Row row = sheet.getRow(row1);
		Cell cell = row.getCell(cell1);
		
		
		
		return sheet_name;	
	}

	public List<Map<Integer, List<Cell>>> excel_reader(int sheetno, File file)
			throws FileNotFoundException, IOException, NullPointerException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		Workbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 2003版本
		} catch (Exception ex) {
			workbook = new XSSFWorkbook(new FileInputStream(file));// 2007版本
		}
		// excel 最大长度65536 index{0,1,...,65535}
		if (file.exists()) {
			// Sheet sheet = workbook.getSheetAt(0);
			List<Map<Integer, List<Cell>>> resultList = new ArrayList<Map<Integer, List<Cell>>>();

			// tag

			for (int text_sheet_num = 0; text_sheet_num < workbook.getNumberOfSheets(); text_sheet_num++) {
				Sheet sheet = workbook.getSheetAt(text_sheet_num);
				Row row = sheet.getRow(text_sheet_num);// 获取第一行
				int row_first = sheet.getFirstRowNum();
				int row_last = sheet.getLastRowNum(); // 最大行数
				int cell_first = row.getFirstCellNum();
				int cell_last = row.getLastCellNum();
				// System.out.println("NumberOfSheets:" +
				// workbook.getNumberOfSheets());
				// System.out.println("first_row:" + row_first);
				// System.out.println("last_row:" + row_last);
				// System.out.println("cell_first:" + cell_first);
				// System.out.println("cell_last:" + cell_last);
				Map<Integer, List<Cell>> rowMap = new HashMap<Integer, List<Cell>>();
				
				for (int text_row_num = 0; text_row_num < row_last + 1; text_row_num++) {
					Row row_text = sheet.getRow(text_row_num);
					List<Cell> cellList = new ArrayList<Cell>();
					for (int cell_num = 0; cell_num < cell_last; cell_num++) {
						/*
						 * if(row_text.getCell(cell_num)!=null) { Cell text_cell
						 * = row_text.getCell(cell_num);
						 * cellList.add(text_cell); } else { Cell text_cell =
						 * row_text.getCell(cell_num);
						 * text_cell.setCellValue("第"+text_row_num+1+"行数据源存在空值")
						 * ; continue; }
						 */
						try {
							Cell text_cell = row_text.getCell(cell_num);
							cellList.add(text_cell);

							 System.out.println(text_cell);
						} catch (Exception ex) {
							ex.printStackTrace();
							break;
						}
					}
					rowMap.put(text_row_num, cellList);
				}
				resultList.add(rowMap);
			}
			// Cell ss = resultList.get(0).get(2).get(1);
			// System.out.println(ss);
			return resultList;
		}
		return null;
	}

	/*
	 * public File excelmerge(File target, List<File> filelist) throws
	 * IOException { FileOutputStream fos = new FileOutputStream(target); File
	 * file = new File(
	 * "C:\\Users\\Administrator\\Desktop\\预警项目记录\\2018-09-04\\20180904补料申请单预警.xls"
	 * ); List<Map<Integer, List<Cell>>> s = excel_reader(0,file);
	 * InputStreamReader reader = new InputStreamReader(new
	 * FileInputStream(target)); Workbook workbook = null; try { workbook = new
	 * HSSFWorkbook(new FileInputStream(target));// 2003版本 } catch (Exception
	 * ex) { workbook = new XSSFWorkbook(new FileInputStream(target));// 2007版本
	 * } workbook.setSheetName(0, file.getName()); Sheet sheet =
	 * workbook.createSheet();
	 * 
	 * for (int i = 0; i < s.size(); i++) { Row row = sheet.createRow(i); for
	 * (int j = 0; j < s.get(i).size(); j++) { for (int k = 0; k <
	 * s.get(i).get(j).size(); k++) {
	 * 
	 * } } }
	 * 
	 * return target;
	 * 
	 * }
	 */

	// excel_reader2

}