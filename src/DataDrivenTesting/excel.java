package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//path of the file
		File f=new File(".\\Testdata\\WHF and Leave status.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String testdata = workbook.getSheet("Testing batch 2").getRow(2).getCell(0).getStringCellValue();
		System.out.println(testdata);
		
		
		

	}

}
