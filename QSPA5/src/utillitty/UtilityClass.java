package utillitty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class UtilityClass {

	/**
	 * 
	 * @param path pass the path of the properties file
	 * @param key  pass the Url key from prop file
	 * @return String
	 * @throws IOException
	 */
	public String readDataFromPropFile(String path, String key) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	/**
	 * 
	 * @param path
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readingDataFromExcelSingleValue(String path, String SheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		String dataCell = workBook.getSheet(SheetName).getRow(rowNum).getCell(cellNum).toString();
		return dataCell;
	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String[] readDataFromExcelOneRow(String path, String sheetName, int rowNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		int numOfCol = book.getSheet(sheetName).getRow(rowNum).getPhysicalNumberOfCells();

		String[] data = new String[numOfCol];
		for (int j = 0; j < numOfCol; j++) {
			data[j] = book.getSheet(sheetName).getRow(rowNum).getCell(j).toString();
		}
		return data;
	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public static String[][] readingMultipleData(String path, String sheetName)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		int numRows = workBook.getSheet(sheetName).getPhysicalNumberOfRows();
		int numClm = workBook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[numRows][numClm];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numClm; j++) {
				data[i][j] = workBook.getSheet(sheetName).getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

	
}
