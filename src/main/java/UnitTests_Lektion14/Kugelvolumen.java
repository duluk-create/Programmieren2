package UnitTests_Lektion14;

public class Kugelvolumen {
    public static double berechneKugelvolumen(double radius){
            if (radius < 0)
                throw new RuntimeException("Wert kleiner 0"); //sinnvolle Maßnahme bei negativem Radius
            return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        System.out.println(berechneKugelvolumen(-3));
    }
}
