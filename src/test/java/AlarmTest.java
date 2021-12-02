import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void anzahlPersonen() {
        assertNotEquals("Zu viele Personen", Alarm.AnzahlPersonen(12));
        assertEquals("Zu viele Personen", Alarm.AnzahlPersonen(31));
    }
    @Test
    void anzahlPersonen1() {
        assertNotEquals("Maximale Personenzahl nicht überschritten", Alarm.AnzahlPersonen(31));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.AnzahlPersonen(25));
    }

    /*
        Alarmstufe “rot”: keine Personen erlaubt
        Alarmstufe “gelb”: max 30 Personen erlaubt
        Alarmstufe “grün”: max 60 Personen erlaubt
        */
    @Test
    void alarmrot() {
        assertEquals("keine Personen erlaubt", Alarm.alarm("rot"));
    }
    @Test
    void alarmgelb() {
        assertEquals("max 30 Personen erlaubt", Alarm.alarm("gelb"));
    }
    @Test
    void alarmgruen() {
        assertEquals("max 60 Personen erlaubt", Alarm.alarm("grün"));
    }
    @Test
    void alarmdefault() {
        assertEquals("Falsche Eingabe.", Alarm.alarm("fsfwg"));
    }
    }