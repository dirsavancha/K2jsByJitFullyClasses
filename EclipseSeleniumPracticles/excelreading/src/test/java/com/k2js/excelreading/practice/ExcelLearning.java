package com.k2js.excelreading.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLearning {
	private static Sheet s=null;
	static {
		try(FileInputStream fis=new FileInputStream("testdata/nttests.xls")) {
			Workbook wb=WorkbookFactory.create(fis);
			s=wb.getSheet("Sheet1");
			//or If we dont know sheet name we can give index as below
			//wb.getSheetAt(0);
		}catch(IOException e) {
			
		}
	}
	
	public static void getRowCount() {
		int rc=s.getPhysicalNumberOfRows();
		System.out.println(rc);
	}
	public static void main(String[] args) {
		getRowCount();
		getRowCellCount();
	}
	public static void getRowCellCount() {
		Row r=s.getRow(0);
		int cc=r.getPhysicalNumberOfCells();
		System.out.println(cc);
	}
	
	

}
