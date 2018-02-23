package filereader;

public class TaskTimer {

	public void measureAndPrint(Runnable r) {
		Stopwatch stopwatch = new Stopwatch();
		double elapse;
		stopwatch.start();
		r.run();
		stopwatch.stop();
		elapse = stopwatch.getElapsed();
		System.out.printf(r.toString() + " in %.6f sec.", elapse);

	}
}
