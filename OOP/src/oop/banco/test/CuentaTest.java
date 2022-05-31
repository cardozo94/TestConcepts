package oop.banco.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import oop.banco.Cliente;
import oop.banco.Cuenta;
import oop.banco.CuentaAhorros;

public class CuentaTest {
    @Test
    public void constructorDebeInicializarCampos() {
        // Entorno
        List<Cliente> propietarios = new ArrayList<Cliente>();
        propietarios.add(new Cliente("Juan Landa"));
        propietarios.add(new Cliente("Laura Faverio"));
        propietarios.add(new Cliente("Sofia Morata"));
        Cuenta cuenta;
        // Acción
        cuenta = new CuentaAhorros(propietarios, 0, 0);
        // Assert
        assertEquals(3, cuenta.getPropietarios().size());
        assertEquals(0, cuenta.getBalance(), 0.05);
    }
    @Test
    public void depositoDeberiaSumarMontoAlBalance() {
        // Entorno
        double monto = 10.5;
        Cuenta cuenta = new CuentaAhorros(new ArrayList<>(), 0, 0);
        // Acción
        cuenta.deposito(monto);
        // Assert
        assertEquals(monto, cuenta.getBalance(), 0.05);
    }
}
