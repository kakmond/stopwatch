package stopwatch;

/**
 * append chars to a StringBuilder
 * 
 * @author Wongsathorn Panichkurkul
 *
 */

public class AppendStringBuilderTask implements Runnable {
	
        /** size is the length of string result */
	private int size; 
	/** result is the result string */
	private String result; 

	/**
	 * Initialize AppendStringBuilderTask.
	 * 
	 * @param size is the length of string result
	 */
	public AppendStringBuilderTask(int size) {
		this.size = size;
		this.result = "";
	}

	/**
	 * performs the task by add 'a' to StringBuilder
	 */
	@Override
	public void run() {
		final char CHAR = 'a';

		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < size) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();

	}

	/**
	 * describes the task
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d\n", size, result.length());
	}

}
