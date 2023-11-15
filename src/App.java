import java.util.InputMismatchException;
import java.util.Scanner;
import Console.ConsoleClear;
import Game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        // Variable decleration
        int input;

        // Clear the console
        ConsoleClear.clear();

        // Print the main menu
        System.out.println(
                        "       ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______      \r\n"+ //
                        "      |______|______|______|______|______|______|______|______|______|______|______|______|______|______|     \r\n"+ //
                        "     / /                                                                                               \\ \\    \r\n"+ //
                        "    / /                                                                                                 \\ \\   \r\n"+ //
                        "   / /                                                                                                   \\ \\  \r\n"+ //
                        "  / /                                                                                                     \\ \\ \r\n"+ //
                        " /_/_  ______ _             _   _ _       _     _           _     ______            _     _       _      __\\_\\\r\n"+ //
                        "  / / |  ____(_)           | \\ | (_)     | |   | |         | |   |  ____|          | |   | |     ( )     \\ \\  \r\n"+ //
                        " | |  | |__   ___   _____  |  \\| |_  __ _| |__ | |_    __ _| |_  | |__ _ __ ___  __| | __| |_   _|/ ___   | | \r\n" + //
                        " | |  |  __| | \\ \\ / / _ \\ | . ` | |/ _` | '_ \\| __|  / _` | __| |  __| '__/ _ \\/ _` |/ _` | | | | / __|  | | \r\n"+ //
                        " | |  | |    | |\\ V /  __/ | |\\  | | (_| | | | | |_  | (_| | |_  | |  | | |  __/ (_| | (_| | |_| | \\__ \\  | | \r\n"+ //
                        " | |  |_|    |_| \\_/ \\___| |_| \\_|_|\\__, |_| |_|\\__|  \\__,_|\\__| |_|  |_|  \\___|\\__,_|\\__,_|\\__, | |___/  | | \r\n"+ //
                        "  \\_\\_               _______         __/ |    _             _   _   _ _       _     _        __/ |      _/_/  \r\n"+ //
                        "   / /              |__   __|       |___/    (_)           | | | \\ | (_)     | |   | |      |___/       \\ \\   \r\n"+ //
                        "  | |                  | | ___ _ __ _ __ ___  _ _ __   __ _| | |  \\| |_  __ _| |__ | |_                  | |  \r\n"+ //
                        "  | |                  | |/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` | | | . ` | |/ _` | '_ \\| __|                 | |  \r\n"+ //
                        "  | |                  | |  __/ |  | | | | | | | | | | (_| | | | |\\  | | (_| | | | | |_                  | |  \r\n"+ //
                        "  | |                  |_|\\___|_|  |_| |_| |_|_|_| |_|\\__,_|_| |_| \\_|_|\\__, |_| |_|\\__|                 | |  \r\n"+ //
                        "   \\_\\_____ ______ ______                                                __/ |       ______ ______ _____/_/   \r\n"+ //
                        "    |______|______|______|                                              |___/       |______|______|______|    ");
        System.out.println(
                "______________________________________________________________________________________________________________");
        System.out.printf("                            |New game: 1|  |Continue(Night %d): 2|      |Exit: 3|\n", 1);
        System.out.println(
                "______________________________________________________________________________________________________________");
        try (Scanner userInput = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Select an option: ");
                    input = userInput.nextInt();
                    if (input == 1 || input == 2 || input == 3) {
                        switch (input) {
                            case 1:
                                Night.newNight();
                                Night.night();
                                Game.start();
                                ConsoleClear.clear();
                                break;
                            case 3:
                                System.exit(0);;
                            default:
                                System.out.println("Invalid input!");
                        }
                    }                    
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input!");
                    userInput.next();
                }

            }
        }
    }
}
