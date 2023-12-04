package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getdatatypebyverify {

public static void main (String[] args) throws IOException{
	FileInputStream file = new FileInputStream ("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
	Cell data =	WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1);
	CellType S1 = data.getCellType();
	if(S1==CellType.STRING)
	{
		System.out.println(data.getStringCellValue());
	}
	else if(S1 == CellType.NUMERIC)
	{
		System.out.println(data.getNumericCellValue());
	}
	else if (S1 == CellType.BOOLEAN)
	{
		System.out.println(data.getNumericCellValue());
		
		
	}

}
}