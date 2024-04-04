package telran.exceptions;

public class RangeExceptions {
	private int min;
	private int max;
	public RangeExceptions(int min, int max) {
		if (max<=min) {
			throw new IllegalArgumentException(String.format("max(%d) less or equal min(%d)",max , min));
		}
	
		this.min=min;
		this.max=max;
	}
	public static RangeExceptions getRangeExceptions(int min, int max) {
		if (max<=min) {
			throw new IllegalArgumentException(String.format("max(%d) less or equal min(%d)",max , min));
		}
		return new RangeExceptions(min,max);
	}
	public void checkNumber(int number) throws NumberGreaterRangeMaxException, NumberLessRangeMinException2 {
		if(number>max) {
			throw new NumberGreaterRangeMaxException(max, number);
		}
		if(number<min) {
			throw new NumberLessRangeMinException2(min, number);
		}
	}
}
