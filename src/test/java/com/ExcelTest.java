package com;

import java.io.File;
import java.util.HashMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelTest {
	
	HashMap<String,String>[][] map=null;
	 public Workbook workbook;
	    public Sheet sheet;
	    public Cell cell;
	    int rows;
	    int columns;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	public void getExcel(){
		 
		
		
	}
	
	private String getPath() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object[][] data(){
		int row=2;
		int cell=4;
		map=new HashMap[row][cell];
		for(int i=0;i<row;i++){
			for(int j=0;j<cell;j++){
				map[i][j].put(i+"jj", "66");
			}
		}
		return map;
	}
	

}
