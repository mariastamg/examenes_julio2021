package examenFinal;

import java.util.Comparator;

public class AutomovilComparator implements Comparator<Automovil> {

	@Override
	public int compare(Automovil o1, Automovil o2) {
		int compare=o1.getMotor().compareTo(o2.getMotor());
		if(compare==0) 
			compare=o1.getPotencia().compareTo(o2.getPotencia());
		return compare;
	}

}
