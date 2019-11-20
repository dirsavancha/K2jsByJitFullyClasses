// How to read data from cells
package com.k2js.excelreading.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromCell {
	private static Sheet s = null;
	static {
		try (FileInputStream fis = new FileInputStream("testdata/nttests.xls")) {
			Workbook wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");
			// or If we dont know sheet name we can give index as below
		} catch (IOException e) {

		}

	}

	// Read data from cell
	public static void readDataFromCell() {
		Row rw = s.getRow(0);
		// Cell c = rw.getCell(0);
		// String data = c.getStringCellValue();
		// System.out.println(data);
		// or
		String data1 = rw.getCell(0).getStringCellValue();// in a single line with our cell value as above

		System.out.println(data1);
	}

	public static void main(String[] args) {
		readDataFromCell();
	}

}
