import Console.ConsoleClear;
import NightDisplay.NightStart;

public class Night {
    public static void night() throws Exception {
        // Clear console
        ConsoleClear.clear();

        // Night Start
        System.out.println(NightStart.nightOne);
        Thread.sleep(5000);
    }

    public static void newNight() throws Exception {
        // Clear console
        ConsoleClear.clear();

        // Night Start
        System.out.println(NightStart.newGame);
        Thread.sleep(5000);
    }
}
