package test;
import DiceGame.Raffle;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaffleTest {
	DiceGame.Raffle test;
	@Test
	void test() {
		int eyes;
		boolean tracker = false;
		Raffle test = new Raffle();
		eyes = test.raffle();
		if (eyes < 13 && eyes > 1)
			tracker = true;
		System.out.println(eyes);
		assertEquals(true, tracker);
	}

}
