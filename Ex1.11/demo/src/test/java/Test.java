package test.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TorreDeHanoiTest {

    @Test
    public void testTorreDeHanoiComZeroDiscos() {
        assertEquals(0, TorreDeHanoi.torreDeHanoi(0));
    }

    @Test
    public void testTorreDeHanoiComUmDisco() {
        assertEquals(1, TorreDeHanoi.torreDeHanoi(1));
    }

    @Test
    public void testTorreDeHanoiComTresDiscos() {
        assertEquals(7, TorreDeHanoi.torreDeHanoi(3));
    }

    @Test
    public void testTorreDeHanoiComCincoDiscos() {
        assertEquals(31, TorreDeHanoi.torreDeHanoi(5));
    }
}