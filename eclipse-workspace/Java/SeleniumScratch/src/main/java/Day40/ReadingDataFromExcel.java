package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
	
//Excel file--workbook--sheets--rows--cells
		
//FileInputStream -reading
//FileOutputSrtream -writing
		
//XSSFWorkbook  --workbook, XSSFSheet--sheet ,XSSFRow--row ,XSSFCell-cell
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");  //getShhetAt(index)
	
	int TotalRows=sheet.getLastRowNum();
	
	int Totalcells=sheet.getRow(1).getLastCellNum();

	System.out.println("number of rows:"+ TotalRows);//5 counting from 0
	System.out.println("number of cells:"+ Totalcells); //4 counting from 1
	
		
	for(int r=0;r<=TotalRows;r++)
   {
		XSSFRow currentrow=sheet.getRow(r);
		
		for(int c=0;c<Totalcells;c++)
		{
			XSSFCell currentCell=currentrow.getCell(c);
			System.out.print(currentCell.toString()+"\t");
		}
		System.out.println();
	}
	
	workbook.close();
		
		/*FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("no of rows"+totalrow);
		System.out.println("no of column"+totalcell);
		
		
		
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<totalcell;c++)
			{
				XSSFCell currentcell=currentrow.getCell(c);
				System.out.println(currentcell.toString()+"\t");
			}
			System.out.println();
		}*/
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
