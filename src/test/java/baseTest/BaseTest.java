package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	//	driver = new ChromeDriver();
	    driver.get("https://demoqa.com/text-box");
	 //   driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']")).click();
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("Thank you !!!");
		//driver.quit();
	}
	
}
