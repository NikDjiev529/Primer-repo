package zadachiMatura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner vuvedeni = new Scanner(System.in);
		String vuvedeno = vuvedeni.nextLine();
		char []niz = vuvedeno.toCharArray();
		
		vuvedeni.close();
	}

	@SuppressWarnings("unused")
	private static LinkedList<Integer> metodTrii(LinkedList<Integer> sp, int k) {//podtochka a)
		Iterator<Integer> naSp = sp.iterator();
		while (naSp.hasNext()) {
				if (sborZifri(naSp.next()) % k == 0) {
					naSp.remove();
				}
		}
		
		return sp;
	}

	private static int sborZifri(int a) {//chrez prevrushtane na otr v pol
		int sbor = 0;
		if(a<0) {
			a*=(-1);
		}
		while (a != 0) {
			sbor += a % 10;
			a = a / 10;
		}
		
		return sbor;
	}

	@SuppressWarnings("unused")
	private static LinkedList<Integer> prenaredi(LinkedList<Integer> sp) {//podtochka b)
		int[] mas_sbor_Zifri = new int[sp.size()];
		for (int i = 0; i < sp.size(); i++) {
			mas_sbor_Zifri[i] = sborZifri(sp.get(i));
		}
		int[] mas_lista_nareden = new int[sp.size()];
		for (int i = 0; i < sp.size(); i++) {
			mas_lista_nareden[i] = sp.get(i);
		}

		int pom;
		for (int j = 1; j < sp.size(); j++) {
			for (int i = 0; i < sp.size() - 1; i++) {
				if (mas_sbor_Zifri[i] > mas_sbor_Zifri[i + 1]) {
					pom = mas_sbor_Zifri[i];
					mas_sbor_Zifri[i] = mas_sbor_Zifri[i + 1];
					mas_sbor_Zifri[i + 1] = pom;

					pom = mas_lista_nareden[i];
					mas_lista_nareden[i] = mas_lista_nareden[i + 1];
					mas_lista_nareden[i + 1] = pom;

				}
			}
		}

		sp.clear();
		for (int i = 0; i < mas_lista_nareden.length; i++) {
			sp.add(mas_lista_nareden[i]);
		}

		return sp;
	}
	private static ArrayList<Integer> vurniChislata(char[] a) throws FileNotFoundException{//podtochka v)
		ArrayList<Integer> spisuk = new ArrayList<Integer>();
		String vuzmFail = "";
		for(int i=0; i<a.length; i++) {
			vuzmFail = vuzmFail + a[i];
		}
		File fileche = new File(vuzmFail);
		Scanner minuvach = null;
		try {
		minuvach = new Scanner(fileche);
		}catch(FileNotFoundException e) {
			throw new FileNotFoundException("File not found");
		}
		while(minuvach.hasNext()) {
			String dumaMai = minuvach.next();
			if(isNumericAndWhole(dumaMai) == true) {
				int chislo = Integer.parseInt(dumaMai);
				spisuk.add(chislo);
			}

		}
		minuvach.close();
		
		return spisuk;
	}
	
	private static boolean isNumericAndWhole(String duma) {
		try {
			@SuppressWarnings("unused")
			int d = Integer.parseInt(duma);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
