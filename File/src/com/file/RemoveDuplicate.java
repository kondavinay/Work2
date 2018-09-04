package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RemoveDuplicate implements Serializable{

	
	public static void method(ArrayList<String> f) throws IOException, ClassNotFoundException {
		
		
		RemoveDuplicate red = new RemoveDuplicate();
		
		
			File ft = new File("C:\\Users\\Vinay Konda\\Desktop\\New folder (3)\\1\\demo.txt");
			FileOutputStream fos =new FileOutputStream(ft);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(red);
			
			FileInputStream fis = new FileInputStream(ft);
			ObjectInputStream  ois = new ObjectInputStream(fis); 
			RemoveDuplicate red1 = (RemoveDuplicate) ois.readObject();
		 ArrayList<String> validFail= new ArrayList<String>();
         
  	   
  	   
  	   
  	   
  	   String value2[] = f.toArray(new String[f.size()]);
         
         for(String mack : value2) {
      	   String value[]=mack.split(",");
  	   

			if (((Double.parseDouble(value[3]) + (Double.parseDouble(value[4]))) == Double.parseDouble(value[5]))
					|| ((Float.parseFloat(value[3]) + Float.parseFloat(value[4])) == (Float.parseFloat(value[5])))) {

				System.out.println("\nRecord \nTransaction Reference : " + value[0]);

				
				System.out.println("Description: " + value[2]);

				

			} else if (((Double.parseDouble(value[3]) + Double.parseDouble(value[4])) != (Double.parseDouble(value[5])))
					|| ((Float.parseFloat(value[3]) + Float.parseFloat(value[4])) != (Float.parseFloat(value[5])))) {

				validFail.add("\nRecord\nTransaction Reference : " + value[0] + "\nAccount Number : " + value[1]
						+ "\nDescription  : " + value[2] + "\nstartBalance : " + value[3] + "\nEndBalance : " + value[4]
						+ "\nEnd Balance : " + value[5]);
				
			}
  	   
     }
     
       
   
     
     
     
     for(String s: validFail) {
				
				System.out.println("failed records"+s);
			}
  
	}
	
}
