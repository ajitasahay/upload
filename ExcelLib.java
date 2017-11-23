package com.craftsvilla.generic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	public String getExcelData(String sheetName, int rowNum, 
            int colNum) throws Throwable{
FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(rowNum);
String data = row.getCell(colNum).getStringCellValue();
return data;
}
}
