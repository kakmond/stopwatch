package stopwatch;

/**
 * append chars to a string.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */
public class AppendStringTask implements Runnable {

	/** size is the length of string result */
	private int size; 
	/** result is the result string */
	private String result; 

	/**
	 * Initialize AppendStringTask.
	 * 
	 * @param size is the length of string result
	 */
	public AppendStringTask(int size) {
		this.size = size;
		this.result="";
	}

	/**
	 * performs the task by add 'a' to String
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < size) {
			result = result + CHAR;
		}
	}

	/**
	 * describes the task
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d\n", size, result.length());

	}

}
