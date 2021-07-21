package examen3ev;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno a1=new Alumno("Ines", "Barea Tejedor", LocalDate.of(1992, 10, 20), "Daw", 1);
		Alumno a2=new Alumno("Pepe", "Peralta Plasencia", LocalDate.of(1990, 07, 21), "Dam", 2);
		Alumno a3=new Alumno("Marina", "Montiel Navarro", LocalDate.of(1986, 06, 05), "Daw", 2);
		Alumno a4=new Alumno("Leopoldo", "Giraldo Ibarra", LocalDate.of(1991, 11, 02), "Dam", 1);
		
		Set<Alumno>alumnos=new TreeSet<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		System.out.println(alumnos);
		
		Set<Alumno>alumnos2=new TreeSet<Alumno>(new AlumnoComparator());
		alumnos2.addAll(alumnos);
		System.out.println(alumnos2);
		
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("alumnos")));
			out.writeObject(alumnos);
			out.writeObject(alumnos2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
}

