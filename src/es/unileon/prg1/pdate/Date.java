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
			this.month = 7;
			this.year = 2017;
		}
		
		
		public Date(int day, int month, int year) throws DateException{
			
			
			setDay(day);
			setYear(year);
			setMonth(month);
		}

		public int getDay() {
			return day;
		}


		public void setDay(int day) throws DateException {
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


		public void setMonth(int month) throws DateException {
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


		public void setYear(int year)throws DateException {
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
			if(this.year == myFecha.getYear()) {
				
				retorno = true;}
				return retorno;
			}
		
		public boolean isSameYearSinIF(Date myFecha) {
					boolean retorno = true;
					
					retorno =(this.year == myFecha.getYear());
					
					return retorno;	
				}
		public Date tomorrow() {
			int day = this.day, month = this.month, year = this.year;
			if (month == 2) { // Mes Febrero
				if (day < 28){
					day = day + 1;
				}
				else{	day = 1;
						month = month +1;
				}
			}	
			else if((month == 4)||(month == 6)||(month == 8)||(month == 9)) { 
				//Abril, Junio, Septiembre y Noviembre.
				if(day < 30){
					day = day +1;
				}
				else {
					day = 1;
					month = month +1;
					}
			}
			else if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 9)||(month == 12)){
					//Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
					if(day < 31){
						day = day +1;
					}
					else if(day == 31){
						if((day == 31)||(month==12)){
							day = 1;
							month = 1;
							year = year +1;
						}
						else {
						day = 1;
						month = month+1;}
						}
					}
			
;
			return mesTomorrow;
			}
		public String getMonthName() {
			int mes = this.month;
			StringBuffer mesNombre = new StringBuffer();
			switch (mes) {
				case 1: mesNombre.append("Enero"); break;
				case 2:	mesNombre.append("Febrero"); break;
 			 	case 3: mesNombre.append("Marzo");break;
			 	case 4: mesNombre.append("Abril");break;
			 	case 5: mesNombre.append("Mayo");break;
			 	case 6: mesNombre.append("Junio");break;
			 	case 7: mesNombre.append("Julio");break;
			 	case 8: mesNombre.append("Agosto");break;
			 	case 9: mesNombre.append("Septiembre");break;
			 	case 10: mesNombre.append("Octubre");break;
			 	case 11: mesNombre.append("Noviembre");break;
			 	case 12: mesNombre.append("Diciembre");break;
			 } 
			 return mesNombre.toString();
		}

		public boolean checkDay(Date myFecha){
			boolean compruebaDay = false;
			if((myFecha.getDay() > -1) && (myFecha.getDay() <32)){
				compruebaDay = true;}
				return compruebaDay;
		}
		
		public String getSeasonName(){
			int caso = 0;
			StringBuffer season = new StringBuffer();
			caso = this.month;
			switch (caso) {
				case 1:;
				case 2: season.append("Invierno");
						break;
				case 3:;
				case 4:;
				case 5: season.append("Primavera");
						break;
				case 6:;
				case 7:;
				case 8: season.append("Verano");
						break;
				case 9:;
				case 10:;
				case 11: season.append("Otoño");
						break;
				case 12: season.append("Invierno");
							break;
			}
				return season.toString();

		}
			
		public boolean isSameDay(Date myFecha) {
				boolean retorno = false;
				if(this.day == myFecha.getDay()) {
					
					retorno = true;}
					return retorno;	
				}
		
		public boolean isSameMonth(Date myFecha) {
			boolean retorno = false;
			if(this.month == myFecha.getMonth()) {
				
				retorno = true;}
				return retorno;	
			}
		public boolean isSame(Date myFecha2) {
			boolean retorno = false;
			if(this.month == myFecha2.getMonth()) {
				
				retorno = true;}
				return retorno;	
		}
		public String getMonthsLeft(){
				StringBuffer mesesRestantes = new StringBuffer();
				int mes = this.month;
				mes = getMonth();
				for (int i = mes+1; i < 12; i++){

					mesesRestantes.append(i+"/");
				}
				return mesesRestantes.toString();
			}	
		public int daysOfMonth() {
			int mes = this.month;
			int salida = 0;
			switch(mes){
			case 1: salida = 31; break;
			case 2: salida = 28;break;
			case 3: salida = 31; break;
			case 4: salida = 30; break;
			case 5: salida = 31; break;
			case 6: salida = 30; break;
			case 7: salida = 31; break;
			case 8: salida = 31; break;
			case 9: salida = 30; break;
			case 10: salida = 31; break;
			case 11: salida = 30; break;
			case 12: salida = 31; break;
			}
			return salida;
			
		}
		public int getDaysLeftOfMonth(){
				int salida = 0;
				int day = this.day;
				for (int i = day+1; i < 32; i++){

					salida++;
				}
					return salida; //Total de dias restantes
			}

		public String getMonthsSameDays(){
			int mes = 0;
			StringBuffer meses =  new StringBuffer();
			mes = this.month;
			if(mes == 2){
				meses.append("Febrero");
			}
			else if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)){
				meses.append("Abril, Junio, Septiembre y Noviembre.");
			}
			else if((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)|| (mes == 10)||(mes == 12)){
				meses.append(" Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.");
			}
			
			return meses.toString();
		}

		public int numRandomTriesEqualDate(){
			double intentos = 0,diaRandom = 0, mesRandom = 0;
			int contador = 0;
			while(diaRandom != this.day){

				 diaRandom = Math.floor(Math.random()*(31+1));

				 	contador++;
			}
			while(mesRandom != this.day){

				 mesRandom = Math.floor(Math.random()*(12+1));

				 	contador++;
			}
				return contador;
		}

		public int attempsRandomTwo(){
			double intentos = 0,diaRandom = 0, mesRandom = 0;
			int contador = 0;
			do{

				 diaRandom = Math.floor(Math.random()*(31+1));

				 	contador++;

					}while(diaRandom !=  this.day);

			do{

				 mesRandom = Math.floor(Math.random()*(12+1));

				 	contador++;

					}while(mesRandom != this.month);

				return contador;
		}
		public int countDays(int day){
			int dia = 0, mes = 0, salida = 0;
			dia = this.day;
			mes = this.month;
			for(int i = 1; i < (mes*31); i++ ){

				salida++;
			}
				return salida;
		}

		public String dayOfWeek(int day){ //Para 1999.
			String salida = null;
			int dias = 0, eleccion = 0;
			dias = countDays(this.day);
			dias = dias%7;
			switch(dias){

				case 1: salida = "Lunes"; break;
				case 2: salida = "Martes"; break;
				case 3: salida = "Miercoles"; break;
				case 4: salida = "Jueves"; break;
				case 5: salida = "Viernes"; break;
				case 6: salida = "Sabado"; break;
				case 7: salida = "Domingo"; break;
			}
				return salida;
		}

		public String toString(){
				StringBuffer salida = new StringBuffer();
				salida.append(this.day+"/"+this.month+"/"+this.year);
				return salida.toString();
				
			}
		public int daysPast() {
			int day = this.day; int month = this.month;
			if (month == 2) { // Mes Febrero
				if (day > 1){
					day = day - 1;
				}
				else{	day = 31;
				}
			}	
			else if((month == 4)||(month == 6)||(month == 8)||(month == 9)) { 
				//Abril, Junio, Septiembre y Noviembre.
				if(day > 1){
					day = day -1;
				}
				else {
					if(month == 4) {
						day = 31;
					}
					else {
					day = 30;
					
					}
				}
			}
			else if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 9)||(month == 12)){
					//Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
					if(day > 1){
						day = day -1;
					}
					else if(day == 1){
						day = 31;
					}
			 }
			return day;
		}
		//@Override
		//Creado en clase de ejemplo
		public String toStringClase() {
			return "Date [day=" + day + ", month=" + month + "]";
		}
}