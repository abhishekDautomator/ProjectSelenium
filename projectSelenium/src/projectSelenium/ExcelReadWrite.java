package projectSelenium;

//import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\naray\\OneDrive\\Desktop\\ExceliO.xlsx"));
		
		XSSFWorkbook wbin=new XSSFWorkbook(fis);
		
		
		int a=(int) wbin.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
		int b=(int) wbin.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		
		//FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\naray\\OneDrive\\Desktop\\ExceliO"));
		
		XSSFSheet sh=wbin.getSheetAt(0);
		Row row=sh.getRow(2);
		row.createCell(1).setCellValue(a+b);
		FileOutputStream outFile =new FileOutputStream(new File("C:\\\\Users\\\\naray\\\\OneDrive\\\\Desktop\\\\ExceliO.xlsx"));
        wbin.write(outFile);
        wbin.close();
	}

}
