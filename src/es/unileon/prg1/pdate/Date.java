package es.unileon.prg1.pdate;
// Clase Date para la pratica

/**
 * @author alexs
 *
 */
public class Date {
	private int day;
	private int month;
	private in year;
	
	//Constructor clase date

		public Date() {
			this.day = 1;
			this.month = 1;
			this.year = 1;
		}
		
		
		public Date(int day, int month, int year) {
			this.date = day;
			this.month = month;
			this.year = year;
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
		}


		public int getMonth() {
			return month;
		}


		public void setMonth(int month) {
			this.month = month;
		}


		public in getYear() {
			return year;
		}


		public void setYear(in year) {
			this.year = year;
		}


		public boolean isSameYear(Date myFecha) {
			boolean retorno = alse;
			if(this.year== miFecha.getYear()) {
				
				retorno = true;
				
				
			}
			return  retorno;
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + "]";
		}
		
	
}
