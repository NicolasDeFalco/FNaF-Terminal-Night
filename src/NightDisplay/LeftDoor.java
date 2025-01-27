package NightDisplay;

public abstract class LeftDoor {
    public static final String leftDoorOne = "  _______________________________________________________________________________________________________________ \r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                              *                                                |\r\n" + //
            " |                    *                                                                      *                   |\r\n" + //
            " |                                           *                                                                   |\r\n" + //
            " |                         *                                         *                                           |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |           *                                                                                 *                 |\r\n" + //
            " |                                     *                                                                  *      |\r\n" + //
            " |     *                        ______________________________             *                                     |\r\n" + //
            " |                             |                              |       ________________________________           |\r\n" + //
            " |                      *      |                              |      |                                |          |\r\n" + //
            " |                             |                              |    * |                                |          |\r\n" + //
            " |                 _________   |                              |      |                                |          |\r\n" + //
            " |                |  _____  |  |                              |      |                                |          |\r\n" + //
            " |      *         | |     | |  |                              |      |                                |          |\r\n" + //
            " |                | |_____| |  |                              |      |                                |      *   |\r\n" + //
            " |                |  Door   |  |                              |      |                                |          |\r\n" + //
            " |                |  _____  |  |                              |      |                                |          |\r\n" + //
            " |    *           | |     | |  |                              | *    |                                |          |\r\n" + //
            " |                | |_____| |  |                              |      |________________________________|          |\r\n" + //
            " |                |  Light  |  |                              |                                                  |\r\n" + //
            " |________________|_________|__|                              |__________________________________________________|\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |_____________________________|______________________________|__________________________________________________|\r\n" + //
            " |       You look at the left door. You see 2 buttons: one to close the door and one to turn the light on.       |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |             Turn the light on: 1            Close the door: 2             Go back to desk: 3                  |\r\n" + //
            " |_______________________________________________________________________________________________________________|";

    public static final String leftDoorTwo = "  _______________________________________________________________________________________________________________ \r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                              *                                                |\r\n" + //
            " |                    *                                                                      *                   |\r\n" + //
            " |                                           *                                                                   |\r\n" + //
            " |                         *                                         *                                           |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |           *                                                                                 *                 |\r\n" + //
            " |                                     *                                                                  *      |\r\n" + //
            " |     *                        ______________________________             *                                     |\r\n" + //
            " |                             |##############################|       ________________________________           |\r\n" + //
            " |                      *      |##############################|      |################################|          |\r\n" + //
            " |                             |##############################|    * |################################|          |\r\n" + //
            " |                 _________   |##############################|      |################################|          |\r\n" + //
            " |                |  _____  |  |##############################|      |################################|          |\r\n" + //
            " |      *         | |     | |  |##############################|      |################################|          |\r\n" + //
            " |                | |_____| |  |##############################|      |################################|      *   |\r\n" + //
            " |                |  Door   |  |##############################|      |################################|          |\r\n" + //
            " |                |  _____  |  |##############################|      |################################|          |\r\n" + //
            " |    *           | |#####| |  |##############################| *    |################################|          |\r\n" + //
            " |                | |#####| |  |##############################|      |################################|          |\r\n" + //
            " |                |  Light  |  |##############################|                                                  |\r\n" + //
            " |________________|_________|__|##############################|__________________________________________________|\r\n" + //
            " |_____________________________|##############################|__________________________________________________|\r\n" + //
            " |                             |##############################|                                                  |\r\n" + //
            " |                             |##############################|                                                  |\r\n" + //
            " |_____________________________|##############################|__________________________________________________|\r\n" + //
            " |_____________________________|##############################|__________________________________________________|\r\n" + //
            " |                             |##############################|                                                  |\r\n" + //
            " |_____________________________|##############################|__________________________________________________|\r\n" + //
            " |                           The light is on. There is nothing beyond this door.                                 |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |             Turn the light off: 1            Close the door: 2             Go back to desk: 3                 |\r\n" + //
            " |_______________________________________________________________________________________________________________|";

