package odev3;


public class Program {

	public static void main(String[] args) throws InterruptedException {
	

	
		Oyun oyun=new Oyun();
		System.out.println("---------------------BASLANGIC DURUMU---------------------");
		oyun.kolonilerigoster();
		System.out.println("-----------------------------------------------------------");
		while(oyun.BitisKontrol()!=1)
		{
			oyun.Tur();// Tur adetlerine goz at
			Thread.sleep(50);
			Console.clear();
			oyun.BitisKontrol();
			if(oyun.BitisKontrol()==1)
			{oyun.Bitis();}
		}

	
	}

}
