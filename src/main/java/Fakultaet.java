public class Fakultaet {
    public static int forFakultaet(int a) {
        int fak6 = 1;
        for (int i = 1; i <= a; i++) {
            fak6 = i * fak6;
        }
        return fak6;
    }

    public static int whileFakultaet(int a) {
        int fak = 1;
        while (a > 0) {
            fak = a * fak;
            a--;
        }
        return fak;
    }

    public static int rekursionFakultaet(int a) {
        if (a < 1) {
            return 1;
        } else {
            return (a * rekursionFakultaet(a - 1));
        }
    }
}
