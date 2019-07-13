package yiye;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ActivityTest {
	
	public WebDriver driver;
	public static String LongIp="https://ct.wentiduoduo.com/login";
	public static String ActivityIp="";
	public static String UERSNAME="13555555555";
	public static String PASSWORD="1qazxc";
	 
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("s");
	  //浏览器进入粉丝营销模块--试用列表
	  driver.get("https://ct.wentiduoduo.com/trial/activityList");
	  driver.findElement(By.cssSelector("#root > div > div.app-body.flex.justify-center.align-start > div.app-main.transform-null.ant-layout > div > div > div > div:nth-child(2) > button")).click();
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	  driver=new ChromeDriver(); //chrome
	  driver.manage().window().maximize();
	  driver.get(LongIp);
	  WebElement userName=driver.findElement(By.id("username"));
	  userName.sendKeys(UERSNAME);
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys(PASSWORD);
	  driver.findElement(By.cssSelector("#root > div > form > div:nth-child(3) > div > div > span > button")).click();

	 // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	  
	  String path="body > div:nth-child(4) > div > div.ant-modal-wrap > div > div.ant-modal-content > div > div:nth-child(2)";
	 // driver.findElement(By.xpath(path)).click();
	  

	  WebElement element = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  element.click();
	  
	  //driver.findElement(By.cssSelector("body > div:nth-child(4) > div > div.ant-modal-wrap > div > div.ant-modal-content > div > div:nth-child(2)")).click();
	 // driver.navigate().to("https://ct.wentiduoduo.com/trial/activityList");
	//System.out.println(driver.getWindowHandles());
	//得到所有窗口的句柄
//    Set<String> handles = driver.getWindowHandles();
//    for(String handle:handles){
//    	if(handle.equals(driver.getWindowHandle())){
//    		continue;
//    	}
//    	else{
//    		driver.switchTo().window(handle);
//    	}
//    	
//    }
//    System.out.println("當前======="+driver.getWindowHandle());
    
	  }

  @AfterTest
  public void afterTest() {
  }

}
