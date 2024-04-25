package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider2 {
	@DataProvider(name="test")
	public String[][] getdata() {
		String [][] data=new String[3][5];
		data[0][0]="Apoorva";
		data[0][1]="Mangalore";
		data[0][2]="apoorva123@gmail.com";
		data[0][3]="123abc";
		data[0][4]="123abc";
		
		data[1][0]="Mangalore";
		data[1][1]="Apoorva";
		data[1][2]="apoorva321@gmail.com";
		data[1][3]="abc123";
		data[1][4]="abc123";
		return data;
		}
	
	@Test(dataProvider = "test")
	public void  dataDemo(String[] regData){
		System.out.println(regData[0]);
		System.out.println(regData[1]);
		System.out.println(regData[2]);
		System.out.println(regData[3]);
		System.out.println(regData[4]);
	}
}
