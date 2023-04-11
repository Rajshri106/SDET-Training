package JavaTutorial;

public class AbstractRun {

    public static void main(String[] args) {
        AbstractDemo abstractCircle = new AbstractCircle();
        abstractCircle.moveTo(4, 7);
        abstractCircle.draw();
        abstractCircle.resize();
    }
}
