import java.io.*;

import java.util.Scanner;

public class FileHandlingExmp {

	public static void main(String[] args) {
	
	try { 
		
		//Reading from file

     File file = new File("C:\\Users\\SHIVANSH TRIPATHI\\Desktop\\All java\\Practice Project\\Step 1 practice projects\\new1");
	
       	Scanner sc = new Scanner(file);
       	
		
		while(sc.hasNextLine());
		
		System.out.println(sc.nextLine());
		
		sc.close();
		
	}
	
	catch (Exception e) 
	{
		System.out.println("File reading error.");
	}

	
	
		//Writing from file
		
	try {
		String data1 = "Coding,10094,Intel";
//		
		FileWriter output = new FileWriter("C:\\Users\\SHIVANSH TRIPATHI\\Desktop\\All java\\Practice Project\\Step 1 practice projects\\new2");
		output.write(data1);
		System.out.println("Data written successfully");
		output.close();
	     }
	   catch(IOException e) {
		   System.out.println("File write error.");
	   }
		//Append to a file
		
	try {
		 String s="This string is appended.";
		 FileWriter output= new FileWriter("C:\\Users\\SHIVANSH TRIPATHI\\Desktop\\All java\\Practice Project\\Step 1 practice projects\\new3",true);
		 output.write(s);
		 System.out.println("Data appended successfully");
		 output.close();
	    }
	
	catch(IOException e) {
		System.out.println("File append error.");
	  }
	}

	
}
