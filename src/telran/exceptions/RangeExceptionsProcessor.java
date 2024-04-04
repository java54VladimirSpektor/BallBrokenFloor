package telran.exceptions;

public class RangeExceptionsProcessor {
	private RangeExceptions rangeExceptions;
	private int counterGreaterMax;//how many numbers have been greater than max range
	private int counterLessMin;//how many numbers have been less than max range
	private int counterRange;//how many numbers have into the range
	public RangeExceptionsProcessor(RangeExceptions rangeExceptions) {
		this.rangeExceptions= rangeExceptions;
	}
	public void numberProcessor(int number) {
		try {
			rangeExceptions.checkNumber(number);
			counterRange++;
		} catch (NumberGreaterRangeMaxException e) {
			counterGreaterMax++;
		} catch (NumberLessRangeMinException2 e) {
			counterLessMin++;
		}
	}
	public int getCounterGreaterMax() {
		return counterGreaterMax;
	}

	public int getCounterLessMin() {
		return counterLessMin;
	}
	
	public int getCounterRange() {
		return counterRange;
	}
	
	
	
}
