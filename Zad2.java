package maturaZadachi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		char [][] a = new char[5][6];
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				a[i][j] = 'a';
			}
		}
		
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
				if(sustavna.equals(duma)) {
					return true;
				}
				
			}
		}
		for(int i=0; i<matriza.length; i++) {
			String sustavna2 = "";
			for(int j=brElemVRed-1; j>=0; j--) {
				sustavna2 = sustavna2 + matriza[i][j];
				if(sustavna2.equals(duma)) {
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	
	private static char[][] readMatrix(String imeFail) {
		File failche = new File(imeFail);
		Scanner minuvach = null;
		try {
			minuvach = new Scanner(failche);
		} catch (FileNotFoundException e) {
			System.out.println("File not found, bad, sorry.");
			return null;
		}
		if(minuvach.hasNextLine() == false) {
			minuvach.close();
			//No content in the file
			return null;
		}
		int broiSimvoliVPurviRed = (minuvach.nextLine()).length();
		int broiRedove = 1;
		if(minuvach.hasNextLine() == false && broiSimvoliVPurviRed != 1) {
			//Invalid matrix, more than 1 symbols in first line
			minuvach.close();
			return null;
		}
		while(minuvach.hasNextLine()) {
			if(broiSimvoliVPurviRed != (minuvach.nextLine()).length() ) {
				//Invalid matrix, not rectangular
				minuvach.close();
				return null;
			}
			broiRedove++;
		}
		minuvach.close();
		char[][] matrizaFail = new char[broiRedove][broiSimvoliVPurviRed];
		Scanner minuvachVtori = null;
		try {
			minuvachVtori = new Scanner(failche);
		} catch (FileNotFoundException e) {
			System.out.println("Bez znachenie");//Tazi proverka veche e izvurshena po-gore, no se iziskva pak da se napravi.
		}
		int redNaKoitoSme=0;
		while(minuvachVtori.hasNextLine()) {
			String redOtFaila = minuvachVtori.nextLine();
			char[] redOtFailaDa = redOtFaila.toCharArray();
			for(int i=0; i<redOtFaila.length(); i++) {
				matrizaFail[redNaKoitoSme][i] = redOtFailaDa[i];
			}
			redNaKoitoSme++;
		}
		
		return matrizaFail;
	}
	
	private static LinkedList<String> readWords(String imeFail){
		File failche = new File(imeFail);
		Scanner minuvach = null;
		try {
			minuvach = new Scanner(failche);
		}catch(FileNotFoundException e) {
			System.out.println("File not found, sorry :|");
			return null;
		}
		LinkedList <String> spisuka = new LinkedList<String>();
		while(minuvach.hasNextLine()) {
			spisuka.add(minuvach.nextLine());
		}
		
		minuvach.close();
		return spisuka;
	}
	
	
	
	
	
	
	
	
	
	

}









