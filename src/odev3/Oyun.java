package odev3;

import java.util.Random;
import java.lang.Math;

public class Oyun {

	oku o = new oku();
	int[] s = o.Oku();
	koloni k = new koloni(s);
	AUretim Au = new AUretim();
	BUretim Bu = new BUretim();
	ATaktik at = new ATaktik();
	BTaktik bt = new BTaktik();
	Random random = new Random();


	public void kolonilerigoster() {
		System.out.println(k);
	}

	public void YemekStokArtis()// Burasi her tur sonu uretilen sayiya gore yemek stogunu arttiriyor,
	{

		for (int i = 0; i < k.populasyon.length; i++) {
			if(k.populasyon[i]!=0)
			{
			if (k.SecilenUretim[i] == 0) {
				int yemekstok = k.yemekstok[i];
				yemekstok = Au.Uret(yemekstok);// sadece gelen indeksteki yemek sayisini degistirmek istiyorum
				k.yemekstok[i] = yemekstok;
			} else {
				int yemekstok = k.yemekstok[i];
				yemekstok = Bu.Uret(yemekstok);// sadece gelen indeksteki yemek sayisini degistirmek istiyorum
				k.yemekstok[i] = yemekstok;
			}
			}

		}
	}
public void SifirKontrol()
{
	for (int i = 0; i < k.populasyon.length; i++) {
		if (k.populasyon[i] <= 0) {
			k.populasyon[i] = 0;
			k.yemekstok[i] = 0;
		}
		if (k.yemekstok[i] <= 0) {
			k.yemekstok[i] = 0;
			k.populasyon[i] = 0;
		}
	}
}
	public void IkiKoloniSavastirma(int indeks1, int indeks2) 
	{
		int sayi1, sayi2;

		int p1, p2, y1, y2;
	
		SifirKontrol();
			
		if (k.populasyon[indeks1] != 0 && k.populasyon[indeks2] != 0 && k.yemekstok[indeks1] != 0 && k.yemekstok[indeks2] != 0) 
		{	
			p1 = k.SecilenTaktik[indeks1];
			p2 = k.SecilenTaktik[indeks2];
			if (p1 == 0) {
				sayi1 = at.Savas();
			} else {
				sayi1 = bt.Savas();
			}
			if (p2 == 0) {
				sayi2 = at.Savas();
			} else {
				sayi2 = bt.Savas();
			}

			if (sayi1 > sayi2) // koloni1 kazanir
			{
				int fark = sayi1 - sayi2;
				double yuzdelik =  Math.ceil(fark / 10);

				p2 = k.populasyon[indeks2] -= Math.ceil((k.populasyon[indeks2]) * yuzdelik / 100);
				k.populasyon[indeks2] = p2;
				y1 = k.yemekstok[indeks1] += Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
				k.yemekstok[indeks1] = y1;
				y2 = k.yemekstok[indeks2] -= Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
				k.yemekstok[indeks2] = y2;
				
				k.KazanmaSayisi[indeks1]++;
				k.KaybetmeSayisi[indeks2]++;

			} else if (sayi1 < sayi2) // koloni2 kazanir
			{
				int fark = sayi2 - sayi1;
				double yuzdelik =  Math.ceil(fark / 10);
				p1 = k.populasyon[indeks1] -= Math.ceil((k.populasyon[indeks1]) * yuzdelik / 100);
				k.populasyon[indeks1] = p1;
				y2 = k.yemekstok[indeks2] += Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
				k.yemekstok[indeks2] = y2;
				y1 = k.yemekstok[indeks1] -= Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
				k.yemekstok[indeks1] = y1;
				
				k.KazanmaSayisi[indeks2]++;
				k.KaybetmeSayisi[indeks1]++;

			} else { // iki rastgele sayi birbirine esitse
				if (k.populasyon[indeks1] > k.populasyon[indeks2]) // koloni1'in populasyonu fazlaysa koloni1
																	// kazanir
				{
					int fark = k.populasyon[indeks1] - k.populasyon[indeks2];
					int yuzdelik = fark / 10;
					p2 = k.populasyon[indeks2] -= Math.ceil((k.populasyon[indeks2]) * yuzdelik / 100);
					k.populasyon[indeks2] = p2;
					y1 = k.yemekstok[indeks1] += Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
					k.yemekstok[indeks1] = y1;
					y2 = k.yemekstok[indeks2] -= Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
					k.yemekstok[indeks2] = y2;
					
					k.KazanmaSayisi[indeks1]++;
					k.KaybetmeSayisi[indeks2]++;

				} else if (k.populasyon[indeks1] < k.populasyon[indeks2]) // koloni2'in populasyonu fazlaysa koloni2
																			// kazanir
				{
					int fark = k.populasyon[indeks2] - k.populasyon[indeks1];
					int yuzdelik = fark / 10;
					p1 = k.populasyon[indeks1] -= Math.ceil((k.populasyon[indeks1]) * yuzdelik / 100);
					k.populasyon[indeks1] = p1;
					y2 = k.yemekstok[indeks2] += Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
					k.yemekstok[indeks2] = y2;
					y1 = k.yemekstok[indeks1] -= Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
					k.yemekstok[indeks1] = y1;
					
					k.KazanmaSayisi[indeks2]++;
					k.KaybetmeSayisi[indeks1]++;

				} else { // iki populasyon da esitse kimin kazanacagina rastgele karar verecegiz
					int RastgeleKazanan = random.nextInt(2);
					if (RastgeleKazanan == 0) // koloni1 kazansin. koloniler arasi fark 0 olacagi icin rastgele
												// sayilari
												// kullanarak kaybeden koloninin populasyon eksilme yuzdesini
												// bulacagim.

					{
						do {
							if (k.SecilenTaktik[indeks1] == 0) {
								sayi1 = at.Savas();
							} else {
								sayi1 = bt.Savas();
							}
							if (k.SecilenTaktik[indeks2] == 0) {
								sayi2 = at.Savas();
							} else {
								sayi2 = bt.Savas();
							}
						} while (sayi1 == sayi2);

						int fark = Math.abs(sayi1 - sayi2);
						int yuzdelik = fark / 10;
						p2 = k.populasyon[indeks2] -= Math.ceil((k.populasyon[indeks2]) * yuzdelik / 100);
						k.populasyon[indeks2] = p2;
						y1 = k.yemekstok[indeks1] += Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
						k.yemekstok[indeks1] = y1;
						y2 = k.yemekstok[indeks2] -= Math.ceil((k.yemekstok[indeks2]) * yuzdelik / 100);
						k.yemekstok[indeks2] = y2;
						
						k.KazanmaSayisi[indeks1]++;
						k.KaybetmeSayisi[indeks2]++;

					} else { // koloni2 kazanir
						do {
							if (k.SecilenTaktik[indeks1] == 0) {
								sayi1 = at.Savas();
							} else {
								sayi1 = bt.Savas();
							}
							if (k.SecilenTaktik[indeks2] == 0) {
								sayi2 = at.Savas();
							} else {
								sayi2 = bt.Savas();
							}
						} while (sayi1 == sayi2);
						int fark = Math.abs(sayi1 - sayi2);
						int yuzdelik = fark / 10;
						p1 = k.populasyon[indeks1] -= Math.ceil((k.populasyon[indeks1]) * yuzdelik / 100);
						k.populasyon[indeks1] = p1;
						y2 = k.yemekstok[indeks2] += Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
						k.yemekstok[indeks2] = y2;
						y1 = k.yemekstok[indeks1] -= Math.ceil((k.yemekstok[indeks1]) * yuzdelik / 100);
						k.yemekstok[indeks1] = y1;
						
						k.KazanmaSayisi[indeks2]++;
						k.KaybetmeSayisi[indeks1]++;

					}
				}

			}
			
		}
	
	}




