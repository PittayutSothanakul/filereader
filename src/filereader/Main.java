package filereader;

public class Main {
	public static void main(String[] args) {
		String filename = "./Alice-in-Wonderland.txt";
		TaskTimer taskTimer = new TaskTimer();

		taskTimer.measureAndPrint(new AppendToString(filename));
		System.out.println();
		taskTimer.measureAndPrint(new AppendToStringBuilder(filename));
		System.out.println();
		taskTimer.measureAndPrint(new AppendToBufferedReader(filename));

	}
}
