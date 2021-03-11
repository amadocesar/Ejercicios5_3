package Ejercicio5_11;

import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ej511_test {
    Cliente miCliente;
    Cuenta miCuenta;

    @BeforeEach
    void setUp() throws DNIException {
        miCliente = new Cliente("Prueba", "31676341M", "666777333");
//        miCuenta = new Cuenta(miCliente, "ES330182314066666666666", 10.0f);
        miCuenta = new Cuenta();
        miCuenta.setCliente(miCliente);
        miCuenta.setCodigoCuenta("jkgjksgkjsdhfkjsd");
        miCuenta.setSaldo(10);
        miCuenta.setCodigoCuenta("qqqqqqqqqqqqqqqq");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void constructor() {
        assertDoesNotThrow(() -> new Cliente("Prueba", "31676341M", "672332299"));
        assertThrows(DNIException.class, () -> new Cliente("Prueba", "31676341J", "672332299"));
    }

    @Test
    void getSetNombre() {
        assertEquals("Prueba", miCliente.getNombre());
        miCliente.setNombre("Otra");
        assertEquals("Otra", miCliente.getNombre());
    }

    @Test
    @SneakyThrows
    void getSetDNI() {
        assertEquals("31676341M", miCliente.getDNI());
        assertThrows(DNIException.class, () -> miCliente.setDNI(""));
        assertDoesNotThrow(() -> miCliente.setDNI("47411154N"));
    }
    @Test
    void getSetMovil() {
        assertEquals("666777333", miCliente.getTelefono());
        miCliente.setTelefono("Otro");
        assertEquals("Otro", miCliente.getTelefono());
    }
}
/*
@Test
void getSetMovil() {
    assertEquals("666777333", miCliente.getMovil());
    miCliente.setMovil("Otro");
    assertEquals("Otro", miCliente.getMovil());
}

@Test
@SneakyThrows
void getSetDNI() {
    assertEquals("31676341M", miCliente.getDNI());
    assertThrows(DNIException.class, () -> miCliente.setDNI(""));
    assertDoesNotThrow(() -> miCliente.setDNI("77497541F"));
}

@Test
    void constructor() {
        assertDoesNotThrow(() -> new Cliente("Prueba", "Cliente", "31676341M", "672332299"));
        assertThrows(DNIException.class, () -> new Cliente("Prueba", "Cliente", "31676341J", "672332299"));
    }
    Cliente miCliente;
    Cuenta miCuenta;

    @BeforeEach
    void setUp() throws DNIException {
        miCliente = new Cliente("Prueba", "Cliente", "31676341M", "666777333");
        miCuenta = new Cuenta(miCliente, "ES330182314066666666666", 10.0f);
        miCuenta = new Cuenta();
        miCuenta.setCliente(miCliente);
        miCuenta.setIBAN("jkgjksgkjsdhfkjsd");
        miCuenta.setSaldo(10.0f);
        miCuenta.setIBAN("qqqqqqqqqqqqqqqq");
    }

    @AfterEach
    void tearDown() {
    }*/