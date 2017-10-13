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
		int v3 =0, v4 = 0, v5 =0, v6=0, v7=0, v8=0, v9=0, v10=0, v11=0;
		Terninger d = new Terninger();
		int r = 0;
		for (int i = 0; i < 60000; i++){
			d.roll();
			r = d.getSum();
			
			switch (r) {
			case 2:
				v2++;
				break;
			
			case 3:
				v3++;
				break;
				
			case 4:
				v4++;
				break;
				
			case 5:
				v5++;
				break;
				
			case 6:
				v6++;
				break;
				
			case 7:
				v7++;
				break;
				
			case 8:
				v8++;
				break;
				
			case 9:
				v9++;
				break;
				
			case 10:
				v10++;
				break;
				
			case 11:
				v11++;
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
		
		
		double v3sammmeprocent = (double)v3 * 100 / 60000;
		boolean v3b = v3sammmeprocent > 5.4 && v3sammmeprocent < 5.7;
		assertEquals(true, v3b);
		
		double v4sammmeprocent = (double)v4 * 100 / 60000;
		boolean v4b = v4sammmeprocent > 8.1 && v4sammmeprocent < 8.55;
		assertEquals(true, v4b);
		
		double v5sammmeprocent = (double)v5 * 100 / 60000;
		boolean v5b = v5sammmeprocent > 10.83 && v5sammmeprocent < 11.4;
		assertEquals(true, v5b);
		
		double v6sammmeprocent = (double)v6 * 100 / 60000;
		boolean v6b = v6sammmeprocent > 13.54 && v6sammmeprocent < 14.24;
		assertEquals(true, v6b);
		
		double v7sammmeprocent = (double)v7 * 100 / 60000;
		boolean v7b = v7sammmeprocent > 16.25 && v7sammmeprocent < 17.08;
		assertEquals(true, v7b);
		
		double v8sammmeprocent = (double)v8 * 100 / 60000;
		boolean v8b = v8sammmeprocent > 13.54 && v8sammmeprocent < 14.24;
		assertEquals(true, v8b);
		
		double v9sammmeprocent = (double)v9 * 100 / 60000;
		boolean v9b = v9sammmeprocent > 10.83 && v9sammmeprocent < 11.4;
		assertEquals(true, v9b);
		
		
		double v10sammmeprocent = (double)v10 * 100 / 60000;
		boolean v10b = v10sammmeprocent > 8.1 && v10sammmeprocent < 8.55;
		assertEquals(true, v10b);
		
		double v11sammmeprocent = (double)v11 * 100 / 60000;
		boolean v11b = v11sammmeprocent > 5.4 && v11sammmeprocent < 5.7;
		assertEquals(true, v11b);
		
	}
}
