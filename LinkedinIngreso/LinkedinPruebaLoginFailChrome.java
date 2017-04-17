package LinkedinIngreso;

//import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Test;

public class LinkedinPruebaLoginFailChrome {

	WebDriver driver = new ChromeDriver();
	@Test
		@Given("^usuario ingresa a linkedin$")
		public void usuario_ingresa_a_linkedin(){
			System.setProperty("webdriver.chrome.driver", "C:/Users/crist/workspace/LinkedinLogin/src/chromedriver.exe");
			driver.get("http://www.linkedin.com/"); 
			driver.manage().window().maximize();
			
		}
		
		@Then("^usuario ingresa correo$")
		public void usuario_ingresa_correo() {		
			driver.findElement(By.id("login-email")).sendKeys("juanpe@gmail.com");
		}
		
		@Then("^usuario ingresa password$")
		public void usuario_ingresa_password(){
			driver.findElement(By.id("login-password")).sendKeys("pepepepe");
		}
		
		@And("^usuario hace click en en boton Inicia Sesion")
		public void usuario_hace_click_en_en_boton_Inicia_Sesion(){
			driver.findElement(By.id("login-submit")).click();
		}
		
	}
