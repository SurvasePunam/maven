package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
    public static String loginexceldata(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
    {
	FileInputStream file=new FileInputStream("C:\\Users\\Punam Survase\\OneDrive\\Pictures\\Documents\\Apache_Excel_Data\\orangehrmLoginData.xlsx");
    Workbook wb=WorkbookFactory.create(file);
    String data=wb.getSheet("sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
    
    return data;
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
