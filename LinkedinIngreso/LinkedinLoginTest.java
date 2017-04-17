package LinkedinIngreso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
*/

public class LinkedinLoginTest {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/crist/workspace/LinkedinLogin/src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.linkedin.com/"); 
		driver.manage().window().maximize();	
		driver.findElement(By.id("login-email")).sendKeys("cristian.macaya.f@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("xxxxx");
		driver.findElement(By.id("login-submit")).click();

		}
	
		
	}
