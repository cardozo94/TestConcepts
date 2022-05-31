package oop.banco;

import java.util.List;

public class CuentaAhorros extends Cuenta {
	
	private int numeroMaxOperaciones;
	private int operacionesActuales;
	private double tasaInteresAnual;
	
	public CuentaAhorros(List<Cliente> propietarios, int numeroMaxOperaciones, double tasaInteresAnual) {
		super(propietarios);
		this.numeroMaxOperaciones = numeroMaxOperaciones;
		this.tasaInteresAnual = tasaInteresAnual;
		this.operacionesActuales = 1;
	}

	@Override
	public double extraccion(double monto) {
		if (this.operacionesActuales <= this.numeroMaxOperaciones) {
            if (this.balance >= monto) {
            	this.balance -= monto;
            	this.operacionesActuales += 1;

                return monto;
            }
        }
        return 0;
	}
	
	public int getNumeroMaxOperaciones() {
		return this.numeroMaxOperaciones;
	}
	
	public double getTasaInteresAnual() {
		return this.tasaInteresAnual;
	}
}
