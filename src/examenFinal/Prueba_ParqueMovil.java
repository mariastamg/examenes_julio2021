package examenFinal;

import java.io.File;
import java.io.IOException;

public class Prueba_ParqueMovil {

	public static void main(String[] args) throws IOException {
	ParqueMovil pm=new ParqueMovil(2018,"home/julio/git/github/fpdistancia/exprog20210616/res");
	System.out.println(pm.getTotalProvinciaTipo("Asturias","CAMIONES"));
	System.out.println(pm.getTotalProvincia("Asturias"));
	System.out.println(pm.getTotalTipoVehiculo("CAMIONES"));
	System.out.println(pm.getTotalVehiculos());
	pm.guardar("/home/julio/git/github/fpdistancia/exprog20210616/res/pm" + pm.getAnyo() + ".dat");

	}

}
