package odev3;

import java.util.Random;

public class BTaktik extends Taktik {
	public BTaktik() {
		super();
	} 
	Random random=new Random();

	@Override
	public int Savas() 
	{
		int rastgelesayi=random.nextInt(501);
		return rastgelesayi;
	}
}
