package stopwatch;

/**
 * Main class use to run the code for compare the differences of elapsed time.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */

public class Main {
	public static void main(String[] args) {
		Runnable[] tasks = { new AppendStringTask(50000), new AppendStringTask(100000),
				new AppendStringBuilderTask(100000), new SumDoublePrimitiveTask(1000000000),
				new SumDoubleTask(1000000000), new SumBigDecimalTask(1000000000) };

		for (Runnable task : tasks) {
			TaskTimer.measureAndPrint(task);
		}

	}
}