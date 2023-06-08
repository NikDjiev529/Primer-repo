package maturaZadachi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Zad1 {

	public static void main(String[] args) {
		LinkedList<Integer> spi = new LinkedList<Integer>();
		int k = 5;
		for (int i = 0; i < 20; i++) {
			spi.add(i);
		}
		System.out.println(prenaredi(spi));

	}

	private static LinkedList<Integer> metodTrii(LinkedList<Integer> sp, int k) {
		Iterator<Integer> naSp = sp.iterator();
		while (naSp.hasNext()) {
			try {
				if (sborZifri(naSp.next()) % k == 0) {
					naSp.remove();
				}
			} catch (Exception E) {
				
			}
		}	
		return sp;
	}

	private static int sborZifri(int a) {
		int sbor = 0;
		while (a != 0) {
			sbor += a % 10;
			a = a / 10;
		}
		return sbor;
	}
	
	private static LinkedList<Integer> prenaredi(LinkedList<Integer> sp){
		System.out.println(sp);
		int []mas_sbor_Zifri = new int[sp.size()];
		for(int i=0; i< sp.size(); i++) {
			mas_sbor_Zifri[i] = sborZifri(sp.get(i));
		}
		int pom;
		for(int j=1; j<sp.size(); j++) {
		for(int i=0; i< sp.size() - 1; i++) {
			if(mas_sbor_Zifri[i]>mas_sbor_Zifri[i+1]) {
				pom=mas_sbor_Zifri[i];
				mas_sbor_Zifri[i]=mas_sbor_Zifri[i+1];
				mas_sbor_Zifri[i+1]=pom;
				
				
				
			}
		}
		}
		for(int i=0; i< sp.size(); i++) {
			System.out.print(mas_sbor_Zifri[i] + " ");
		}
		System.out.println();
		
		return sp;
	}

	
	
	
	
	
	
	
}
