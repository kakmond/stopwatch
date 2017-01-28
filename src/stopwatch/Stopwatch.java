package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Wongsathorn Panichkurkul
 * @version 1.0
 */
public class Stopwatch {

	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** status that the stopwatch is running or not */
	private boolean isOn;

	/**
	 * return the elapsed time. If stopwatch is running, return the elapsed time
	 * since start until the current time, if stopwatch is stopped, return the
	 * time between the start and stop times.
	 * 
	 * @return the elapsed time in seconds with decimal.
	 */
	public double getElapsed() {
		if (isRunning() == true) {
			return ((System.nanoTime() - startTime) * NANOSECONDS);
		} else {
			return ((stopTime - startTime) * NANOSECONDS);
		}
	}

	/**
	 * 
	 * @return status of the stopwatch, true if the stopwatch is running, false
	 *         if the the stopwatch is not running.
	 */
	public boolean isRunning() {
		return isOn;
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (isRunning() == false) {
			startTime = System.nanoTime();
			isOn = true;
		}
	}

	/** Stop the stopwatch if it is not already stopping. */
	public void stop() {
		if (isRunning() == true) {
			stopTime = System.nanoTime();
			isOn = false;
		}
	}
}
