package examenFinal;

import java.util.Objects;

public class Automovil implements Comparable<Automovil>{
	private String marca;
	private String modelo;
	private String matricula;
	private String anyoFabricacion;
	private Motor motor;
	private Integer potencia;
	
	public Automovil(String marca, String modelo, String matricula, String anyoFabricacion, Motor motor, Integer potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anyoFabricacion = anyoFabricacion;
		this.motor = motor;
		this.potencia = potencia;
	}
	
	

	public String getMarca() {
		return marca;
	}



	public String getModelo() {
		return modelo;
	}



	public String getMatricula() {
		return matricula;
	}



	public String getAnyoFabricacion() {
		return anyoFabricacion;
	}



	public Motor getMotor() {
		return motor;
	}



	public Integer getPotencia() {
		return potencia;
	}



	@Override
	public int hashCode() {
		return Objects.hash(anyoFabricacion, marca, matricula, modelo, motor, potencia);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		return Objects.equals(anyoFabricacion, other.anyoFabricacion) && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& motor == other.motor && potencia == other.potencia;
	}
	
	
	public int compareTo(Automovil a) {
		int compare=marca.compareTo(a.marca);
		if(compare==0) {
			compare=modelo.compareTo(a.modelo);
			if(compare==0) {
				compare=motor.compareTo(a.motor);
			}
		}
		return compare;
		
	}

	


	@Override
	//Lo necesito para que se muestren correctamente los elementos del array automoviles
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anyoFabricacion="
				+ anyoFabricacion + ", motor=" + motor + ", potencia=" + potencia + "]";
	}
}
	



