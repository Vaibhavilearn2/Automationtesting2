package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAlldatacoll {
	public static void main (String [] args)  throws IOException
	{
	FileInputStream file = new FileInputStream ("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
	Sheet sh =	WorkbookFactory.create(file).getSheet("Sheet1");
	 int lastRowIndex = sh.getLastRowNum();
	 for(int i=0;i<=lastRowIndex; i++)
	 {
		Cell data = sh.getRow(i).getCell(0) ;
	CellType S1	= data.getCellType();
	if(S1 ==CellType.STRING)
	{
		System.out.println(data.getStringCellValue());
	}
	else if (S1==CellType.NUMERIC)
	{
		System.out.println(data.getNumericCellValue());
		
	}
	else if (S1==CellType.BOOLEAN)
	{
		System.out.println(data.getBooleanCellValue());
	
 }
	 }

}
}
