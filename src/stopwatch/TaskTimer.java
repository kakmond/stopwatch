package stopwatch;

/**
 * a TaskTimer class that will compute and print the elapsed time for any task
 * 
 * @author Wongsathorn Panichkurkul
 *
 */

public class TaskTimer {
	/**
	 * Runs a task, measures and prints its running time to the console.
	 * 
	 * @param task is the task that you want to run.
	 */
	public static void measureAndPrint(Runnable task) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		task.run();
		timer.stop();
		System.out.print(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
