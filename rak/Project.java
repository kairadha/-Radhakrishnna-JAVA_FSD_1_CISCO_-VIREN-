package rak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Demo{
	
//	---------Use you own file directory to test this application -----------
//	If you are executing this application in different PC use your preffered directory
	
	
	//-----------Code to Add the file---------------
public void add(String a) {
		
		
		try {
			System.out.println("Enter the directory  of files to be Added");
		    Scanner s = new Scanner(System.in);
		    String folderPath = s.next();
			File file =new File(folderPath+a);
			if(file.createNewFile()) {
				System.out.println("New file is created\n");
			}else {
				if(file.exists()) {
					System.out.println("File by this name already exists");
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

//-----------Code to Delete the file---------------


public void delete(String a) throws FileNotFoundException {
	try {
		System.out.println("Enter the directory  of files to be Delete");
	    Scanner s = new Scanner(System.in);
	    String folderPath = s.next();
	File file =new File(folderPath+a);
    if(file.exists()) {
	boolean b=file.delete();
	if(b==true) {
		System.out.println("File deleted\n");
	}
}else {
    throw new FileNotFoundException(" This File not found in the directory");	}

}catch(Exception m) {
		System.out.println("Exception Occured: "+m.getMessage());
	}
	
}


//-----------Code to Sort the file---------------

public void SortFiles() {
	System.out.println("Enter the directory  of files to be sortted");
    Scanner s1 = new Scanner(System.in);
    String folderPath = s1.next();
	File fileDir = new File(folderPath);
	if(fileDir.isDirectory()){
		List<String> listFile = Arrays.asList(fileDir.list());
		System.out.println("Sortted in Alphabetical order\n");
		for(String s:listFile){
			System.out.println(s);
		}	
		System.out.println("---------------------------------------");

	}
	else{
		System.out.println(fileDir.getAbsolutePath() + " is not a directory");
	}
	
}


//---------------Code to Search the File------------


public void search(String f) {
	boolean flag=false;
	System.out.println("Enter the directory in which this file is to be searched");
    Scanner s2 = new Scanner(System.in);
    String folderPath = s2.next();
	File fileDir = new File(folderPath);
	List<String> listFile = Arrays.asList(fileDir.list());

	
		Collections.sort(listFile);
		System.out.println("---------------------------------------");
		for(String s:listFile){
			if(f.equals(s)) {
				flag=true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println(f+" file is present in this directory\n");

		}else
			System.out.println(f+" file is not present in this directory\n");

		
}

}



public class Project {
	

	public static void main(String[] args) {
		  boolean running=true;
         Scanner sc=new Scanner(System.in);
         System.out.println("This Program is designed to perform the following actions \n "
         		+ "1:Adding the files\n 2:Deleting the files\n 3:Searching the Files\n "
         		+ "4:Sorting the Files\n");
         System.out.println("--------------------------------------------------------------------------------");
         System.out.println("Use ypur own directiory path to test this application");
Demo p=new Demo();         

do {
	
	System.out.println("File Operations are...");
	System.out.println("1 :  add");
	System.out.println("2 : delete");
	System.out.println("3 : To Sort the files");
	System.out.println("4 : Search the file");
	System.out.println("5 : To exit from the program\n");
	
	
	System.out.println("Please Enter Your choice!\n");
	String choice=sc.nextLine();
	switch (choice)
	{
	case "1":
        System.out.println("Enter file name you want to insert");


     try {
		p.add(sc.nextLine());

		}catch(Exception m) {
			System.out.println("Exception Occure: "+m.getMessage());
		}

		break;
		
	case "2":    
		System.out.println("Enter Filename you want to delete"); //case to delete the file
		try {
			p.delete(sc.nextLine());
		}
		catch (Exception e) {
	        System.out.println("Error: "+ e.getMessage());				
	        }
		break;
		
	case "3":
	  p.SortFiles(); //case to sort the files
	  break;
		
	  
	case "4":
		System.out.println("Enter the file name you want to search");// case to Search the file
		p.search(sc.nextLine());
		break;
		
	case "5":
		// Exit
		System.out.println("Program exited successfully."); //case to exit from the program
		running = false;
		sc.close();
		System.exit(0);
		
	default : System.out.println("Wrong Entry \n ");
        break;
		
	}

	
	

} while (running==true);  
	}
}
