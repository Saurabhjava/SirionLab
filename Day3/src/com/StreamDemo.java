package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamDemo {

	public static void main(String[] args) {
		byte b[]=new byte[100016 ];
		try {
			FileInputStream fis = new FileInputStream("c://demo/a2.mpeg");
			fis.read(b);
			fis.close();
			FileOutputStream ois=new FileOutputStream("c://demo/mix.mp3",true);
			ois.write(b);
			ois.close();
			System.out.println("Done....");
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}

}
