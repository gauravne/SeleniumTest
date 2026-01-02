package baseTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuiElements {

	public static void main(String[] args) 
	{
	
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/#");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("name")).sendKeys("Gaurav");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("9112121212");
	driver.findElement(By.id("textarea")).sendKeys("Pune");
	
	driver.findElement(By.id("male")).click();
	driver.findElement(By.id("saturday")).click();
	WebElement dropdown = driver.findElement(By.id("country"));
	dropdown.findElement(By.xpath("//*[@id=\"country\"]/option[10]")).click();
	
	WebElement date = driver.findElement(By.id("datepicker"));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].value='2026-03-15';", date);
	
	 date = driver.findElement(By.id("txtDate"));
	js.executeScript("arguments[0].value='2026-03-15';", date);
	
	date = driver.findElement(By.id("start-date"));
	js.executeScript("arguments[0].value='2026-03-15';", date);
	
	date = driver.findElement(By.id("end-date"));
	js.executeScript("arguments[0].value='2026-04-15';", date);
	
	driver.findElement(By.className("submit-btn")).click();
	
	
	driver.findElement(By.id("alertBtn")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.findElement(By.id("promptBtn")).click();
	Alert promptAlert = driver.switchTo().alert();
	promptAlert.sendKeys("Gaurav Neware");
	promptAlert.accept();
	
	Actions action = new Actions(driver);
	WebElement mousehvr = 	driver.findElement(By.className("dropbtn"));
	action.moveToElement(mousehvr).perform();
	mousehvr.findElement(By.xpath("//a[normalize-space()='Laptops']")).click();
	
	
	
	}

}
