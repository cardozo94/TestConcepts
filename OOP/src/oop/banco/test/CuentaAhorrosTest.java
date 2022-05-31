package oop.banco.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import oop.banco.Cliente;
import oop.banco.Cuenta;
import oop.banco.CuentaAhorros;

public class CuentaAhorrosTest {
    @Test
    public void constructorDebeInicializarCampos() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        int numeroMaxOperaciones = 5;
        double tasaInteresAnual = 0.25;
        CuentaAhorros cuenta;
        // Acción
        cuenta = new CuentaAhorros(propietarios, numeroMaxOperaciones, tasaInteresAnual);
        // Assert
        assertEquals(numeroMaxOperaciones, cuenta.getNumeroMaxOperaciones());
        assertEquals(tasaInteresAnual, cuenta.getTasaInteresAnual(), 0.05);
    }
    @Test
    public void extraccionConBalancePositivoDebeRetornarMonto() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        int numeroMaxOperaciones = 5;
        double tasaInteresAnual = 0.25;
        Cuenta cuenta = new CuentaAhorros(propietarios, numeroMaxOperaciones, tasaInteresAnual);
        cuenta.deposito(150);
        double value;
        // Acción
        value = cuenta.extraccion(150);
        // Assert
        assertEquals(150, value, 0.05);
        assertEquals(0, cuenta.getBalance(), 0.05);
    }
    @Test
    public void extraccionConMontoSuperiorAlBalanceDebeRetornarCero() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        int numeroMaxOperaciones = 5;
        double tasaInteresAnual = 0.25;
        Cuenta cuenta = new CuentaAhorros(propietarios, numeroMaxOperaciones, tasaInteresAnual);
        cuenta.deposito(150);
        double value;
        // Acción
        value = cuenta.extraccion(200);
        // Assert
        assertEquals(0, value, 0.05);
        assertEquals(150, cuenta.getBalance(), 0.05);
    }
    @Test
    public void extraccionSuperandoNumeroMaxOperacionesDebeRetornarCero() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        int numeroMaxOperaciones = 3;
        double tasaInteresAnual = 0.25;
        Cuenta cuenta = new CuentaAhorros(propietarios, numeroMaxOperaciones, tasaInteresAnual);
        cuenta.deposito(5000);
        double value;
        // Acción
        cuenta.extraccion(10);
        cuenta.extraccion(150);
        cuenta.extraccion(200);
        value = cuenta.extraccion(320);
        // Assert
        assertEquals(0, value, 0.05);
        assertEquals(4640, cuenta.getBalance(), 0.05);
    }
}
