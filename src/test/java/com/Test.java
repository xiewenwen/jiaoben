package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe"); 
		reg();
		 
	}
	
	public static void test1(){
		 //System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");原来的教程
		  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");        
		 // System.setProperty("webdriver.ie.driver", "E://webdriver//IEDriverServer.64.exe");        
		 //WebDriver driver=new InternetExplorerDriver(); //ie
		 //WebDriver driver=new FireFoxDriver(); //firefox
		 WebDriver driver=new ChromeDriver(); //chrome
		 driver.manage().window().maximize();
		 driver.get("https://www.baidu.com");
		 WebElement kw=driver.findElement(By.id("kw"));
		 kw.sendKeys("阿信");
		 WebElement su=driver.findElement(By.id("su"));
		 su.click();
		 //driver.close();
		 //driver.quit();
		 System.out.println("hello world");
	}
	
	public static void reg(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://passport.baidu.com/v2/");
		WebElement su=driver.findElement(By.id("TANGRAM__PSP_3__footerULoginBtn"));
		su.click();
		WebElement userName=driver.findElement(By.id("TANGRAM__PSP_3__userName"));
		userName.sendKeys("xiewenwen");
		WebElement password=driver.findElement(By.id("TANGRAM__PSP_3__password"));
		password.sendKeys("xiewenwen");
		WebElement check=driver.findElement(By.id("TANGRAM__PSP_3__memberPass"));
		check.isSelected();
		WebElement button=driver.findElement(By.id("TANGRAM__PSP_3__submit"));
		button.click();
		WebElement e=driver.findElement(By.id("TANGRAM__PSP_3__submit"));
		String message=e.getTagName();
		System.out.println("错误信息是："+message);
		
		
	}
	
	
	
	

}
