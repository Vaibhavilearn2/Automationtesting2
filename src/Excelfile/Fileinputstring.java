package Excelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Fileinputstring {
	public static void main (String[]args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
  String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
  System.out.println(value);
	}

}