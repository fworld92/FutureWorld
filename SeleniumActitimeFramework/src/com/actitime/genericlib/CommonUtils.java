package com.actitime.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Samsul
 *
 */
	public class CommonUtils {
	
		String propertPath="./testdata\\CommonData.properties";
		String excelPath="./testdata\\TestData.xlsx";
		
		/**
		 * 
		 * @param sheetName, rowNum, celNum
		 * @return string data based on user input
		 * @throws Throwable
		 * used to get the data from excel based on user input
		 */
		
		public String getExcelData(String sheetName,int rowNum,int celNum) throws Throwable{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			String data=row.getCell(celNum).getStringCellValue();
			wb.close();
			return data;
		}
		
		/**
		 * @return properties file object
		 * @throws Throwable
		 * using this object, we can load all the data from the file
		 */
		
		public Properties getPropertiesObj() throws Throwable{
			FileInputStream fis=new FileInputStream(propertPath);
			Properties pObj=new Properties();
			pObj.load(fis);
			return pObj;
		}
	}
