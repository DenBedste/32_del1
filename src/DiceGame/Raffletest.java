package test;

import static org.junit.Assert.*;

import org.junit.Test;

import DiceGame.Raffle;

class Raffletest {
	DiceGame.Raffle test;

	@Test
	void test() {
		int[] eyes = new int[2];
		boolean tracker = false;
		DiceGame.Raffle test = new Raffle();
		eyes = test.raffle();
		if (eyes[0] + eyes[1] < 13 && eyes[0] + eyes[1] > 1)
			tracker = true;
		System.out.println(eyes);
		assertEquals(true, tracker);
	}

}
