public class SwitchAlarm {
    /*
    Alarmstufe “rot”: keine Personen erlaubt
    Alarmstufe “gelb”: max 30 Personen erlaubt
    Alarmstufe “grün”: max 60 Personen erlaubt
    */
    public static String alarm(String a) {
        switch (a) {
            case "rot":
                return ("keine Personen erlaubt");
            case "gelb":
                return ("max 30 Personen erlaubt");
            case "grün":
                return ("max 60 Personen erlaubt");
            default:
                return ("Falsche Eingabe.");
        }
    }
}
