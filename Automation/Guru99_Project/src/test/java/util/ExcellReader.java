package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	String filename;
	String sheetname;
	
	public ExcellReader(String filename, String sheetname) {
		super();
		this.filename = filename;
		this.sheetname = sheetname;
	}
	
	public int rowcount()
	{
		int row = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filename);
			XSSFSheet sheet =  workbook.getSheet(sheetname);
			row = sheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	
	public int colcount()
	{
		int col = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filename);
			XSSFSheet sheet =  workbook.getSheet(sheetname);
			col = sheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return col;
	}
	
	public String getData(int row, int col)
	{
		String data = null; 
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filename);
			XSSFSheet sheet =  workbook.getSheet(sheetname);
			data = sheet.getRow(row).getCell(col).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
