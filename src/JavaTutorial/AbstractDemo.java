package JavaTutorial;

public abstract class AbstractDemo {
 
	int x,y;
	
	void moveTo(int newS, int newY)
	{
		System.out.println("move to x: "+x+" and y:"+y );
	}
	
	abstract void draw();
	abstract void resize();
}
