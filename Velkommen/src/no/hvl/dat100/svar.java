package no.hvl.dat100;
/*
 * Programmet er en utvidelse av Unicode-eksemplet 
 * på side 59, der et innlest kodenummer (int) blir
 * konvertert til tegn (char). Nå blir dette tegnet 
 * konvertert tilbake til kodenummeret.
 */
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
 
public class svar {
 
  public static void main(String[] args) {
    String melding = "Kodenummer: ";
    String kodeTxt = showInputDialog(melding);
    int kodeNr = parseInt(kodeTxt);
 
    char tegn = (char) kodeNr;
 
    melding = melding + kodeNr + " => " + tegn;

    // Utvidelse: Automatisk typetvang 'ned' til 
    // den mindre datatypen char
    int tegnNr = tegn;
    melding = melding + "\n" 
            + "Enkelttegn " + tegn + " => " + tegnNr;

    showMessageDialog(null, melding);
  }
 
}
