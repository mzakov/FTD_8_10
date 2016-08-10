import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Main {
	public static void main(String args[]) throws IOException {
		
		File f = new File("c:\temp\newFile.txt");
		
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream("out");
		
		BufferedInputStream buff = new BufferedInputStream(in);
		
		BufferedReader read = new BufferedReader(new InputStreamReader(buff));
		
		System.out.println(read.readLine());
		
		
	}
}
