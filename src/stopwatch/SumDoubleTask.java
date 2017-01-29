package stopwatch;

/**
 * add Double objects from an array. You need a large counter value to get a measurable time.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */

public class SumDoubleTask implements Runnable {

	/** size of the array */
	static final int ARRAY_SIZE = 500000;
	/** counter is times to add a number */
	private int counter; 
	/** sum is the sum of all number */
	private Double sum;

	/**
	 * Initialize SumDoubleTask.
	 * 
	 * @param counter is times that you want to add a number
	 */
	public SumDoubleTask(int counter) {
		this.counter = counter;
	}

	/**
	 * performs the task by plus the number to the Double
	 */
	@Override
	public void run() {

		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);

		sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
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
		return String.format("Sum array of Double objects with count=%,d", counter) + "\nsum = " + sum + "\n";

	}

}
