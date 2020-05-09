package com.sapient.week5;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class DisplayFiles {

	public static void main(String[] args) {
		String path;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the path for the directory:");
		path=sc.next();
		File file=new File(path);
		if(file.exists()&&file.isDirectory())
		{
			File[] files=file.listFiles();
			for(File f:files)
			{
				System.out.println(f.getName());
			}
		}

	}

}
