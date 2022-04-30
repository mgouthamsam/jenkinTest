package org.finalrun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void chromebrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void closebrowser() {
		driver.close();
	}

	public static void maximise() {
		driver.manage().window().maximize();
	}

	public static void launchurl(String url) {
		driver.get(url);

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sleep() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void filltextbox(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String readFromExcel(String SheetName, int rowno, int cellNo) throws IOException {
		File f = new File("C:\\Users\\INTEL\\eclipse-workspace\\MavenPro\\Excel\\gout.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = book.getSheet(SheetName);
		Row r = sh.getRow(rowno);
		Cell c = r.getCell(cellNo);
		
		int type = c.getCellType();


		String name;

		if (type == 1) {
			name = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("MM-dd-yy");
			name = s.format(da);
		}

		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			name = String.valueOf(l);
		}

		return name;
	}

	public static void DateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
