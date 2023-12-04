package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class columnsizeinrow {
	public static void main (String[] args) throws IOException{
		FileInputStream file = new FileInputStream ("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
	short colsize =	WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	System.out.println(colsize);
		
	}

}
