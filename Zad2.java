package zadachiMatura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		char [][] a = new char[5][6];
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				a[i][j] = 'a';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		String buba = "bb";
		contains(a, buba);

	}

	private static int BroiElementiVRedVmatrizata(char[][] matr) {
		int n=1;
		int br=0;
		for(int i=0; i<n; i++) {
			try {
				matr[0][i] = matr[0][i];
				br++;
				n+=1;
			} catch(Exception e) {
				n=0;
			}
		}
		
		return br;
	}
	
	private static boolean contains(char[][] matriza, String duma) {
		int brElemVRed = BroiElementiVRedVmatrizata(matriza);
		for(int i=0; i<matriza.length; i++) {
			String sustavna = "";
			for(int j=0; j<brElemVRed; j++) {
				sustavna = sustavna + matriza[i][j];
				System.out.println(sustavna);
				if(sustavna.equals(duma)) {
					return true;
				}
				
			}
		}
		for(int i=0; i<matriza.length; i++) {
			String sustavna2 = "";
			for(int j=brElemVRed-1; j>=0; j--) {
				sustavna2 = sustavna2 + matriza[i][j];
				System.out.println(sustavna2);
				if(sustavna2.equals(duma)) {
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	@SuppressWarnings("null")
	private static char[][] readMatrix(String imeFail) {
		File failche = new File(imeFail);
		Scanner minuvach = null;
		try {
			minuvach = new Scanner(failche);
		} catch (FileNotFoundException e) {
			minuvach.close();
			System.out.println("File not found, bad, sorry.");
			return null;
		}
		return null;

	}

}









