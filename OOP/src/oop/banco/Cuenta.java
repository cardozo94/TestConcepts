package oop.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Cuenta {
	
	protected double balance;
	protected List<Cliente> propietarios;
	
	public Cuenta(Collection<Cliente> propietarios) {
		this.propietarios = new ArrayList<Cliente>();
		this.balance =0;
		
		for(Cliente propietario: propietarios) {
			this.propietarios.add(propietario);
		}
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void deposito(double monto) {
		this.balance+=monto;
	}
	
	public List<Cliente> getPropietarios(){
		return this.propietarios;
	}
	
	public abstract double extraccion(double monto);
}
