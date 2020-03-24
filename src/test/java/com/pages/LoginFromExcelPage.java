package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ExcelUtility.ExcelRead;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

public class LoginFromExcelPage {
	WebDriver driver;
	public void LaunchUrl() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://practice.automationtesting.in/");
		System.out.println(driver.getTitle());
	}
	
	public void clickMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	public void loginCredentials(int i) throws Exception {
		ExcelRead da = new ExcelRead();
		driver.findElement(By.id("username")).sendKeys(da.excel_username(i));
		driver.findElement(By.id("password")).sendKeys(da.excel_password(i));
	}
	
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	public void Assert() throws Exception {
		String a = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals("Dashboard",a);
		System.out.println("Logged Successfully");
	}
	
	public void logout() {
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
	}
	public void Screenshot1() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Mahesh\\eclipse-workspace\\PracticeAutomationTesting3\\src\\test\\resources\\Screenshots\\Loggedin1.png"));
	}
	public void Screenshot2() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Mahesh\\eclipse-workspace\\PracticeAutomationTesting3\\src\\test\\resources\\Screenshots\\Loggedin2.png"));
	}
	public void Screenshot3() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Mahesh\\eclipse-workspace\\PracticeAutomationTesting3\\src\\test\\resources\\Screenshots\\Loggedin3.png"));
	}
}
