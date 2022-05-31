package oop.banco.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import oop.banco.Cliente;

public class ClienteTest {
    @Test
    public void constructorDebeInicializarCampos() {
        // Entorno
        String nombre = "Juan P�rez";
        Cliente cliente;
        // Acci�n
        cliente = new Cliente(nombre);
        // Assert
        assertEquals(nombre, cliente.getNombre());
    }
}