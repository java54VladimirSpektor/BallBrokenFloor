package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.NumberGreaterRangeMaxException;
import telran.exceptions.NumberLessRangeMinException2;
import telran.exceptions.RangeExceptions;

class RangeExceptionsTests {

	@Test
	void factoryMethodTest() throws NumberGreaterRangeMaxException, NumberLessRangeMinException2 {
		RangeExceptions range=RangeExceptions.getRangeExceptions(3, 30);
		assertThrowsExactly(IllegalArgumentException.class,()->RangeExceptions.getRangeExceptions(30, 3));
		range.checkNumber(5);
		assertThrowsExactly(NumberGreaterRangeMaxException.class,()->range.checkNumber(35));
		assertThrowsExactly(NumberLessRangeMinException2.class,()->range.checkNumber(2));
		
	}

}
