package stopwatch;

/**
 * add double primitives from an array. You need a large counter value to get a measurable time.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */

public class SumDoublePrimitiveTask implements Runnable {

	static final int ARRAY_SIZE = 500000; // size of the array
	private int counter; // counter is times to add a number
	private double sum; // sum is the sum of all number

	/**
	 * Initialize SumDoublePrimitiveTask.
	 * 
	 * @param counter is times that you want to add a number
	 * 
	 */
	public SumDoublePrimitiveTask(int counter) {
		this.counter = counter;
	}

	/**
	 * performs the task by plus the number to the double primitive
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;

		sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}

	}

	/**
	 * describes the task
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d", counter) + "\nsum = " + sum + "\n";

	}

}
