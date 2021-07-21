package examen3ev;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>,Serializable  {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private Integer curso;
	
	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String ciclo, Integer curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getCiclo() {
		return ciclo;
	}
	public Integer getCurso() {
		return curso;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, ciclo, curso, fechaNacimiento, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(ciclo, other.ciclo)
				&& Objects.equals(curso, other.curso) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciclo=" + ciclo + ", curso=" + curso + "]";
	}
	@Override
	public int compareTo(Alumno o) {
		int compare=apellidos.compareTo(o.apellidos);
		if(compare==0)
			compare=nombre.compareTo(o.nombre);
		return compare;
	}
	
	

}
