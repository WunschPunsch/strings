
public class VokalZaehler {
	
	
	public Integer zaehleVokale(String zeichenKette) {
		// In Java ist das erste Element einer Liste oder eines Strings
		// immer an Position 0 gespeichert, und das letzte Element an
		// Position "länge - 1".
		Integer aktuellePosition = 0;
		Integer letztePosition = zeichenKette.length()-1;
		Integer anzahlVonA = 0;
		// Schleife über alle Zeichen:
		while(aktuellePosition <= letztePosition) {
			// Der aktuelle Buchstabe wird über die Methode 'charAt'
			// der Klasse String geholt:
			Character buchstabe = zeichenKette.charAt(aktuellePosition);
			// Prüfen, ob es sich um ein a handelt:
			if(buchstabe == 'a') {
				anzahlVonA++; // Falls ja, wird die Anzahl aller a's erhöht
			}
			// Schließlich wird die aktuelle Position im String hochgesetzt,
			// damit beim nächsten Schleifendurchlauf das nächste Zeichen analysiert
			// werden kann.
			aktuellePosition++;
		}
		// Ausgabe:
		System.out.println("Anzahl aller a's in '" + zeichenKette + "': " + anzahlVonA);
		// Hier fehlt noch was (Hausaufgabe)
		return 0;
	}

}
