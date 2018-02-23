package filereader;

public class AppendToBufferedReader implements Runnable {

	private String filename;
	private String data;

	public AppendToBufferedReader(String filename) {
		this.filename = filename;
	}

	@Override
	public void run() {
		data = FileReaderr.StringBufferedReader(filename);
	}

	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland.txt using BufferedReader, append Line to String.\nRead %d chars",
				data.length());
	}
}
