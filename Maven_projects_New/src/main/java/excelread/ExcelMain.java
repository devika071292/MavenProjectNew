package excelread;

import java.io.IOException;

import excelread.ExcelReadCode;
public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String d =ExcelReadCode.getStringData(0,1);
		System.out.println(d);
		String e =ExcelReadCode.getIntegerData(1,1);
		System.out.println(e);
		

	}

}