package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExcelDataProvider {
	
	
	XSSFWorkbook s;
	public ExcelDataProvider() throws Exception {
		
    String path="C:\\Users\\HP\\eclipse-workspace\\Framework\\Test_Data\\Excel1.xlsx";

    FileInputStream file=new FileInputStream(path);
    s=new XSSFWorkbook(file);

	}
	
	public String  getstringdata(String sheetname ,int row, int cell) {
		
    return s.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
	
	
	
}