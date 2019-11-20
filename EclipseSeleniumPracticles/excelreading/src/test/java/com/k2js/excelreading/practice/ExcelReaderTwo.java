package com.k2js.excelreading.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderTwo {
	private static Sheet s = null;
	static {
		try (FileInputStream fis = new FileInputStream("testdata/nttests.xls")) {
			Workbook wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");

		} catch (IOException e) {

		}
	}

	@DataProvider(name = "ntt")
	public static String[][] storeData(Method m) {
		String testcaseName = m.getName();
		List<String[]> allData = new ArrayList<>();
		final int rc = s.getPhysicalNumberOfRows();
		for (int ri = 0; ri < rc; ri++) {
			Row r = s.getRow(ri);
			String tcname = r.getCell(1).getStringCellValue();
			String tcstatus = r.getCell(2).getStringCellValue();
			if (tcname.equalsIgnoreCase(testcaseName) && tcstatus.equalsIgnoreCase("Yes")) {
				List<String> dc = new ArrayList<>();

				int cc = r.getPhysicalNumberOfCells();
				for (int ci = 3; ci < cc; ci++) {
					String data = r.getCell(ci).getStringCellValue();
					dc.add(data);
				}
				dc.add(ri + "");
				allData.add(dc.toArray(new String[0]));
			}

		}

		return allData.toArray(new String[0][0]);
	}

	@Test(dataProvider = "ntt", dataProviderClass = ExcelReader.class)
	public void verifyHomePageTitile(String... data) {
		System.out.println(Arrays.deepToString(data));

	}

	
}
