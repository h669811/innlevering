package oblig1;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		int heltall = Integer.parseInt(showInputDialog("Skriv et positivt heltall"));
		boolean i = true;
		while(i) {
			if (heltall <= 0) { //Dersom brukeren gir et negativ tall
				heltall = Integer.parseInt(showInputDialog("Ugyldig tall"));	
			}
			else {
				i = false;
			}
		}
		long sum = 1;
		for (long x = 1; x <= heltall; x++) {
			sum *= x;
		}
		System.out.println(sum);
	}

}
