package Game.Class.Animatronic;

import Game.Class.AnimatronicData;

public class Bonnie extends AnimatronicData {
    public Bonnie(int timer) {
        super(timer);
        //TODO Auto-generated constructor stub
    }

    private static String cam = "1A";

    public final String[] camera = new String[] {"1A", "1B", "5", "3", "2A", "2B"};

    public static void setCam(String cam) {
        Bonnie.cam = cam;
    }

    public static String getCam() {
        return cam;
    }
}

