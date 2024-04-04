package telran.exceptions;


@SuppressWarnings("serial")
public class NumberLessRangeMinException2 extends Exception {
	public NumberLessRangeMinException2(int min,int number) {
		super(String.format("number(%d) less than range min(%d)",number,min));
	}
	
	
}
