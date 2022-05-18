package devopsPipeline;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pipeline {
    

	WebDriver driver;
	String path = "C:\\webdrivers\\New folder\\chromedriver.exe";
	
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.get("https://material.angular.io/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"homepage-header\"]/div/div[2]/a/span[1]")).isDisplayed());
		System.out.println("After Assert");
	}

}