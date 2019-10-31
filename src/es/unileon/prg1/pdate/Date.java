package es.unileon.prg1.pdate;
// Clase Date para la pratica

/**
 * @author alexs
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	
	//Constructor clase date

		public Date() {
			this.day = 1;
			this.month = 1;
			this.year = 1;
		}
		
		
		public Date(int day, int month, int year) throw  DateException {
			
			
			setDay(day);
			setYear(year);
			setMonth(month);
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
			
			if((day>0) && (day <32)) {
				this.day = day;
			}
			else {
				throw new DateException("Error en el dia introducido");
			}
		}


		public int getMonth() {
			return month;
		}


		public void setMonth(int month) {
			this.month = month;
			if((month>0) && (month <12)) {
				this.month = month;
			}
			else {
				throw new DateException("Error en el mes introducido");
			}
		}


		public int getYear() {
			return year;
		}


		public void setYear(in year) {
			this.year = year;
			if((year > -1)) {
				this.year= year;
			}
			else {
				throw new DateException("Error en el año introducido");
			}
		}


		public boolean isSameYear(Date myFecha) {
			boolean retorno = false;
			if(this.year== miFecha.getYear()) {
				
				retorno = true;}
			}
			public boolean isSameYearSinIF(Date myFecha) {
					
					retorno = (this.year == miFecha.getYear());
					
					
				}
			return  retorno;
		}

		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + "]";
		}
		
	
}
