package excel;

import org.apache.poi.ss.usermodel.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.*;

public class ExcelUtil {


    public static Object[][] datas(String fileName,String sheetName){
        Object[][] nums=null;
        try {

            //获得Excel表格对象
            Workbook workbook=WorkbookFactory.create(new File(fileName));
            //获得表中对应的sheet
            Sheet sheet=workbook.getSheet(sheetName);
            //获取行
            int rows=sheet.getLastRowNum();
            Row one=sheet.getRow(0);
            //获取列
            int cells=one.getLastCellNum();
            System.out.println(rows);
            System.out.println(cells);
            //Map<String,String> maps=new HashMap<String, String>();
            //Set keys=new HashSet();
            if (rows>0){
                nums=new Object[rows][cells];
                for (int m=1;m<=rows;m++){
                    Row row=sheet.getRow(m);
                    for (int i=0;i<row.getLastCellNum();i++){
                        Cell cell=row.getCell(i);
                        cell.setCellType(CellType.STRING);
                        String name= cell.getStringCellValue();
                        System.out.println(name);
                        nums[m-1][i]=name;
                    }
                }
            }
        }
        catch (Exception E){

        }
        return nums;
    }
    @Test(dataProvider = "dp")
    public void test(String num1,String num2,String mum3)
    {
        System.out.println(num1);
    }

    @DataProvider
    public Object[][] dp(){
        return datas("src/test/java/resources/testdata.xls","calculator");
    }



}
