import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) {

		File file = new File("c:\\temp\\student.txt");
		BufferedWriter writer = null;
		BufferedReader reader = null;

		if (!file.exists()) {
			Student studentObj = new Student("Tom", "FL", "Tampa");

			try {
				writer = new BufferedWriter(new FileWriter(file));

				writer.write(studentObj.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {

			try {
				reader = new BufferedReader(new FileReader(file));
				Student studentObj2 = new Student(reader.readLine(), reader.readLine(), reader.readLine());
				System.out.println(studentObj2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		// InputStream in = new FileInputStream(file);
		// OutputStream out = new FileOutputStream("out");

		// BufferedInputStream buff = new BufferedInputStream(in);

		// BufferedReader read = new BufferedReader(new FileReader(file));

		// System.out.println(read.readLine());

	}
}
