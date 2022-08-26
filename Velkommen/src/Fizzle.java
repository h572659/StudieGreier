import static java.lang.Boolean.*;
import static javax.swing.JOptionPane.*;
public class Fizzle {

	public static void main(String[] args) {
		
		boolean x = parseBoolean(showInputDialog("True or False?"));
		//System.out.print(x);
		
		while (x == false) {
		for (int i = 1; i != 101;) {
			int w = i%2;
			if (w == 0) {
				System.out.println("Buzz" +i);
				}
			else {
				System.out.println("Fizz"+i);
			i++;	
			}
		}
		}
	}
}
	


