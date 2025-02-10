package application;

import java.io.File;
import java.util.Scanner;

public class ProgramaFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a foder path: ");
		String strPath = sc.nextLine();
		
		File patch = new File(strPath);
		
		File[] folders = patch.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = patch.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath +"\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
		
	}

}
