package odev3;

import java.util.Random;

public class ATaktik extends Taktik{

	public ATaktik() {
		super();
	
	}
	Random random=new Random();

	@Override
	public int Savas() 
	{
		int rastgelesayi=random.nextInt(1001);
		
		return rastgelesayi;
	}


}
	
	/*		int sayi1=RastgeleSayi(); 
		int sayi2=RastgeleSayi(); 
		if(sayi1>sayi2) //koloni1 kazanir
		{
			int fark=sayi1-sayi2; 
			int yuzdelik=fark/10; 
			k2.populasyon[indeks2]-=(k2.populasyon[indeks2])*yuzdelik/100;
			k1.yemekstok[indeks1]+=(k2.yemekstok[indeks2])*yuzdelik/100;
			k2.yemekstok[indeks2]-=(k2.yemekstok[indeks2])*yuzdelik/100;
			return 0;
		}
		else if(sayi1<sayi2) // koloni2 kazanir
		{
			int fark=sayi2-sayi1; 
			int yuzdelik=fark/10;
			k1.populasyon[indeks1]-=(k1.populasyon[indeks1])*yuzdelik/100;
			k2.yemekstok[indeks2]+=(k1.yemekstok[indeks1])*yuzdelik/100;
			k1.yemekstok[indeks1]-=(k1.yemekstok[indeks1])*yuzdelik/100;
			return 0;
		}
		else {  //iki rastgele sayi birbirine esitse
			if(k1.populasyon[indeks1]>k2.populasyon[indeks2])  //koloni1'in populasyonu fazlaysa koloni1 kazanir
			{
				int fark=k1.populasyon[indeks1]-k2.populasyon[indeks2]; 
				int yuzdelik=fark/10; 
				k2.populasyon[indeks2]-=(k2.populasyon[indeks2])*yuzdelik/100;
				k1.yemekstok[indeks1]+=(k2.yemekstok[indeks2])*yuzdelik/100;
				k2.yemekstok[indeks2]-=(k2.yemekstok[indeks2])*yuzdelik/100;
				return 0;
			}
			else if (k1.populasyon[indeks1]<k2.populasyon[indeks2]) //koloni2'in populasyonu fazlaysa koloni2 kazanir
			{
				int fark=k2.populasyon[indeks2]-k1.populasyon[indeks1]; 
				int yuzdelik=fark/10; 
				k1.populasyon[indeks1]-=(k1.populasyon[indeks1])*yuzdelik/100;
				k2.yemekstok[indeks2]+=(k1.yemekstok[indeks1])*yuzdelik/100;
				k1.yemekstok[indeks1]-=(k1.yemekstok[indeks1])*yuzdelik/100;
				return 0;
			}
			else {  // iki populasyon da esitse  kimin kazanacagina rastgele karar verecegiz
				int RastgeleKazanan=random.nextInt(2);
				if(RastgeleKazanan==0) //koloni1 kazansin. koloniler arasi fark 0 olacagi icin rastgele sayilari kullanarak kaybeden koloninin populasyon eksilme yuzdesini bulacagim.
				{	
					do {
						sayi1=RastgeleSayi();
						sayi2=RastgeleSayi();
						if(sayi1>sayi2)
						{
							int fark=sayi1-sayi2; 
							int yuzdelik=fark/10; 
							k2.populasyon[indeks2]-=(k2.populasyon[indeks2])*yuzdelik/100;
							k1.yemekstok[indeks1]+=(k2.yemekstok[indeks2])*yuzdelik/100;
							k2.yemekstok[indeks2]-=(k2.yemekstok[indeks2])*yuzdelik/100;
							return 0;
						}
						else {
							int fark=sayi2-sayi1; 
							int yuzdelik=fark/10;
							k2.populasyon[indeks2]-=(k2.populasyon[indeks2])*yuzdelik/100;
							k1.yemekstok[indeks1]+=(k2.yemekstok[indeks2])*yuzdelik/100;
							k2.yemekstok[indeks2]-=(k2.yemekstok[indeks2])*yuzdelik/100;
							return 0;
						}
							
					} while (sayi1==sayi2);
					
				}
				else {  //koloni2 kazanir
					do {
						sayi1=RastgeleSayi();
						sayi2=RastgeleSayi();
						if(sayi1>sayi2)
						{
							int fark=sayi1-sayi2; 
							int yuzdelik=fark/10; 
							k1.populasyon[indeks1]-=(k1.populasyon[indeks1])*yuzdelik/100;
							k2.yemekstok[indeks2]+=(k1.yemekstok[indeks1])*yuzdelik/100;
							k1.yemekstok[indeks1]-=(k1.yemekstok[indeks1])*yuzdelik/100;
							return 0;
						}
						else {
							int fark=sayi2-sayi1; 
							int yuzdelik=fark/10;
							k1.populasyon[indeks1]-=(k1.populasyon[indeks1])*yuzdelik/100;
							k2.yemekstok[indeks2]+=(k1.yemekstok[indeks1])*yuzdelik/100;
							k1.yemekstok[indeks1]-=(k1.yemekstok[indeks1])*yuzdelik/100;
							return 0;
						}
							
					} while (sayi1==sayi2);
				}
			}
		}
		
	}*/