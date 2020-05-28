package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.Utility;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;

	public TestBase()  {

		prop = new Properties();

		
			FileInputStream file;
			try {
				file = new FileInputStream(
						"C:\\Users\\USER\\Desktop\\Selenium\\orangehrm-project\\src\\main\\java\\com\\qa\\config\\config.properties");
				prop.load(file);
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		

	}

	public static void intialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\Desktop\\Selenium\\orangehrm-project\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			String browsername1 = prop.getProperty("browser1");
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\USER\\Desktop\\Selenium\\orangehrm-project\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

}
