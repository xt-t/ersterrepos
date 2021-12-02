import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MayvinTestTest {

    @Test
    void summe() {
        assertEquals(9, MayvinTest.summe(5,4));
    }
    @Test
    void grosserWert() {
        assertTrue((MayvinTest.grosserWert(105)>100));
    }
}