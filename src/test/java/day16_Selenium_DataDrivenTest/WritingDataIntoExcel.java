package day16_Selenium_DataDrivenTest;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

    public static void main(String[] args) throws IOException {

        // Excel File -> Workbook -> Sheet -> Rows -> Cells
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        // Row 1
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome");
        row1.createCell(1).setCellValue("Hello");
        row1.createCell(2).setCellValue("World!");
        row1.createCell(3).setCellValue(0);

        // Row 2
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Welcome1");
        row2.createCell(1).setCellValue("Hello1");
        row2.createCell(2).setCellValue("World!1");
        row2.createCell(3).setCellValue(1);

        // Row 3
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("Welcome2");
        row3.createCell(1).setCellValue("Hello2");
        row3.createCell(2).setCellValue("World!2");
        row3.createCell(3).setCellValue(2);

        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("Excel file created successfully!");
    }
}
