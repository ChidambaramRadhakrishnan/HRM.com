package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Provider {

	public String[][] xlsheet() throws IOException {
		FileInputStream flips = new FileInputStream(
				"C:\\Users\\Chidambaram\\OneDrive\\Documents\\GitHub\\HRM.com\\Resources\\loginsheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(flips);
		XSSFSheet sheet = wb.getSheet("login");
		int rowsCount = sheet.getPhysicalNumberOfRows();
		int colsCount = sheet.getRow(0).getLastCellNum();
		String[][] read = new String[rowsCount][colsCount];
		for (int i = 1; i <rowsCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colsCount; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter df = new DataFormatter();
				read[i - 1][j] = df.formatCellValue(cell);
			}
		}
		wb.close();
		return read;
	}

	@DataProvider(name = "dataProviders")
	public String[][] dataProviders() throws IOException {
		String[][] data = xlsheet();
		return data;
	}

}
