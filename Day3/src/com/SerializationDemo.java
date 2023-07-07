package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationDemo {
	public static void main(String[] args) {
		Product p = new Product(1002, "TV", 22000);
		p.setShipment(new Shipment(101, "xyz"));

		try {

			/*
			 * FileOutputStream ois = new FileOutputStream("c://demo/Object.txt");
			 * ObjectOutputStream oos = new ObjectOutputStream(ois); oos.writeObject(p);
			 * oos.close(); System.out.println("Object Saved!!!!");
			 */

			FileInputStream fis = new FileInputStream("c://demo/Object.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Product d = (Product) ois.readObject();
			System.out.println(d.getPid() + "\t" + d.getProductName() + "\t" + d.getPrice()+"\t"+d.getShipment());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
