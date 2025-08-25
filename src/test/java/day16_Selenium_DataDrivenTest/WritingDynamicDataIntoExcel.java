package day16_Selenium_DataDrivenTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		 // Excel File -> Workbook -> Sheet -> Rows -> Cells
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile_dynamic.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Dynamic Data");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Rows?");
        int noOfRows=sc.nextInt();
        System.out.println("Enter number of Cells?");
        int noOfCells=sc.nextInt();
        
        
        
        for(int r=0;r<=noOfRows;r++)
        {
        	
        	XSSFRow currentRow= sheet.createRow(r);
        	for(int c=0;c<noOfCells;c++)
        	{
        		XSSFCell cell=currentRow.createCell(c);
        	cell.setCellValue(sc.next());
        	}
        }
        workbook.write(file); //attach workbook to the file
        workbook.close();
        file.close();

        System.out.println(" Excel file created successfully!");


	}

}
