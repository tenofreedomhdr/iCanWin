package config;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Random value = new Random();
		int dex = value.nextInt(100);
		
		if (dex <= 30) {
			System.out.println("Pretty bad! Debil, Today without PC!!! 2");
		} else if (dex >=31 & dex <=60) {
			System.out.println("cool! 3");
		} else if (dex >=61 & dex <=90) {
			System.out.println("zbs 4");
		} else {
			System.out.println("norm 5");
		}
		
		System.out.println(dex);
		

	}

}
