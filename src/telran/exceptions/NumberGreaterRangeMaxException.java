package telran.exceptions;


@SuppressWarnings("serial")
public class NumberGreaterRangeMaxException extends Exception {
	public NumberGreaterRangeMaxException(int max,int number) {
		super(String.format("number(%d) ggreater than range max(%d)",number,max));
	}
	
	
}
