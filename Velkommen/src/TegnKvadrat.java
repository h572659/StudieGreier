import static java.lang.Integer.*;
public class TegnKvadrat extends EasyGraphics {
	
	public static void main(String[] args) {
		launch(args);
	}
		
	public void run() {
		makeWindow("TegnKvadrat");
		
		int x = parseInt(getText("X: "));
		int y = parseInt(getText("Y: "));
		int h = parseInt(getText("Høyde: "));
		
		drawRectangle(x, y, h, h);
		
		int nyh = h/2;
		int nyx = x + nyh/2;
		int nyy = y + nyh/2;
		int radius = (int) (nyh/Math.sqrt(2));
		drawCircle(nyx+(nyh/2), nyy+(nyh/2), nyh); 
		setColor(0,0,0);
		drawCircle(nyx+(nyh/2), nyy+(nyh/2), radius);
	
		setColor(255, 255, 0);
		fillCircle(nyx+(nyh/2), nyy+(nyh/2), nyh);
		setColor(255, 255, 255); 
		fillCircle(nyx+(nyh/2), nyy+(nyh/2), radius);
		setColor(0,0,0);
		fillRectangle(nyx, nyy, nyh, nyh);
		
		
	}

}
