package oop.banco;

public class Cliente {
	
	private int id;
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
        return this.nombre;
    }

}
