package odev3;

import java.util.Scanner;

public class oku {

	int[] Oku() {
		System.out.println("Kac adet sayi gireceksiniz :");
		Scanner scanner = new Scanner(System.in);
		int uzunluk = scanner.nextInt();

		int[] sayi = new int[uzunluk];
		System.out.println("Sayilari giriniz: ");
		for (int i = 0; i < uzunluk; i++) {
			if (scanner.hasNextInt()) {
				sayi[i] = scanner.nextInt();
			}
		}
return sayi;

	}
}

/*
 * String sayilar2=sayilar.replace(" ", ","); 
 * int uzunluk=sayilar2.length();
 * 
 * System.out.println("Sayilar: "); for (int i = 0; i < uzunluk; i++) {
 * System.out.print(s[i] + " "); }
 */