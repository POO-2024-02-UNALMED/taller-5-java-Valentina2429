package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal>animales= new ArrayList<>();

    public Zona(){
        this(null,null);
    }

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public Zoologico getZoo() {
		return zoo;
	}

    public  ArrayList<Animal> getAnimales() {
		return animales;
	}

    public void setAnimales(ArrayList<Animal> animales) {
		this.animales=animales;
	}

    public void agregarAnimales(Animal nuevo){
        animales.add(nuevo);

    }

    public int cantidadAnimales() {
        int TotalAnimales = animales.size();
    	return TotalAnimales;
    }

    
    
}
