package Ejercicio5_13;

import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ej513_test {
    Punto coordenada;
    Circulo micirculo;

    @BeforeEach
    void setUp() throws NumberException {
        coordenada = new Punto(2,5);
        micirculo = new Circulo(coordenada, "verde", 6);
    }

    @AfterEach
    void tearDown(){}

    @Test
    @SneakyThrows
    void getSetX(){
        assertEquals(2, coordenada.getX());
        assertThrows(NumberException.class, () -> coordenada.setX(-7));
        assertDoesNotThrow(() -> coordenada.setX(9));
    }

    @Test
    @SneakyThrows
    void getSetY(){
        assertEquals(5, coordenada.getY());
        assertThrows(NumberException.class, () -> coordenada.setY(-8));
        assertDoesNotThrow(() -> coordenada.setY(10));
    }

    @Test
    void getSetColor(){
        assertEquals("verde", micirculo.getColor());
        micirculo.setColor("azul");
        assertEquals("azul", micirculo.getColor());
    }

    @Test
    @SneakyThrows
    void getSetDiametro(){
        assertEquals(6, micirculo.getDiametro());
        assertThrows(NumberException.class, () -> micirculo.setDiametro(-9));
        assertDoesNotThrow(() -> micirculo.setDiametro(11));
    }
}
