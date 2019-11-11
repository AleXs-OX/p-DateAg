package es.unileon.prg1.pdate;

public class PDatePrincipal {

	public static void main(String[] args) throws DateException {
		Date myFecha =  new Date(1,4,2014);
		Date myFeDate2 = new Date(30,10,1999);
		
		if(myFecha.isSameYear(myFeDate2)) {
			System.out.println("Es la misma fecha");
		}
		else {
			System.out.println("Son fechas distintas");
		}
		
		System.out.println(myFecha);
		
		
		
		Date today;

		try {
			today = new Date(1, 14, 1999);
			today.setDay(777);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
	}

}
