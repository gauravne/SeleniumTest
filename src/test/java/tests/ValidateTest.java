package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class ValidateTest extends BaseTest {
	
	@Test
	public void validateTextBox() throws InterruptedException
	{
		String ExpectedUserName = "Gaurav";
		driver.findElement(By.id("userName")).sendKeys("Gaurav");; // Enter Full Name
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com"); // Enter Email
		driver.findElement(By.id("currentAddress")).sendKeys("UK");
		driver.findElement(By.id("permanentAddress")).sendKeys("UK");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String ActualUserName = driver.findElement(By.id("name")).getText();
		String name = ActualUserName.split("\n")[0].replace("Name:", "").trim();//split of text new line | select 1st row | replace Name with null | trim - remove space from start to end
		Assert.assertEquals(ExpectedUserName ,name, "Name value not mismatch!");

//		Assert.assertEquals(ExpectedUserName, ActualUserName,"User not matched");
		System.out.println("Test 1 : ValidateTextBox Passed Successful !!");
	}
	/*
	@AfterTest(groups = "Elements")
	public void validateCheckBox() throws InterruptedException
	
	{
		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("rct-checkbox")).click();
		System.out.println("Test 2 : ValidateCheckBox Passed Successful !!");
	}
	@AfterTest(groups = "Elements", dependsOnMethods = "validateCheckBox")
	public void validateRadioBox() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"item-2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		System.out.println("Test 3 : validateRadioBox Passed Successful !!");
	}
	
	@AfterTest(groups = "Elements", dependsOnMethods = "validateRadioBox")
	public void validateWebTables() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Gaurav");
		driver.findElement(By.id("lastName")).sendKeys("Neware");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("age")).sendKeys("34");
		driver.findElement(By.id("salary")).sendKeys("465643");
		driver.findElement(By.id("department")).sendKeys("IT");
		driver.findElement(By.id("submit")).click();
		System.out.println("Test 4 : validateWebTables Passed Successful !!");
	}*/
	//@Test
	/*public void validateButtons() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		Thread.sleep(5000);
		
		//double click
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).perform();
		Thread.sleep(5000);
		//right click
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();
		Thread.sleep(5000);
		WebElement click = driver.findElement(By.xpath("//*[@id=\"P9sY6\"]"));
		action.click(click).perform();
		System.out.println("Test 5 : validateButtons Passed Successful !!");
	}*/

}
