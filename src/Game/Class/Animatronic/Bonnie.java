package Game.Class.Animatronic;

import Game.Class.AnimatronicData;

public class Bonnie extends AnimatronicData {
    public Bonnie(int timer) {
        super(timer);
        //TODO Auto-generated constructor stub
    }

    private static String cam = "cam1A";

    public final String[] camera = new String[] {"cam1A", "cam1B", "cam5", "cam3", "cam2A", "cam2B"};

    public static void setCam(String cam) {
        Bonnie.cam = cam;
    }

    public static String getCam() {
        return cam;
    }
}

