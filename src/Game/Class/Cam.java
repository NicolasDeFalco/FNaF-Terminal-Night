package Game.Class;

import NightDisplay.CamSelector;
import NightDisplay.Camera.*;
import Console.ConsoleClear;

import java.io.IOException;

public class Cam {
    private String camId;

    Cam(String newCamId) {
        this.camId = newCamId;
    };

    public void setCamId(String newCamId) {
        this.camId = newCamId;
    }

    public String getCamId() {
        return this.camId;
    }

    public static String showCam(String current) {
        switch (current) {
            case "1A":
                return CamOneA.camOneAOne;

            case "1B":
                return CamOneB.camOneAll;

            case "1C":
                return CamOneC.camOneCOne;
            
            case "2A":
                return CamTwoA.camTwoAOne;
            
            case "2B":
                return CamTwoB.camTwoBOne;
        }
        return current;
    }

    public static String showCamSelect(String current) throws IOException, InterruptedException {
        ConsoleClear.clear();
        try {
            while (true) {
                System.out.println(CamSelector.camSelector);
                System.out.print("Select an option: ");
                String res = System.console().readLine();
                ConsoleClear.clear();
                switch (res) {
                    case "1A":
                        return "1A";

                    case "1B":
                        return "1B";

                    case "1C":
                        return "1C"; 
                        
                    case "2A":
                        return "2A";

                    case "2B":
                        return "2B";

                    case "1":
                        return current;

                    default:
                        ConsoleClear.clear();
                        break;
                }

            }
        } catch (Exception e) {}
        return current;
    }

}
