
public class Kjønn extends EasyGraphics {
	
	public static void main(String[] args) {
		launch(args);
	}
		
	public void run() {
		makeWindow("Kjønnfordeling", 700, 500);
		int jump = 100;
		drawString("Gutter", 20, 35);
		drawString("Klasse A", 250, 35);
		drawString("72%", 500, 100);
		drawString("28%", 20, 100);
		drawString("Jenter", 480, 35);
		drawRectangle(20, 40, 500, 50);
		setColor(255,0,0);
		fillRectangle(20, 40, 500, 50);
		setColor(0,255,0);
		fillRectangle(20, 40, 500*28/100, 50);
		
		setColor(0,0,0);
		drawString("Gutter", 20, 35+ jump);
		drawString("Klasse B", 250, 35+ jump);
		drawString("62%", 500, 100+ jump);
		drawString("38%", 20, 100+ jump);
		drawString("Jenter", 480, 35+ jump);
		drawRectangle(20, 40+ jump, 500, 50);
		setColor(255,0,0);
		fillRectangle(20, 40+ jump, 500, 50);
		setColor(0,255,0);
		fillRectangle(20, 40+ jump, 500*38/100, 50);
	
		setColor(0,0,0);
		drawString("Gutter", 20, 35+ jump*2);
		drawString("Klasse C", 250, 35+ jump*2);
		drawString("54%", 500, 100+ jump*2);
		drawString("46%", 20, 100+ jump*2);
		drawString("Jenter", 480, 35+ jump*2);
		drawRectangle(20, 40+ jump*2, 500, 50);
		setColor(255,0,0);
		fillRectangle(20, 40+ jump*2, 500, 50);
		setColor(0,255,0);
		fillRectangle(20, 40+ jump*2, 500*46/100, 50);
		
	}
}
	