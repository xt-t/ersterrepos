import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    @Test
    void forFakultaeteins() {
        assertEquals(1, Fakultaet.forFakultaet(0));
    }

    @Test
    void forFakultaetzwei() {
        assertEquals(1, Fakultaet.forFakultaet(1));
    }

    @Test
    void forFakultaetdrei() {
        assertEquals(2, Fakultaet.forFakultaet(2));
    }

    @Test
    void forFakultaetvier() {
        assertEquals(6, Fakultaet.forFakultaet(3));
    }

    @Test
    void whileFakultaeteins() {
        assertEquals(1, Fakultaet.whileFakultaet(0));
    }

    @Test
    void whileFakultaetzwei() {
        assertEquals(1, Fakultaet.whileFakultaet(1));
    }

    @Test
    void whileFakultaetdrei() {
        assertEquals(2, Fakultaet.whileFakultaet(2));
    }

    @Test
    void whileFakultaetvier() {
        assertEquals(6, Fakultaet.whileFakultaet(3));
    }

    @Test
    void rekursionFakultaeteins() {
        assertEquals(1, Fakultaet.rekursionFakultaet(0));
    }

    @Test
    void reskursionFakultaetzwei() {
        assertEquals(1, Fakultaet.rekursionFakultaet(1));
    }

    @Test
    void rekursionFakultaetdrei() {
        assertEquals(2, Fakultaet.rekursionFakultaet(2));
    }

    @Test
    void rekursionFakultaetvier() {
        assertEquals(6, Fakultaet.rekursionFakultaet(3));
    }
}