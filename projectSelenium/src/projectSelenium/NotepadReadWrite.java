package projectSelenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NotepadReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileInputStream fis=new FileInputStream("C:\\Users\\naray\\OneDrive\\Desktop\\ReadWriteNotepad.txt");
		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\\\Users\\\\naray\\\\OneDrive\\\\Desktop\\\\ReadWriteNotepad.txt")));
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
		}
		System.out.println("We read above lines using Buffered reader");
		
		FileReader fr=new FileReader("C:\\\\Users\\\\naray\\\\OneDrive\\\\Desktop\\\\ReadWriteNotepad.txt");
		int s;
		while((s=fr.read())!=-1) {
			System.out.print((char)s);
		}
		System.out.println();
		System.out.println("We read above lines using File reader");
		
		Scanner scn=new Scanner(new File("C:\\Users\\naray\\OneDrive\\Desktop\\ReadWriteNotepad.txt"));
		while(scn.hasNextLine()) {
			System.out.println(scn.nextLine());
			
		}
		System.out.println("We read above lines using Scanner class using loop");
		
		
		Scanner scan=new Scanner(new File("C:\\Users\\naray\\OneDrive\\Desktop\\ReadWriteNotepad.txt"));
		scan.useDelimiter("\\Z");
	    System.out.println(scan.next());
	    System.out.println("We read above lines using Scanner class using delimeter");
	    
	}

}
