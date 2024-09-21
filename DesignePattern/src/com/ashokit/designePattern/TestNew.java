package com.ashokit.designePattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestNew {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SingleDesignPatternNew s=SingleDesignPatternNew.getInstance();
		SingleDesignPatternNew s2=SingleDesignPatternNew.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		//To break the singletonDesign pattern
		// throw Serializable interface
	/*	FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		//De-Serializable
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		// this line break the SingleToneDesign pattern
		//Internally calling read resolve method
		SingleDesignPatternNew s4=(SingleDesignPatternNew) ois.readObject();
		System.out.println(s4.name);
		System.out.println(s4.hashCode());
*/
		//by reflection 
		/*
		 * Constructor<SingleDesignPatternNew>
		 * t1=SingleDesignPatternNew.class.getDeclaredConstructor();
		 * t1.setAccessible(true); SingleDesignPatternNew
		 * s4=(SingleDesignPatternNew)t1.newInstance();
		 * System.out.println(s4.hashCode());
		 */
		//Cloning
	}

}
