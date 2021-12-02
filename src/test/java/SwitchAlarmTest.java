import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchAlarmTest {
    /*
        Alarmstufe “rot”: keine Personen erlaubt
        Alarmstufe “gelb”: max 30 Personen erlaubt
        Alarmstufe “grün”: max 60 Personen erlaubt
        */
    @Test
    void alarmrot() {
        assertEquals("keine Personen erlaubt", SwitchAlarm.alarm("rot"));
    }
    @Test
    void alarmgelb() {
        assertEquals("max 30 Personen erlaubt", SwitchAlarm.alarm("gelb"));
    }
    @Test
    void alarmgruen() {
        assertEquals("max 60 Personen erlaubt", SwitchAlarm.alarm("grün"));
    }
    @Test
    void alarmdefault() {
        assertEquals("Falsche Eingabe.", SwitchAlarm.alarm("fsfwg"));
    }
}