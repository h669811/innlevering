package oblig1;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		int bruttoinntekt = parseInt(showInputDialog("Bruttoinntekt: "));
		
		int trinn1 = 190349;
		int trinn2 = 267899;
		int trinn3 = 643799;
		int trinn4 = 969199;
		int trinn5 = 1999999;
		
		double prosent12 = 1.7/100;
		double prosent23 = 4.0/100;
		double prosent34 = 13.4/100;
		double prosent45 = 16.4/100;
		double prosent5 = 17.4/100;
		
		double skatt_trinn12 = (trinn2 - trinn1)*prosent12;
		double skatt_trinn23 = (trinn3 - trinn2)*prosent23;
		double skatt_trinn34 = (trinn4 - trinn3)*prosent34;
		double skatt_trinn45 = (trinn5 - trinn4)*prosent45;
		
		double skatt;
		
		if (bruttoinntekt <= trinn1) {
			skatt = 0;
		}
		else if (bruttoinntekt <= trinn2) {
			skatt = (bruttoinntekt - trinn1) * prosent12;
		}
		else if (bruttoinntekt <= trinn3) {
			skatt = ((bruttoinntekt - trinn2) * prosent23) + skatt_trinn12;
		}
		else if (bruttoinntekt <= trinn4) {
			skatt = ((bruttoinntekt - trinn3) * prosent34) + skatt_trinn12 + skatt_trinn23;
		}
		else if (bruttoinntekt <= trinn5) {
			skatt = ((bruttoinntekt - trinn4) * prosent45) + skatt_trinn12 + skatt_trinn23 + skatt_trinn34;
		}
		else {
			skatt = ((bruttoinntekt - trinn5) * prosent5) + skatt_trinn12 + skatt_trinn23 + skatt_trinn34 + skatt_trinn45;
		}
		showMessageDialog(null, "Din skatt er på " + Math.round(skatt) + " kr");
	}

}
