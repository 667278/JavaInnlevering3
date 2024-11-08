package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {
	 String tekst;

		public Tekst () {
			
		}
		
		public Tekst(int id, String bruker, String dato, String tekst) {
	        super(id, bruker, dato);
	        this.tekst = tekst;
		}
		
		public Tekst(int id, String bruker, String dato, int likes, String tekst) {
	        super(id, bruker, dato, likes);
	        this.tekst = tekst;
		}

		public String getTekst() {
	        return tekst;
		}

		public void setTekst(String tekst) {
	        this.tekst = tekst;
		}

		@Override
		public String toString() {
	        String idStr = Integer.toString(id) + "\n";
	        String brukerStr = bruker + "\n";
	        String datoStr = dato + "\n";
	        String likesStr = Integer.toString(likes) + "\n";
	        String tekstStr = tekst + "\n";

	        return "TEKST\n" + idStr + brukerStr + datoStr + likesStr + tekstStr;
		}
}
	