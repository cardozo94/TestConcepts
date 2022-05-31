package oop.banco;

import java.util.List;

public class CuentaCorriente extends Cuenta {
	
	private double montoSobregiro;
	private double interesesMontoInsuficiente;
	
	public CuentaCorriente(List<Cliente> propietarios, double montoSobregiro, double interesMontoInsuficiente) {
		super(propietarios);
		this.montoSobregiro = montoSobregiro;
		this.interesesMontoInsuficiente = interesMontoInsuficiente;
	}

	@Override
	public double extraccion(double monto) {
		if (this.balance >= monto) {
			this.balance -= monto;
            return monto;
        } else if ((monto - this.balance) <= this.montoSobregiro) {
        	this.balance -= monto + this.interesesMontoInsuficiente;
            return monto;
        }
        return 0;
	}

	public Object getMontoSobregiro() {
		return this.montoSobregiro;
	}

	public Object getInteresFondosInsuficiente() {
		return this.interesesMontoInsuficiente;
	}
	
	
}
