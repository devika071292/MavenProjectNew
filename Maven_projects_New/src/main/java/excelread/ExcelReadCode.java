package excelread;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReadCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException 
	{
	f =new FileInputStream("C:\\Users\\Devika\\Documents\\Excelreader.xlsx");//obj creation path of file 
	w=new XSSFWorkbook(f);//file in f and obj creation open work book
	sh = w.getSheet("Sheet1");//sheetname 
	Row r = sh.getRow(a);//row
	Cell c = r.getCell(b);//cell
	return c.getStringCellValue();
	

	
	}
	public static String getIntegerData(int a,int b) throws IOException 
	{
	f =new FileInputStream("C:\\Users\\Devika\\Documents\\Excelreader.xlsx");
	w=new XSSFWorkbook(f);
	sh = w.getSheet("Sheet1");
	Row r = sh.getRow(a);
	Cell c = r.getCell(b);
	int x = (int) c.getNumericCellValue();//it is method to get cell value(int) to type cast
	return String.valueOf(x);//to return integer value as string
	

	
	}
	

}