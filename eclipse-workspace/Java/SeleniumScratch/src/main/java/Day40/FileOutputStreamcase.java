package Day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOutputStreamcase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of row:");
		int noofrows=sc.nextInt();
		
        System.out.println("Enter the no of column:");
		int noofcolumn=sc.nextInt();
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<noofcolumn;c++)
			{
				XSSFCell currentcell=currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);																																										
		
		workbook.close();
		file.close();
		
		System.out.println("file is created.......");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
