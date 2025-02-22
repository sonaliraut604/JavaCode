package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int TotalRows=sheet.getLastRowNum();
		
		int Totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows:"+ TotalRows);//5 counting from 0
		System.out.println("number of cells:"+ Totalcells); //4 counting from 1
		
		for(int r=0;r<=TotalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<Totalcells;c++)
			{
				XSSFCell Currentcell=currentRow.getCell(c);
				System.out.print(Currentcell.toString()+"\t");
			}
			System.out.println();
			
		}
		
		
	}

}
