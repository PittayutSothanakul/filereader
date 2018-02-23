package filereader;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Pittayut Sothanakul
 * 
 * @version 1.0
 * 
 * 
 */

public class Stopwatch {
	/** values of elapsed. */
	private double elapsed;
	/**
	 * a boolean tell stopwatch is start or stop if stopwatch is stop = false
	 * and if stopwatch is start = true.
	 */
	private boolean running = false;
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long start;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stop;

	/**
	 * Return the elapsed in second with decimal.
	 * 
	 * @return the values of elapsed.
	 */
	public double getElapsed() {

		if (!running) {
			elapsed = NANOSECONDS * (stop - start);
		} else {
			elapsed = NANOSECONDS * (System.nanoTime() - start);
		}
		return elapsed;

	}

	/**
	 * check boolean in start method and stop method.
	 * 
	 * @return true or false in start method and stop method.
	 */
	public boolean isRunning() {

		return running;
	}

	/**
	 * method start count time if stopwatch is started.
	 */
	public void start() {
		if (!isRunning()) {
			start = System.nanoTime();
			running = true;
		}

	}

	/**
	 * method stop count time if stopwatch is stopped.
	 */
	public void stop() {
		if (isRunning()) {
			stop = System.nanoTime();
			running = false;
		}

	}

}
