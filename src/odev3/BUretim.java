package odev3;

import java.util.Random;

public class BUretim extends Uretim {

	public BUretim() {
		super();
	
	}
	Random random=new Random();
	@Override
	public int Uret(int gelenyemek) {
		
		int sayi=random.nextInt(6);
		int yeniyemeksayisi=gelenyemek+=sayi;
		return yeniyemeksayisi;
	}
}
