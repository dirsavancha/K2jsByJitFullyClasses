package com.k2js.excelreading.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountAllCellsinEachRow {
	private static Sheet s=null;
	static {
		try(FileInputStream fis=new FileInputStream("testdata/nttests.xls")) {
			Workbook wb=WorkbookFactory.create(fis);
			s=wb.getSheet("Sheet1");
			//or If we dont know sheet name we can give index as below
		}catch(IOException e) {
			
		}
		
	}
	public static void getAllRowsCellcount() {
		int rc=s.getPhysicalNumberOfRows();
		for(int i=1;i<rc;i++) {
			Row r=s.getRow(i);
			int cc=s.getPhysicalNumberOfRows();
			System.out.println(cc);
		}
		//IntStream.range(1,rc).forEach(x->System.out.println(s.getRow(x).getPhysicalNumberOfCells()));
	}
	
	// Read data from cell
	public static void readDataFromCell() {
		Row rw=s.getRow(0);
		Cell c=rw.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		getAllRowsCellcount();
		readDataFromCell();
	}
}
