package Game.Class.Animatronic;

import Game.Class.AnimatronicData;

public class Freddy extends AnimatronicData {
    public Freddy(int timer) {
        super(timer);
        //TODO Auto-generated constructor stub
    }

    private static String cam = "cam1A";

    public final String[] camera = new String[] {"cam1A", "cam1B", "cam7", "cam6", "cam4A", "cam4B"};

    public static void setCam(String cam) {
        Freddy.cam = cam;
    }

    public static String getCam() {
        return cam;
    }
}
