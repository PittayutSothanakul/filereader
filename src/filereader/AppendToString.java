package filereader;

public class AppendToString implements Runnable {

	private String filename;
	private String data;

	public AppendToString(String filename) {
		this.filename = filename;
	}

	@Override
	public void run() {
		data = FileReaderr.readFileToString(filename);

	}

	public String toString() {
		return String.format("Reading Alice-in-Wonderland.txt using FileReader, append to String.\nRead %d chars",
				data.length());
	}

}
