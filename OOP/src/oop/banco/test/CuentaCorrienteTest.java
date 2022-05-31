package oop.banco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import oop.banco.Cliente;
import oop.banco.Cuenta;
import oop.banco.CuentaCorriente;

public class CuentaCorrienteTest {
    @Test
    public void constructorDebeInicializarCampos() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        int montoSobregiro = 100;
        int interesFondosInsuficiente = 5;
        CuentaCorriente cuenta;
        // Act
        cuenta = new CuentaCorriente(propietarios, montoSobregiro, interesFondosInsuficiente);
        // Assert
        assertEquals(montoSobregiro, cuenta.getMontoSobregiro());
        assertEquals(interesFondosInsuficiente, cuenta.getInteresFondosInsuficiente());
    }

    @Test
    public void extraccionConBalancePositivoDebeRetornarMonto() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<>();
        int montoSobregiro = 100;
        int interesFondosInsuficiente = 5;
        Cuenta cuentaCorriente = new CuentaCorriente(propietarios, montoSobregiro, interesFondosInsuficiente);
        cuentaCorriente.deposito(200);
        double value;
        // Act
        value = cuentaCorriente.extraccion(150);
        // Assert
        assertEquals(150, value);
        assertEquals(50, cuentaCorriente.getBalance());
    }

    @Test
    public void extraccionConMontoSobregiroValidoDebeRetornarMonto() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<>();
        int montoSobregiro = 100;
        int interesFondosInsuficiente = 5;
        Cuenta cuentaCorriente = new CuentaCorriente(propietarios, montoSobregiro, interesFondosInsuficiente);
        cuentaCorriente.deposito(150);
        double value;
        // Act
        value = cuentaCorriente.extraccion(200);
        // Assert
        assertEquals(200, value);
        assertEquals(-55, cuentaCorriente.getBalance());
    }

    @Test
    public void extraccionConMontoSobregiroInvalidoDebeRetornarCero() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<>();
        int montoSobregiro = 50;
        int interesFondosInsuficiente = 5;
        Cuenta cuentaCorriente = new CuentaCorriente(propietarios, montoSobregiro, interesFondosInsuficiente);
        cuentaCorriente.deposito(150);
        double value;
        // Act
        value = cuentaCorriente.extraccion(201);
        // Assert
        assertEquals(0, value);
        assertEquals(150, cuentaCorriente.getBalance());
    }
}