package Game.Class.Animatronic;

import Game.Class.AnimatronicData;

public class Chica extends AnimatronicData{
    public Chica(int timer) {
        super(timer);
        //TODO Auto-generated constructor stub
    }

    private static String cam = "1A";

    public final String[] camera = new String[] {"1A", "1B", "7", "6", "4A", "4B"};

    public static void setCam(String cam) {
        Chica.cam = cam;
    }

    public static String getCam() {
        return cam;
    }
}
