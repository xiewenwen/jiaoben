package com.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBaiDu {
	
	@Test
	@Parameters({"www","keyWords"})
	public void testBaiDu(String www,String keyWords){
		 //System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");原来的教程
		  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");        
		 // System.setProperty("webdriver.ie.driver", "E://webdriver//IEDriverServer.64.exe");        
		 //WebDriver driver=new InternetExplorerDriver(); //ie
		 //WebDriver driver=new FireFoxDriver(); //firefox
		 System.out.println("www:"+www);
		 System.out.println("keyWords:"+keyWords);
		 WebDriver driver=new ChromeDriver(); //chrome
		 driver.manage().window().maximize();
		 driver.get(www);
		 WebElement kw=driver.findElement(By.id("kw"));
		 kw.sendKeys(keyWords);
		 WebElement su=driver.findElement(By.id("su"));
		 su.click();
		 //driver.close();
		 //driver.quit();
		// System.out.println("hello world");
		
		
	}
	
	

}
