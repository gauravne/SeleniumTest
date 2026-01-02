package baseTest;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormTest {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		ChromeOptions options1 = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("profile.default_content_setting_values.popups", 2);
		prefs.put("profile.default_content_setting_values.ads", 2);

		options1.setExperimentalOption("prefs", prefs);
		options1.addArguments("--disable-notifications");

	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html"); // launch URL
		driver.manage().window().maximize(); //maximize browser window
		
		driver.findElement(By.name("firstname")).sendKeys("Virat");
		driver.findElement(By.name("lastname")).sendKeys("User1");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.id("exp-4")).click();
		driver.findElement(By.id("datepicker")).sendKeys("01 Jan 2026");
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("tool-1")).click();
		WebElement dropdown = driver.findElement(By.id("continents"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Australia");
		
		driver.findElement(By.id("//option[normalize-space()='WebElement Commands']")).click();
        WebElement tool = driver.findElement(By.id("tool-2"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", tool);

		   // Initialize Webdriver Object
     //   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    //    WebDriver driver = new ChromeDriver();
        // Open URL
	
	}

}
