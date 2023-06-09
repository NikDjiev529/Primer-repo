package maturaZadachi;

import java.util.Iterator;
import java.util.LinkedList;

public class Zad1 {

	public static void main(String[] args) {
		LinkedList<Integer> spi = new LinkedList<Integer>();
		for (int i = 0; i < 20; i++) {
			spi.add(i);
		}
		System.out.println(prenaredi(spi));

	}

	@SuppressWarnings("unused")
	private static LinkedList<Integer> metodTrii(LinkedList<Integer> sp, int k) {//1а
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
		if(a<0) {
			a=a*(-1);
		}
		while (a != 0) {
			sbor += a % 10;
			a = a / 10;
		}
		return sbor;
	}

	private static LinkedList<Integer> prenaredi(LinkedList<Integer> sp){//1б
		int []mas_sbor_Zifri = new int[sp.size()];
		int []mas_lista = new int[sp.size()];
		for(int i=0; i< sp.size(); i++) {
			mas_sbor_Zifri[i] = sborZifri(sp.get(i));
			mas_lista[i] = sp.get(i);
		}
		for(int i=0; i< sp.size(); i++) {
			System.out.print(mas_lista[i] + " ");		
		}
		System.out.println();

		int pom;
		for(int j=0; j<sp.size() - 1; j++) {
		for(int i=0; i< sp.size() - 1; i++) {
			if(mas_sbor_Zifri[i]>mas_sbor_Zifri[i+1]) {
				pom = mas_sbor_Zifri[i];
				mas_sbor_Zifri[i] = mas_sbor_Zifri[i+1];
				mas_sbor_Zifri[i+1] = pom;
				pom = mas_lista[i];
				mas_lista[i] = mas_lista[i+1];
				mas_lista[i+1] = pom;
				
			}
		}
		}
		sp.clear();
		for(int i=0; i< mas_lista.length; i++) {
			sp.add(mas_lista[i]);
		}
		
		return sp;
	}
	

}
//Resursi:
/* for(int i=0; i< sp.size(); i++) {
System.out.print(mas_lista[i] + " ");		
}
System.out.println();
for(int i=0; i< sp.size(); i++) {
System.out.print(mas_sbor_Zifri[i] + " ");
}
System.out.println(); */
