package filereader;

public class AppendToStringBuilder implements Runnable {

	private String filename;
	private String data;

	public AppendToStringBuilder(String filename) {
		this.filename = filename;
	}

	@Override
	public void run() {
		data = FileReaderr.readFileToStringBuilder(filename);

	}

	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.\nRead %d chars",
				data.length());
	}
}
