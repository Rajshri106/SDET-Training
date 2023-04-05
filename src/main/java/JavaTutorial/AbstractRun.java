package JavaTutorial;

public class AbstractRun {

	public static void main(String[] args)
	{
		AbstractDemo c = new AbstractCircle();
		c.moveTo(4,7);
		c.draw();
		c.resize();
	}
}
