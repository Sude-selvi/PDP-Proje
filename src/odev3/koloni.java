package odev3;

import java.util.Arrays;
import java.util.Random;

public class koloni {

	public int[] populasyon;
	public int[] yemekstok;
	public int[] sembol;
	public int[] SecilenUretim;
	public int[] SecilenTaktik;
	public int[] KazanmaSayisi;
	public int[] KaybetmeSayisi;

	Random random = new Random();
	int RastgeleSayi;

	public koloni(int[] sayilar) {

		this.populasyon = Arrays.copyOf(sayilar, sayilar.length); // girilen sayilari populasyona kopyaladim.
		this.yemekstok = Arrays.copyOf(sayilar, sayilar.length); // Bu ve digerlerini program hata verdigi icin gecici
																	// olarak sayilar atadim. ilerleyen adimlarda almasi
																	// gereken degerleri alacaklar.
		this.SecilenTaktik = Arrays.copyOf(sayilar, sayilar.length);
		this.SecilenUretim = Arrays.copyOf(sayilar, sayilar.length);
		this.sembol = Arrays.copyOf(sayilar, sayilar.length);
		this.KazanmaSayisi = Arrays.copyOf(sayilar, sayilar.length);
		this.KaybetmeSayisi = Arrays.copyOf(sayilar, sayilar.length);
		for (int j = 0; j < populasyon.length; j++) {
			yemekstok[j] = populasyon[j] * populasyon[j];
			KazanmaSayisi[j] = 0;
			KaybetmeSayisi[j] = 0;
		}

		for (int i = 0; i < sayilar.length; i++) {
			RastgeleSayi = random.nextInt(2);
			if (RastgeleSayi == 0) {
				this.SecilenUretim[i] = 0;
			} else {
				this.SecilenUretim[i] = 1;
			}
			RastgeleSayi = random.nextInt(2);
			if (RastgeleSayi == 0) {
				this.SecilenTaktik[i] = 0;
			} else {
				this.SecilenTaktik[i] = 1;
			}
		}
	}

	@Override
	public String toString() {
		String str = "";
		int b = 33;
		for (int i = 0; i < populasyon.length; i++) {

			if (sembol[i] != ' ') {
				sembol[i] = b;
				b++;
			} else {
				b++;
			}

			str +=  "Koloni :  " +(char) (sembol[i])+"          |  Populasyon :" + String.valueOf(populasyon[i]) + "          | Yemek Stogu: "
					+ String.valueOf(yemekstok[i]) + "                    |  Kazanma : " + String.valueOf(KazanmaSayisi[i])
					+ "                    |  Kaybetme : " + String.valueOf(KaybetmeSayisi[i]) + "\n";
		}
		return str;
	}

}
