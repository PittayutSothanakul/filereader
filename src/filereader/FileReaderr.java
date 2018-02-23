package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderr {

	public static String readFileToString(String filename) {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// read the file.
		if (in != null)
			try {
				in.close();
			} catch (IOException e) {

			}
		return data;
	}

	public static String readFileToStringBuilder(String filename) {

		InputStream in = null;
		StringBuilder sBuilder = new StringBuilder();
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {

				c = reader.read();
				if (c < 0)
					break;
				sBuilder = sBuilder.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// read the file.
		if (in != null)
			try {
				in.close();
			} catch (IOException e) {

			}
		return sBuilder.toString();
	}

	public static String StringBufferedReader(String filename) {
		FileReader reader;
		BufferedReader br = null;
		String result = "";
		String line;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			int c;
			while ((line = br.readLine()) != null) {

				result = result + line + '\n';
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// read the file.
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {

			}
		return result;
	}

	public static void main(String[] args) {
		// create a stop watch.
		Stopwatch stopwatch = new Stopwatch();
		// start stop watch.
		stopwatch.start();
		// readt the file.
		String alice = readFileToString("./Alice-in-Wonderland.txt");
		// stop stop watch.
		stopwatch.stop();
		// print the result.
		System.out.printf(
				"Reading Alice-in-Wonderland.txt using FileReader, append to String.\nRead %d chars in %.6f sec.",
				alice.length(), stopwatch.getElapsed());

		stopwatch.start();
		String alice2 = readFileToStringBuilder("./Alice-in-Wonderland.txt");
		stopwatch.stop();
		System.out.printf(
				"\nReading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.\nRead %d chars in %.6f sec.",
				alice2.length(), stopwatch.getElapsed());

		stopwatch.start();
		String alice3 = StringBufferedReader("./Alice-in-Wonderland.txt");
		stopwatch.stop();
		System.out.printf(
				"\nReading Alice-in-Wonderland.txt using BufferedReader, append Line to String.\nRead %d chars in %.6f sec.",
				alice3.length(), stopwatch.getElapsed());

	}

}
