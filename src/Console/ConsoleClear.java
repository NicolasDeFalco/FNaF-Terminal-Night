package Console;

import java.io.IOException;

public class ConsoleClear {
    public final static void clear() throws IOException, InterruptedException {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");  
    System.out.flush(); 
            }
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }
}
