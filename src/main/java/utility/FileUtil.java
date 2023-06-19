package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtil {

	public String readProperty(String key) {

		String value = null;

		try {

			FileInputStream fileinput = new FileInputStream(
					"C:\\Users\\VINOTH\\eclipse-workspace\\Spicejet\\src\\test\\resources\\config.properties");
			Properties prop = new Properties();

			prop.load(fileinput);

			value = prop.getProperty(key);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}
	
	
	
	
	
}
