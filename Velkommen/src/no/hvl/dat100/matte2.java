package no.hvl.dat100;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
public class matte2 {

	public static void main(String[] args) {
		String melding = "Kodenummer: ";
		String kodeTxt = showInputDialog(melding);
		int kodeNr = parseInt(kodeTxt);
		char tegn = (char) kodeNr;
		int melding2 = (int)tegn;
		melding = melding + kodeNr + " = " + tegn;
		showMessageDialog(null, melding + "\n" + melding2);
	}

}
