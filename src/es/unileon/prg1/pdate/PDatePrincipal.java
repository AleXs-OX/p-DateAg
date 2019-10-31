package es.unileon.prg1.pdate;

public class PDatePrincipal {

	public static void main(String[] args) {
		Date myFecha =  new Date();
		Date myFeDate2 = new Date(30,10,2019);
		
		if(myFecha.isSameYear(myFeDate2)) {
			System.out.println("Es la misma fecha");
		}
		else {
			System.out.println("Son fechas distintas");
		}
		
		System.out.println(myFecha);
		

	}

}
