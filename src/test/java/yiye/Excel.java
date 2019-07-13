package yiye;

import org.testng.annotations.Test;

import excel.ExcelData;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;



public class Excel {
	//Calculator cal=new Calculator();
	
	public static float cal(float n1,float n2){
		return n1+n2;
	}
	

    
    public Object[][] Numbers() throws BiffException, IOException{
        ExcelData e=new ExcelData("testdata", "calculator");
        return e.getExcelData();
    }
    @Test(dataProvider="num")
    public void testAdd(HashMap<String, String> data){
        System.out.println(data.toString());
        float num1=Float.parseFloat(data.get("num1"));
        float num2=Float.parseFloat(data.get("num2"));
        float expectedResult=Float.parseFloat(data.get("result"));  
        Float actual=cal(num1, num2);
        Assert.assertEquals(actual, expectedResult);
    }

}
