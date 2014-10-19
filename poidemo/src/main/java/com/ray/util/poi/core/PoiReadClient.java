package com.ray.util.poi.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PoiReadClient {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		PoiReadClient prc = new PoiReadClient();
		Sheet sheet=prc.getFirstSheetByFile("C:\\Users\\Administrator\\Downloads\\季度考评表-于磊(珍诚网络).xls");
		for (Row row : sheet) {
				System.out.println("第"+(row.getRowNum()+1)+"行");
			for (Cell cell : row) {
				System.out.print(getCellValue(cell)+"||");
			}
		}
	}

	/**
	 * 读取POI
	 * WorkFactory类要使用 ooxml-sechmas jar包来
	 * 他在用create方法引入流的时候，可以任意读 xls  xlsx 2个版本
	 * 这样new出来的Workbook  可以是hssk xssk  sxsk牛逼的interface
	 */
	public Workbook readExcel(String filePath) {
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(filePath));
			return wb;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * new FileInputStream(filePath)
	 * 官网给出的解释是:花费更多的内存。懒人写法。
	 * 最好是用NPOIFSFileSystem(File)==HSSFWorkbook 2003
	 * OPCPackage(File) =OPCPackage 2007
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws Exception 
	 */
	public Sheet getFirstSheetByFile(String filePath) throws InvalidFormatException, IOException {
		/*Workbook wb =null;
		if(filePath.endsWith("xlsx")){  
			 OPCPackage pkg = OPCPackage.open(new File(filePath));
			 wb = new XSSFWorkbook(pkg);
        }else if(filePath.endsWith("xls")){  
        	 NPOIFSFileSystem fs = new NPOIFSFileSystem(new File(filePath));
        	 wb=WorkbookFactory.create(fs) ;
        	 
        }else{  
            throw new Exception("invalid file name, should be xls or xlsx");  
        }  
		*/
		Workbook wb = WorkbookFactory.create(new File(filePath));
		return wb.getSheetAt(0);
	}

	/**
	 * 获取单元格内的数据值
	 * 日期格式只保存年月日
	 */
	@SuppressWarnings("unused")
	private static String getCellValue(Cell cell) {
		String str = null;
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_BLANK:
			str = "";
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			str = String.valueOf(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			str = String.valueOf(cell.getCellFormula());
			break;
		case Cell.CELL_TYPE_NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
				System.out.print(formater.format(d));
				str = formater.format(d) + "";
			} else {
				str = String.valueOf(cell.getNumericCellValue());
			}
			break;
		case Cell.CELL_TYPE_STRING:
			str = cell.getStringCellValue();
			break;
		default:
			str = null;
			break;
		}
		return str;
	}
}
