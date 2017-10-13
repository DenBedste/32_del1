package spil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testterninger {

	Terninger spil;
	@ Before
	public void setop(){
		spil = new Terninger();
	}

	@Test
	public void testfrequencytest(){
		int v2 = 0, v12 = 0, same = 0;
		Terninger d = new Terninger();
		int r = 0;
		for (int i = 0; i < 60000; i++){
			d.roll();
			r = d.getSum();
			
			switch (r) {
			case 2:
				v2++;
				break;
			case 12:
				v12++;
				break;
			}
			
			if (d.getEns()) {
				same++;
			}
		}
		double sammmeprocent = same * 100 /60000;
		boolean b = sammmeprocent > 13.5 && sammmeprocent < 18.5;
		assertEquals(true, b);
		
		//  values (1,1) probabilities 2.7 +- 0.2
		double v2sammmeprocent = (double)v2 * 100 / 60000;
		boolean v2b = v2sammmeprocent > 2.5 && v2sammmeprocent < 2.9;
		assertEquals(true, v2b);

		// dices face values (6,6) probabilities 2.7 +- 0.2
		double v12sammmeprocent = (double)v12 * 100 / 60000;
		boolean v12b = v12sammmeprocent > 2.5 && v12sammmeprocent < 2.9;
		assertEquals(true, v12b);
		
	}
}
