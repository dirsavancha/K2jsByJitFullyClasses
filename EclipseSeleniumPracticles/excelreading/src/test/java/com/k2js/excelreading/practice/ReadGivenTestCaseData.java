package com.k2js.excelreading.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadGivenTestCaseData {
	private static Sheet s = null;
	static {
		try (FileInputStream fis = new FileInputStream("testdata/nttests.xls")) {
			Workbook wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");
			// or If we dont know sheet name we can give index as below
		} catch (IOException e) {{
		}

	}
	
	public static void getGivenTestCaseData(String testcaseName) {
		final int rc=s.getPhysicalNumberOfRows();
		for(int ri=0;ri<rc;ri++) {
			Row r=s.getRow(ri);
			String tcname=r.getCell(1).getStringCellValue();
			String tcstatus=r.getCell(2).getStringCellValue();
			if(tcname.equalsIgnoreCase(testcaseName)&& tcstatus.equalsIgnoreCase("Yes")) {
				int cc=r.getPhysicalNumberOfCells();
				for(int ci=3;ci<cc;ci++) {
					String data=r.getCell(ci).getStringCellValue();
					System.out.println(data);
				}
				System.out.println(ri);
			}
		}
		
	}

	

}
	public static void main(String[] args) {
			}
}

