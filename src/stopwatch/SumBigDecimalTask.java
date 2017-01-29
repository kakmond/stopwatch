package stopwatch;

import java.math.BigDecimal;

/**
 * add BigDecimal objects from an array. You need a large counter value to get a measurable time.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */
public class SumBigDecimalTask implements Runnable {

	static final int ARRAY_SIZE = 500000; // size of the array
	private int counter; // counter is times to add a number
	private BigDecimal sum; // sum is the sum of all number

	/**
	 * Initialize SumBigDecimalTask.
	 * 
	 * @param counter is times that you want to add a number
	 */
	public SumBigDecimalTask(int counter) {
		this.counter = counter;
	}

	/**
	 * performs the task by plus the number to the BigDecimal
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);

		sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}

	}

	/**
	 * describes the task
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d", counter) + "\nsum = " + sum + "\n";

	}

}
