package JavaTutorial;

public abstract class AbstractDemo {
    public void moveTo(int newS, int newY) {
        System.out.println("move to x: " + newS + " and y:" + newY);
    }

    public abstract void draw();

    public abstract void resize();
}