package QVW_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_Test {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Chrome_Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://za.qvwipay.com/portal/");
			// driver.get("www.google.com");
			// Local driver.get("http://localhost:44523/mes_vs2012/Account/Login.aspx");
			
		}

	}


