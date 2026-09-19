/**
* Burner Class
*
* @author Nick Terrill
* @author Aiden Zeigler
*
* Purpose: Creates the Burner class, 
* which has variables to hold it's temperature, setting, and timer.
*/

public class Burner {
    public enum Temperature {BLAZING, HOT, WARM, COOL};
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;

    public static final int TIME_DURATION = 2;

    public Burner() {
        myTemperature = Temperature.COOL;
        mySetting = Setting.OFF;
        timer = 0;
    }

    public Temperature getTemperature() {
        return myTemperature;
    }

    // Changes the burner's setting up one
    public void plusButton() {
        switch (mySetting) {
            case OFF:
                mySetting = Setting.LOW;
                break;
            case LOW:
                mySetting = Setting.MEDIUM;
                break;
            case MEDIUM:
                mySetting = Setting.HIGH;
                break;
            case HIGH:
                break; // No setting higher
        }
        timer = TIME_DURATION;
    }

    // Changes the burner's setting down one
    public void minusButton() {
        switch (mySetting) {
            case OFF:
                break; // No setting lower
            case LOW:
                mySetting = Setting.OFF;
                break;
            case MEDIUM:
                mySetting = Setting.LOW;
                break;
            case HIGH:
                mySetting = Setting.MEDIUM;
                break;
        }
        timer = TIME_DURATION;
    }

    // Updates the burner's temperature, based on it's setting
    public void updateTemperature() {
        switch (mySetting) {
            case OFF:
                myTemperature = Temperature.COOL;
                break;
            case LOW:
                myTemperature = Temperature.WARM;
                break;
            case MEDIUM:
                myTemperature = Temperature.HOT;
                break;
            case HIGH:
                myTemperature = Temperature.BLAZING;
                break;
        }
        timer++;
    }

    // Displays the burner's setting along with it's temperature
    public void display() {
        switch (mySetting) {
            case OFF:
                System.out.println("[" + mySetting + "].....cooool");
                break;
            case LOW:
                System.out.println("[" + mySetting + "].....warm");
                break;
            case MEDIUM:
                System.out.println("[" + mySetting + "].....CAREFUL");
                break;
            case HIGH:
                System.out.println("[" + mySetting + "].....VERY HOT! DON'T TOUCH");
                break;
        }
    }

}