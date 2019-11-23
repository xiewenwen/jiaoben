package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	 
 public WebDriver driver;
	 
  @Test(invocationCount=1)
  public void f() {
  	
	  	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://passport.baidu.com/v2/");
		driver.get("https://www.baidu.com/");
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
		userName.clear();
		password.clear();
		//WebElement e=driver.findElement(By.id("TANGRAM__PSP_3__submit"));
		//String message=e.getTagName();
		//System.out.println("¥ÌŒÛ–≈œ¢ «£∫"+message);
  }
}