    public static final String leftDoorThree = "  _______________________________________________________________________________________________________________ \r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                              *                                                |\r\n" + //
            " |                    *                                                                      *                   |\r\n" + //
            " |                                           *                                                                   |\r\n" + //
            " |                         *                                         *                                           |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |           *                                                                                 *                 |\r\n" + //
            " |                                     *                                                                  *      |\r\n" + //
            " |     *                        ______________________________             *                                     |\r\n" + //
            " |                             |/  /##/  /##/  /##/  /##/  /##|       ________________________________           |\r\n" + //
            " |                      *      |__/##/__/##/__/##/__/##/__/##/|      |                                |          |\r\n" + //
            " |                             |                              |    * |                                |          |\r\n" + //
            " |                 _________   |                              |      |                                |          |\r\n" + //
            " |                |  _____  |  |                              |      |                                |          |\r\n" + //
            " |      *         | |#####| |  |                              |      |                                |          |\r\n" + //
            " |                | |#####| |  |                              |      |                                |      *   |\r\n" + //
            " |                |  Door   |  |                              |      |                                |          |\r\n" + //
            " |                |  _____  |  |                              |      |                                |          |\r\n" + //
            " |    *           | |     | |  |                              | *    |                                |          |\r\n" + //
            " |                | |_____| |  |                              |      |________________________________|          |\r\n" + //
            " |                |  Light  |  |                              |                                                  |\r\n" + //
            " |________________|_________|__|                              |__________________________________________________|\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |_____________________________|______________________________|__________________________________________________|\r\n" + //
            " |                             | /##/  /##/  /##/  /##/  /##/ |                                                  |\r\n" + //
            " |_____________________________|/##/__/##/__/##/__/##/__/##/__|__________________________________________________|\r\n" + //
            " |           The door is closed. Somehow you feel safer, but you also remember that power is limited.            |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |               Turn the light on: 1            Open the door: 2             Go back to desk: 3                 |\r\n" + //
            " |_______________________________________________________________________________________________________________|";

    public static final String leftDoorFour = "  _______________________________________________________________________________________________________________ \r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |                                                              *                                                |\r\n" + //
            " |                    *                                                                      *                   |\r\n" + //
            " |                                           *                                                                   |\r\n" + //
            " |                         *                                         *                                           |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |           *                                                                                 *                 |\r\n" + //
            " |                                     *                                                                  *      |\r\n" + //
            " |     *                        ______________________________             *                                     |\r\n" + //
            " |                             |/  /##/  /##/  /##/  /##/  /##|       ________________________________           |\r\n" + //
            " |                      *      |__/##/__/##/__/##/__/##/__/##/|      |################################|          |\r\n" + //
            " |                             |                              |    * |################################|          |\r\n" + //
            " |                 _________   |                              |      |################################|          |\r\n" + //
            " |                |  _____  |  |                              |      |################################|          |\r\n" + //
            " |      *         | |#####| |  |                              |      |################################|          |\r\n" + //
            " |                | |#####| |  |                              |      |################################|      *   |\r\n" + //
            " |                |  Door   |  |                              |      |################################|          |\r\n" + //
            " |                |  _____  |  |                              |      |################################|          |\r\n" + //
            " |    *           | |#####| |  |                              | *    |################################|          |\r\n" + //
            " |                | |#####| |  |                              |      |################################|          |\r\n" + //
            " |                |  Light  |  |                              |                                                  |\r\n" + //
            " |________________|_________|__|                              |__________________________________________________|\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |                             |                              |                                                  |\r\n" + //
            " |_____________________________|                              |__________________________________________________|\r\n" + //
            " |_____________________________|______________________________|__________________________________________________|\r\n" + //
            " |                             | /##/  /##/  /##/  /##/  /##/ |                                                  |\r\n" + //
            " |_____________________________|/##/__/##/__/##/__/##/__/##/__|__________________________________________________|\r\n" + //
            " |     The door is closed and the light is on. You should probably turn the light off, power is limited here.    |\r\n" + //
            " |                                                                                                               |\r\n" + //
            " |              Turn the light off: 1            Open the door: 2             Go back to desk: 3                 |\r\n" + //
            " |_______________________________________________________________________________________________________________|";
}
