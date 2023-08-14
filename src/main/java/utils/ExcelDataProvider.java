package utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;


public class ExcelDataProvider {

    private static XSSFWorkbook ExcelWBook = null;
    static XSSFSheet ExcelWSheet;

    private static XSSFCell Cell;

    public ExcelDataProvider(String filePath, String SheetName) throws Exception {
        try {
            FileInputStream ExcelFile = new FileInputStream(filePath);

            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);

        } catch (Exception e) {
            throw (e);
        }


    }

    public static String getCellData(int RowNum, int ColNum) {

        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            String CellData = Cell.getStringCellValue();
            return CellData;
        } catch (Exception e) {
            return "";
        }


    }

}







