package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gettypeofdata {
	public static void main (String[] args) throws IOException{
		FileInputStream file = new FileInputStream ("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
		CellType s1 =	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
	System.out.println(s1);
		
	}

}
