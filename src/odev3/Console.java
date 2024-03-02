package odev3;

import java.io.IOException;

public class Console {
	public static void clear() {
		try {
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (IOException | InterruptedException ex) {
			// TODO: handle exception
		}
	}
}
