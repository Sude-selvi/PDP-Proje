package odev3;

import java.util.Random;

public class AUretim extends Uretim {
	
	public AUretim() {
		super();
	
	}
	Random random=new Random();
	@Override
	public int Uret(int gelenyemek) {
		
		int sayi=random.nextInt(11);
		int yeniyemeksayisi=gelenyemek+=sayi;
		return yeniyemeksayisi;
	}
	
	
}
