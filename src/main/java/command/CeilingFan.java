package command;

public class CeilingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int ROW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        level = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void row() {
        level = ROW;
        System.out.println(location + " ceiling fan is on row");
    }

    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
