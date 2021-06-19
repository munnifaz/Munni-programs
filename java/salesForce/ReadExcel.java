package testNG_Execution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelSData(String filename) throws IOException {
		
			XSSFWorkbook wb=new XSSFWorkbook("./Data/"+filename+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcout=ws.getLastRowNum();
		int coloumncount=ws.getRow(0).getLastCellNum();
		
		
		String[][] data=new String[rowcout][coloumncount];
		
		for(int i=1;i<=rowcout;i++) {
			for(int j=0;j<coloumncount;j++) {
				
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=CellValue;
				System.out.println(CellValue);
				
			}
		}
		wb.close();
		return data;

		
		
		
	}




	}


