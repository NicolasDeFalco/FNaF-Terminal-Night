package Game.Class;

import NightDisplay.LeftDoor;
import NightDisplay.RightDoor;

public class Door {
    // Class attribute
    private boolean position;
    private boolean light = false;  
    private boolean door = false;
    private boolean animatronicPresence = false;

    // Constructor
    public Door(boolean sposition) {
        this.position = sposition;
    }

    // Set and Get
    public boolean getPosition() {
        return position;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public boolean getDoor() {
        return door;
    } 

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean getLight() {
        return light;
    } 

    public void setAnimatronic(boolean animatronicPresence) {
        this.animatronicPresence = animatronicPresence;
    }

    public boolean getAnimatronic() {
        return animatronicPresence;
    }
    
    // Class functions
    public String doorState() {
        if (!position) {
            if (!light && !door) {
                return LeftDoor.leftDoorOne;
            } else if (light && !animatronicPresence && !door) {
                return LeftDoor.leftDoorTwo;
            } else if (!light && door) {
                return LeftDoor.leftDoorThree;
            } else {
                return LeftDoor.leftDoorFour;
            }
        } else {
            if (!light && !door) {
                return RightDoor.rightDoorOne;
            } else if (light && !animatronicPresence && !door) {
                return RightDoor.rightDoorTwo;
            } else if (!light && door) {
                return RightDoor.rightDoorThree;
            } else {
                return RightDoor.rightDoorFour;
            }
        }
    }
}
