package oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		int poengsum;
		for (int x = 0; x < 10; x++) {
			poengsum = parseInt(showInputDialog("Poengsum: "));
			
			boolean i = true;
		    while (i) {
		    	
		    	if (poengsum < 0 || poengsum > 100) {
		    		poengsum = parseInt(showInputDialog("Ugyldig poengsum, prøv igjen: "));
		    	}
		    	else 
		    		i = false;
		    }
			if (poengsum >= 90) {
				System.out.println("A");
			}
			else if (poengsum >= 80) {
				System.out.println("B");
			}
			else if (poengsum >= 60) {
				System.out.println("C");
			}
			else if (poengsum >= 50) {
				System.out.println("D");
			}
			else if (poengsum >= 40) {
				System.out.println("E");
			}
			else if (poengsum >= 0) {
				System.out.println("F");
			}
		
		}

	}

}
