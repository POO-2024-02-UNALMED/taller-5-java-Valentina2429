package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado=new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		this(null,0,null,null,null,0);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		Pez.listado.add(this);
	}
	
	
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado=listado;
	}
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
		
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	
	public int cantidadPeces() {
		return Pez.listado.size();
		
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez Pez=new Pez(nombre, edad,"oceano", genero, "rojo", 6);
		Pez.salmones++;
		return Pez;
		
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez Pez=new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos++;
		return Pez;
	}

}
