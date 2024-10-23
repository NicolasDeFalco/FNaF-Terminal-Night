package Game;

import java.io.IOException;

import Console.ConsoleClear;
import Game.Class.Door;
import NightDisplay.Office;
import NightDisplay.Camera.CamOne;

public class Game {

    public static void start() throws IOException, InterruptedException {
        int input = 0;
        Door leftDoor = new Door(false);
        Door rightDoor = new Door(true);
        while (true) {
            try {
                ConsoleClear.clear();
                System.out.println(Office.officeFront);
                System.out.print("Select an option: ");
                input = Integer.parseInt(System.console().readLine());
                switch (input) {
                    case 1:
                        ConsoleClear.clear();
                        camera();
                        break;
                    case 2:
                        doorView(leftDoor);;
                        break;
                    case 3:
                        doorView(rightDoor);;
                        break;    
                    case 4:
                        ConsoleClear.clear();
                        System.exit(0);
                    default:
                        System.out.print("Invalid input");
                }
            } catch (NumberFormatException e) {}

        }
    }

    public static void doorView(Door door) throws IOException, InterruptedException {
        int input = 0;
        while (true) {
            try {
                ConsoleClear.clear();
                System.out.println(door.doorState());
                System.out.print("Select an option: ");
                input = Integer.parseInt(System.console().readLine());
                switch (input) {
                    case 1:
                        if (!door.getLight())
                            door.setLight(true);
                        else
                            door.setLight(false);
                        break;
                    case 2:
                        if (!door.getDoor())
                            door.setDoor(true);
                        else
                            door.setDoor(false);
                        break;
                    case 3:
                        door.setLight(false);
                        return;
                    default:
                        System.out.print("Invalid input");
                }
            } catch (NumberFormatException e) {}

        }

    }

    public static void camera() throws IOException, InterruptedException {
        int input = 0;

        while (true) {
            try {
                ConsoleClear.clear();
                System.out.println(CamOne.camOneAll);
                System.out.print("Select an option: ");
                input = Integer.parseInt(System.console().readLine());

                switch (input) {
                    case 1:
                        ConsoleClear.clear();
                        return;
                    default:
                        break;
                }
                System.out.println("Invalid input!");
            } catch (NumberFormatException e) {}
        }
    }
}