package com;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest2 {
	
	public int num=0;
	
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//	  System.out.println(s.toString());
//  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod======"+num);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  num=88;
	  System.out.println("@afterMethod======"+num);
  }
  
  @Test(dataProvider="dp")
  public void sumTest(Integer n, Integer s){
	  num=sum(n,s);
	  System.out.println("@Test======"+num);
	  //Assert.assertEquals(1,num);
  }
  


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 1},
      new Object[] { 2, 1},
    };
  }
  
  public int sum(int a,int b){
	 return a+b;
  }
  
  
}
