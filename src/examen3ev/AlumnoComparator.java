package examen3ev;

import java.io.Serializable;
import java.util.Comparator;

public class AlumnoComparator implements Comparator<Alumno>,Serializable {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int compare=o1.getCiclo().compareTo(o2.getCiclo());
		if(compare==0)
			compare=o1.getCurso().compareTo(o2.getCurso());
		if(compare==0)
			compare=o1.getApellidos().compareTo(o2.getApellidos());
		if(compare==0)
			compare=o1.getNombre().compareTo(o2.getNombre());
		return 0;
	}

}
