package UnitTests_Lektion14;

public class Punkt {
    static int x;
    static int y;

    public static void verschiebePunkt(int zielX, int zielY){
        if(zielX > 1920 || zielX < 0) throw new RuntimeException("x ist ungültig");
        else x = zielX;
        if(zielY > 1080 || zielY < 0) throw new RuntimeException("y ist ungültig");
        else y = zielY;
    }

}
