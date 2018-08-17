package com.airron.atp.test;

import java.io.File;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File directory = new File("");//参数为空 
		String courseFile = directory.getCanonicalPath() ; 
		System.out.println(courseFile); 
	}

}
