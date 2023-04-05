package JavaTutorial;

public abstract class AbstractDemo {
    public void moveTo(int newS, int newY) {
        System.out.println("move to x: " + newS + " and y:" + newY);
    }

    abstract void draw();

    abstract void resize();
}