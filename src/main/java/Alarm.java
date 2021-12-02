public class Alarm {
    //Anzahl über 30 liegt, gib den String “Zu viele Personen zurück”
    //Anzahl unter 30 liegt, gib den String “Maximale Personenzahl nicht überschritten”
    public static String AnzahlPersonen(int a) {
        if (0 <= a && a <= 30) {
            return ("Maximale Personenzahl nicht überschritten");
        } else {
            return ("Zu viele Personen");
        }
    }

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
