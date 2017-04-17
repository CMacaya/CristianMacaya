package LinkedinIngreso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LinkedinLoginTestIE {
	
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.ie.driver", "C:/Users/crist/workspace/LinkedinLogin/IEDriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.linkedin.com/"); 
		driver.manage().window().maximize();	
		driver.findElement(By.id("login-email")).sendKeys("eeee@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("6417100pesos");
		driver.findElement(By.id("login-submit")).click();

		}

}
