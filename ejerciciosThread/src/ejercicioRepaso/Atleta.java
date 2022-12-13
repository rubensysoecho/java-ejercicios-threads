package ejercicioRepaso;

import java.text.DecimalFormat;

public class Atleta extends Thread{

	private int dorsal;
	private String nombre;
	private double tiempo_carrera;
	private Carrera carreraAsociada;
	
	private static final DecimalFormat df = new DecimalFormat("0.000");
	
	public Atleta(int dorsal, String nombre, Carrera carrera) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.carreraAsociada = carrera;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo_carrera() {
		return tiempo_carrera;
	}

	public void setTiempo_carrera(double tiempo_carrera) {
		this.tiempo_carrera = tiempo_carrera;
	}

	@Override
	public void run() {
		carreraAsociada.correr(this);
	}

	@Override
	public String toString() {
		return "Atleta [Dorsal=" + dorsal + ", Nombre=" + nombre + ", Tiempo=" + df.format(tiempo_carrera / 1000) + " segundos]";
	}
	
}