	int a = 1;

	public void Tur() {

		for (int i = 0; i < k.populasyon.length; i++) {
			for (int j = 1; j < k.populasyon.length; j++) {

				if (i < j) {
					IkiKoloniSavastirma(i, j);
				}
			}
		}
		YemekStokArtis();
		TurSonuYemekVePopDengesi();
		System.out.println("Tur Sayisi : "+a);
		a++;
		System.out.println(k); // Dursun
		
	}

	public void TurSonuYemekVePopDengesi()
	{
		for(int i=0;i<k.populasyon.length;i++)
		{
			if(k.populasyon[i]!=0)
			{
			double pop=k.populasyon[i];
			pop+=Math.ceil(pop/5);
			k.populasyon[i]=(int)pop;
			
			double yemek=k.yemekstok[i];
			yemek-=(k.populasyon[i])*2;
			k.yemekstok[i]=(int)yemek;
			
			SifirKontrol();
			}
		}
	}
	
	
	public int BitisKontrol() {
		int KaybedenAdedi = 0;
		for (int i = 0; i < k.populasyon.length; i++) {
			if (k.populasyon[i] == 0) {
				KaybedenAdedi++;
			}
			if (KaybedenAdedi == k.populasyon.length-1) {
				return 1;
			}
		}
		return 0;
	}

	public void Bitis() {
		int indeks=0;
		System.out.println("------------------------------------------------------------------------------------OYUN BITTI-------------------------------------------------------------------------------------\n");
		System.out.println(k);
		for(int i=0;i<k.populasyon.length;i++)
		{
			if(k.populasyon[i]!=0)
			{
				 indeks=i;
			}
		}
		System.out.println(" KAZANAN : "+(char)(k.sembol[indeks])+"\n BITIS TURU : "+(a-1)+". tur");           //BURAYI DAHA HOS YAP: KAZANANIN SEMBOLU GOSTER
	}
	
}


