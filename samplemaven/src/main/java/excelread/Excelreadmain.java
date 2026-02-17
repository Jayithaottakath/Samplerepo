package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadmain {
	static FileInputStream f;//inbuild class used to input an excel file.
	static XSSFWorkbook w;//inbuild class used to input a workbook
	static XSSFSheet s;//input class used to input a excell sheet
	
		public static String getStringData(int a,int b) throws IOException 
		{
			f=new FileInputStream("C:\\Users\\jayit\\Desktop\\Book1.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("Sheet1");//inbuild method used to get an excell sheet
			XSSFRow r=s.getRow(a);//XSSFRowinbuild class used to input a row,get rowinbild method used to get a row
			XSSFCell c=r.getCell(b);//XSSFCEllinbild class used to  input a cell,getcell is inbuild method used to get a cell
			return c.getStringCellValue();//inbuild method used to get a string value in a cell.
		}
		public static int getIntegerData(int a, int b) throws IOException
		{
			f=new FileInputStream("C:\\Users\\jayit\\Desktop\\Book1.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("Sheet1");//inbuild method used to get an excell sheet
			XSSFRow r=s.getRow(a);//XSSFRowinbuild class used to input a row,get rowinbild method used to get a row
			XSSFCell c=r.getCell(b);//XSSFCEllinbild class used to  input a cell,getcell is inbuild method used to get a cell
			//typecasting-conversion of data one data to another
			int var = (int) c.getNumericCellValue();//inbuild method used to get an numeric value in a cell
		    return var;
		}
		
		
		public static void main(String[] args) throws IOException 
		{
			System.out.println(Excelreadmain.getStringData(1, 0));
			System.out.println(Excelreadmain.getIntegerData(1, 1));
	}
		

}
