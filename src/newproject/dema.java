package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dema {

	public static void main(String[] args) {
		String s= System.getProperty("userdir");
		
System.setProperty("webdriver.chrome.driver",s+"//extfiles//chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("www.google.com");
	}

}
