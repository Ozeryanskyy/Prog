package com.gmail.ozerianskyy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file1 = new File("a.txt");
		
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File folder = new File("ABC");
		
		folder.mkdirs();
		
		File fileTwo = new File(folder, "b.txt");
		
		file1.renameTo(fileTwo);
		
		folder.delete();
		
		File workFolder = new File(".");
		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
