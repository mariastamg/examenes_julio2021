package examenFinal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_Automovil {

	public static void main(String[] args) {
		Automovil[] automoviles=new Automovil[4];
		automoviles[0]=new Automovil("Hyundai", "Kona", "7519LTS", "2021", Motor.ELECTRICO, 204);
		automoviles[1]=new Automovil("Tesla", "Model 3", "3355KXL", "2019", Motor.GASOLINA, 306);
        automoviles[2]=new Automovil("Opel", "Astra", "3113KFC", "2019", Motor.DIESEL, 105);
		automoviles[3]=new Automovil("Volvo", "V60", "3131KZV", "2020", Motor.GASOLINA, 197);
		
		//Mostrar el contenido del array antes de la ordenacion
		System.out.println(Arrays.toString(automoviles));
		Arrays.sort(automoviles,new AutomovilComparator());
		System.out.println(Arrays.toString(automoviles));
		Arrays.sort(automoviles);
		System.out.println(Arrays.toString(automoviles));
	}

}
