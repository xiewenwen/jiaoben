package com.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ParamTest {
	
	public WebDriver driver;
  @Test(dataProvider = "ct")
  public void f(String n, String s) {
	 System.out.println(n+"--hahah--"+s);
	 //System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");原来的教程
	//  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");        
	 // System.setProperty("webdriver.ie.driver", "E://webdriver//IEDriverServer.64.exe");        
	 //WebDriver driver=new InternetExplorerDriver(); //ie
	 //WebDriver driver=new FireFoxDriver(); //firefox
	 //System.out.println("www:"+n);
	 //System.out.println("keyWords:"+s);
	/* WebDriver driver=new ChromeDriver(); //chrome
	 driver.manage().window().maximize();*/
	 /*百度关键字搜索*/
//	 driver.get("https://yiye.wentiduoduo.com/admin/sub_users/index");
	 /*WebElement kw=driver.findElement(By.id("kw"));
	 kw.sendKeys(s);
	 WebElement su=driver.findElement(By.id("su"));
	 su.click();*/
	 //driver.close();
	 //driver.quit();
	// System.out.println("hello world");
	 //beforeClass();
	 System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	   driver=new ChromeDriver(); //chrome
		 driver.manage().window().maximize();
		 /*百度关键字搜索*/
		 driver.get("https://www.yiyehudong.com/index/auth/login");
		 WebElement uName=driver.findElement(By.id("login_user_name"));
		 uName.sendKeys("13555555555");
		 WebElement pwd=driver.findElement(By.id("password"));
		 pwd.sendKeys("tianhui3103");
		 WebElement form=driver.findElement(By.xpath("//*[@id='loginform']/div[3]/div/button"));
		 form.click();
		 WebElement menu=driver.findElement(By.xpath("//*[@id='wrapper']/nav/div/ul[1]/li[7]/ul/li[10]/a"));
		 //WebElement menu=driver.findElement(By.linkText("子账号管理"));
		 menu.click();
//		 JavascriptExecutor js = (JavascriptExecutor)driver;  
//		 
//
//		 js.executeScript(test);
		        
		 System.out.println("1------"+driver.getCurrentUrl());
//		 try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 System.out.println("2------"+driver.getCurrentUrl());
//		 js.executeScript("history.go(0)");
//	 driver.get("https://yiye.wentiduoduo.com/admin/sub_users/index");
//	 WebElement button=driver.findElement(By.className("btn btn-primary"));
//	 button.click();
//	 WebElement userName=driver.findElement(By.id("sub_user_name"));
//	 userName.sendKeys(n);
//	 WebElement passWord=driver.findElement(By.id("password"));
//	 passWord.sendKeys(s);
//	 WebElement use=driver.findElement(By.id("status_close"));
//	 use.isSelected();
//	 WebElement save=driver.findElement(By.className("btn btn-primary waves-effect waves-light m-r-10"));
//	 save.click();
//	 driver.close();
//	 driver.quit();
	 
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @DataProvider(name="ct")
  public Object[][] ct(){
	  return new Object[][]{
		  new Object[] {"kk","1234567"},
		 // new Object[] {"77","songsong"},
	  };
  }
  @BeforeClass
  public void beforeClass() {
//	  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
//	   driver=new ChromeDriver(); //chrome
//		 driver.manage().window().maximize();
//		 /*百度关键字搜索*/
//		 driver.get("https://yiye.wentiduoduo.com/index/auth/login");
//		 WebElement uName=driver.findElement(By.id("login_user_name"));
//		 uName.sendKeys("13555555555");
//		 WebElement pwd=driver.findElement(By.id("password"));
//		 pwd.sendKeys("1qazxc");
//		 JavascriptExecutor js = (JavascriptExecutor)driver;  
//		 js.executeScript("login()");
//		 WebElement login=driver.findElement(By.className("form-horizontal form-material"));
//		 login.submit();
//		 driver.get("https://yiye.wentiduoduo.com/admin/sub_users/index");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
