package examenFinal;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio2 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		List<String>palabras=List.of("banana", "pera", "melón", "o", "sandia");
		System.out.println(cuentaPares(palabras));
		List<Integer>lista1=List.of(1,5,10,15,20,25,30,35,40,45);
		List<Integer>lista2=List.of(1,3,5,7,9,11,13,15,17,19);
		System.out.println(contarComunes(lista1, lista2));


	}
	
	public static Map<String, Integer> cuentaPares(List<String>palabras) {
		Map<String, Integer> m = new TreeMap<>();
		for(String palabra:palabras) {
			for(int i=0;i<palabra.length()-1;i++) {
				String par=palabra.substring(i, i+2);
				m.put(par,m.containsKey(par)?m.get(par)+1:1);
				
			}
		}
		return m;
		
		
	}
	
	public static int contarComunes(List<Integer>lista1,List<Integer>lista2) {
		Set<Integer>aux=new HashSet<>(lista1);
		aux.retainAll(lista2);
		return aux.size();
		
		
	}

}
