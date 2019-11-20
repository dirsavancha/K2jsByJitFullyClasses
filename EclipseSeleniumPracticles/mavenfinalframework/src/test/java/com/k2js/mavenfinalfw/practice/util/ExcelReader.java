package com.k2js.mavenfinalfw.practice.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	private static Sheet s = null;
	static {
		try (FileInputStream fis = new FileInputStream("testdata/nttests.xls")) {
			Workbook wb = WorkbookFactory.create(fis);
			System.out.println("Before Excel Sheet");
			// = wb.getSheet("Sheet1");
			s=wb.getSheetAt(0);

		} catch (IOException e) {

		}
	}
@DataProvider(name="ntt")
	public static String[][] getGivenTestCaseData(Method m) {
		String testcaseName=m.getName();
		List<String[]> allData = new ArrayList<>();
		final int rc = s.getPhysicalNumberOfRows();
		System.out.println("rc");
		for (int ri=0; ri<rc; ri++) {
			Row r = s.getRow(ri);
			String tcname = r.getCell(1).getStringCellValue();
			String tcstatus = r.getCell(2).getStringCellValue();
			if (tcname.equalsIgnoreCase(testcaseName) && tcstatus.equalsIgnoreCase("Yes")) {
				List<String> dc = new ArrayList<>();

				int cc = r.getPhysicalNumberOfCells();
				for (int ci=3; ci<cc; ci++) {
					String data = r.getCell(ci).getStringCellValue();
					dc.add(data);
					System.out.println(data+"\t");
				}
				System.out.println();
				System.out.println(ri);
				allData.add(dc.toArray(new String[0]));
			}

		}

		return allData.toArray(new String[0][0]);
	}

}

/*
 * public static void main(String... abc) {
 * 
 * System.out.println(Arrays.deepToString(getGivenTestCaseData(
 * "verifyConfirmationMessage"))); }
 */
/*
 * @Test(dataProvider="ntt",dataProviderClass=ExcelReader.class,retryAnalyzer=
 * FailRerun.class) //(1) and (2) public void verifyHomePageTitle(String...data)
 * { //(3) System.out.println(Arrays.deepToString(data)); }
 */
