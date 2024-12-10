package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;

    public void setNombre(String nombre){
        this.nombre = nombre
    }

    public String getNombre() {
		return nombre;
	}
     
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

    public void setZonas(ArrayList<Zona> zonas) {
		this.zonas=zonas;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
    public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (int i = 0; i < zonas.length; i++){
            totalAnimales += zonas[i].cantidadAnimales();
        }
        return totalAnimales;
        
    }

}
