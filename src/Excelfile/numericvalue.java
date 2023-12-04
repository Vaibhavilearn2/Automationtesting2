package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class numericvalue {
	public static void main (String[]args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
  boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
  System.out.println(value);
	}

}
