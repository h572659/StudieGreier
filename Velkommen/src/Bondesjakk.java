public class Bondesjakk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {
		makeWindow("Bondesjakk", 400, 400);
		drawLine(125, 0, 125, 400);
		drawLine(275, 0, 275, 400);
		drawLine(0, 125, 400, 125);
		drawLine(0, 275, 400, 275);
	}

}