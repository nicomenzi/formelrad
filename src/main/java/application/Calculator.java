package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {


		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */
	public double pAusUundI (double u, double i){
		return u*i;
	}
	//Feature 3
	public double uAusRundI (double wiederstand, double strom){
		return wiederstand*strom;
	}
	public double uAusPundI(double leistung, double strom){
		return leistung/strom;
	}
	public double uAusPundR(double leistung, double wiederstand){
		return Math.sqrt(leistung*wiederstand);
	}

	//Feature 5
	public double rAusUundI(double spannung, double strom){
		return spannung/strom;
	}
	public double rAusPundI(double leistung, double strom){
		return leistung/strom*strom;
	}
	public double rAusUundP(double spannung, double leistung){
		return spannung*spannung/leistung;
	}
}
