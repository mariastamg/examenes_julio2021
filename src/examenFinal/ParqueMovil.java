package examenFinal;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ParqueMovil {

	String tipoVehiculo = "";
	String provincia = "";
	int vehiculos;
	int anyo;
	File ruta;
	int total;

	public ParqueMovil(String tipoVehiculo, String provincia, Integer vehiculos, Integer anyo) {
		this.tipoVehiculo = tipoVehiculo;
		this.provincia = provincia;
		this.vehiculos = vehiculos;
		this.anyo = anyo;
	}

	private Map<String, Map<String, Integer>> m = new TreeMap<>();

/*Definir un constructor que acepte como par�metro la ruta donde se encuentran los ficheros y
un n�mero entero que represente un a�o , y cree una �nica estructura de datos din�mica en la
que se almacen en todos los datos del fichero correspondiente*/	
	public ParqueMovil(Integer anyo, String ruta) throws IOException {
		this.anyo = anyo;
		Integer total = 0;
		FileReader rutaElegida = null;
		try {
			rutaElegida = new FileReader(ruta);
			BufferedReader in = new BufferedReader(rutaElegida);
			String linea = in.readLine();
			String tipos[] = linea.split(";");
			while ((linea = in.readLine()) != null) {
				String[] datos = linea.split(";");
				Map<String, Integer> p = new HashMap<>();
				for (int i = 1; i < datos.length; i++) {
					int n = Integer.valueOf(datos[i]);
					p.put(tipos[i], n);
					total += n;
				}
				m.put(datos[0], p);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	/*Definir un m�todo que acepte como par�metros una provincia y un tipo de veh�culo y retorne el
	n�mero de veh�culos.*/
	public int getTotalProvinciaTipo(String provincia, String tipoVehiculo) {
		return m.get(provincia).get(tipoVehiculo);
		
	}
    /*Definir un m�todo que acepte como par�metro un tipo de veh�culo y retorne el total de veh�culos de ese tipo.*/
	public String getTotalTipoVehiculo(String tipo) {
		int total=0;
		for(String provincia:m.keySet())
			total+=m.get(provincia).get(tipo);
		return tipoVehiculo;
	}

	/*Definir un m�todo que acepte como par�metro una provincia y retorne el total de veh�culos en
    esa provincia.*/
	public int getTotalProvincia(String provincia) {
		int total=0;
		Map<String, Integer>p=m.get(provincia);
		for(int n:p.values())
			total+=n;
		return total;
	}
    /*Definir un m�todo que retorne el total de veh�culos del parque m�vil.*/
	public int getTotalVehiculos() {
		return vehiculos;
	}
    /*Definir un m�todo que retorne el a�o.*/
	public int getAnyo() {
		return anyo;
	}
	
	/*Definir un m�todo que acepte como par�metro una ruta de un fichero y almacene en �l los
     datos en binario con la estructura que se considere oportuna.*/
	
	public void guardar(String ruta) throws IOException {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(ruta);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(bos);
			for(Entry<String,Map<String,Integer>>e1:m.entrySet()) {
				dos.writeUTF(e1.getKey());	
				for(Entry<String,Integer>e2:e1.getValue().entrySet()) {
					dos.writeUTF(e2.getKey());
					dos.writeInt(e2.getValue());
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
