package JavaTutorial;

public class MountainBike extends Inheritance {
    protected int setHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.setHeight = startHeight;
    }
    public void setHeight(int newValue) {
        setHeight = newValue;
    }
}