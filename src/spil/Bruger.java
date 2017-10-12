package spil;

import java.util.Scanner;

public class Bruger {
	int antal_brugere=0;
	public Bruger(String navn) {
		String navn1;
		Scanner indtast_navn = new Scanner(System.in);
		System.out.print("indtast navn:");
		navn1 = indtast_navn.next();
		indtast_navn.close();
		antal_brugere++;
	}
}
