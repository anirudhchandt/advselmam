package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider {
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
	public void  dataDemo(String FN,String LN,String email,String pwd,String cnfnpwd){
		System.out.println(FN);
		System.out.println(LN);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(cnfnpwd);
	}
}
