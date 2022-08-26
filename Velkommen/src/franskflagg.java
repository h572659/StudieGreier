import static java.lang.Integer.*;
public class franskflagg extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {
		makeWindow("Frankriket", 800, 800);
		int x, y, w, l;
		int prsnt = parseInt(getText("Prosten størelse: "));
		x = 40;
		y = 60; 
		w = 140*prsnt/100;
		l = 190*prsnt/100;
		
		drawRectangle(x, y, w*3, l);
		setColor(0, 0, 255);
		fillRectangle(x, y, w, l);
		setColor(255, 255, 255);
		fillRectangle(x+w, y, w, l);
		setColor(255, 0, 0);
		fillRectangle(x+(w*2), y, w, l);
	}

}
