package filereader;

import java.util.Scanner;


public class StopwatchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		System.out.println("Enter to start");
		sc.nextLine();
		timer.start();
		System.out.println("Enter to Stop");
		sc.nextLine();
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())

			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}
}
