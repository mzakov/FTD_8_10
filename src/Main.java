import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {

		File file = new File("c:\\temp\\student.txt");

		if (!file.exists()) {
			Student studentObj = new Student("Tom", "FL", "Tampa");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.write(studentObj.toString());
			writer.close();

		} else {

			BufferedReader reader = new BufferedReader(new FileReader(file));

			Student studentObj2 = new Student(reader.readLine(), reader.readLine(), reader.readLine());
			reader.close();

			System.out.println(studentObj2);

		}

		// InputStream in = new FileInputStream(file);
		// OutputStream out = new FileOutputStream("out");

		// BufferedInputStream buff = new BufferedInputStream(in);

		// BufferedReader read = new BufferedReader(new FileReader(file));

		// System.out.println(read.readLine());

	}
}
