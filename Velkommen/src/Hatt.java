public class Hatt extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    makeWindow("Mann med hatt");

    // Tegner hodet ved å fylle en gul sirkel
    setColor(255, 255, 0);
    fillCircle(100, 160, 60);
    setColor(0, 0, 0);
    fillCircle(130, 140, 10);
    fillCircle(70, 140, 10);
    setColor(255, 0, 0);
    fillCircle(100, 160, 20);
    String txt = "Honk! Honk!";
    drawString(txt, 190, 150);
    
    // Tegner hatten ved å fylle to svarte rektangler
    setColor(0, 0, 0);
    fillRectangle(20, 100, 160, 25);
    fillRectangle(50, 55, 100, 45);
    fillRectangle(75, 180, 50, 5);
  }

}