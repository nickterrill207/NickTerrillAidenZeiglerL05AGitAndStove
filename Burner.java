public class Burner {
    private enum Temperature {BLAZING, HOT, WARM, COOL};
    private Temperature myTemperature;
    private Setting mySetting;
    private int timer;

    public static final int TIME_DURATION = 2;

    public Burner() {
        myTemperature = Temperature.COOL;
        mySetting = Setting.OFF;
        timer = 0;
    }

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
                break;
        }
        timer = TIME_DURATION;
    }

    public void minusButton() {
        switch (mySetting) {
            case OFF:
                break;
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

    public void display() {
        switch (mySetting) {
            case OFF:
                System.out.println(mySetting + ".....cooool");
                break;
            case LOW:
                System.out.println(mySetting + ".....warm");
                break;
            case MEDIUM:
                System.out.println(mySetting + ".....CAREFUL");
                break;
            case HIGH:
                System.out.println(mySetting + ".....VERY HOT! DON'T TOUCH");
                break;
        }
    }

}