package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.BallBrokenFloor;

class BallBrokenFloorTest {

	private static final int N_FLOORS = 100;

	@Test
	void test() {
		BallBrokenFloor bbf =new BallBrokenFloor(N_FLOORS);
		assertEquals(bbf.getBrokenFloor(), getMinBrokenFloor(bbf));
	}

	private int getMinBrokenFloor(BallBrokenFloor bbf) {
		int low=1;
		int high=N_FLOORS;
		int counter=0;
		while(low<=high) {
			int mid =low+(high-low)/2;
			try {
				bbf.checkFloor(mid);
				low=mid+1;
			}catch(Exception ex) {
				high=mid-1;
			}
			counter++;
		}
		//using binary search algorithm only method checkFloor
		//of the class BallBrokenFloor
		//you should find minimal floor, from which a ball will be broken
		System.out.println(counter);
		return low;
	}

}
