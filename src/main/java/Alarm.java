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
        return switch (a) {
            case "rot" -> ("keine Personen erlaubt");
            case "gelb" -> ("max 30 Personen erlaubt");
            case "grün" -> ("max 60 Personen erlaubt");
            default -> ("Falsche Eingabe!");
        };
    }
}
