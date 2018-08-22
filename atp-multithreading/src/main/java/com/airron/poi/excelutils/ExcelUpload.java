package com.airron.poi.excelutils;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2 * @Author: ponyWang
 * 3 * @Date: 2018/6/12 11:56
 * 4
 */
public class ExcelUpload {
    public List<Map> excelUpload(File file) throws IOException {
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(file));
        Workbook workbook = null;
        try {
            workbook = new HSSFWorkbook(new FileInputStream(file));//2003版本
        } catch (Exception ex) {
            workbook = new XSSFWorkbook(new FileInputStream(file));//2007版本
        }
        Sheet sheet =workbook.getSheetAt(0); //暂时只做了第一页
        int rowNum = sheet.getLastRowNum();//总行数
        Row row = sheet.getRow(0);//第一列
        Short cloumns = row.getLastCellNum();
        int cloumnNum = cloumns;//总列数

        List<String> header = new ArrayList();//表头数据
        for (int i = 0 ; i < cloumnNum ; i++){
            Cell cell = row.getCell(i);
            if (cell == null){
                //return "第"+i+1+"行表头不能为空";
                System.out.println("第"+i+1+"行表头不能为空");
            }
            header.add(cell.getStringCellValue());
        }
        List result = new ArrayList();
        //循环读取表格内容
        for (int j = 1 ;j < rowNum ; j++){
            List currentRow = new ArrayList();
            Map rowMap = new HashMap();
            for (int k = 0 ; k < cloumnNum ; k++){
                String key = header.get(k);
                Cell cell = sheet.getRow(j).getCell(k);
                if(cell != null){
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

                    rowMap.put(key,cellValue);
                }
            }
            currentRow.add(rowMap);
            result.add(currentRow);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        File  file = new File("C:\\Users\\Singing\\Desktop\\2017-04-16.xlsx");
        ExcelUpload instance = new ExcelUpload();
        List result= instance.excelUpload(file);
        System.out.println(result);
    }
}
