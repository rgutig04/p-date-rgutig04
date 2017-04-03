package es.unileon.prg.Date;
public class Date {
	
	private int day;
	private int month;
	private int year;

	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	public void setDay(int day){
		if(day>0) day = dia;
		}
	public void setMonth(int month){
		if(month>=1 && month <=12) month = mes;
		}
	public void setYear(int year){
		year = anio;
		}
	
	public boolean isSameDay(int dia){
		if(day==dia){
			return true;
		}else{
			return false;
			}
		}
	public boolean isSameMonth(int mes){
		if(month==mes){
			return true;
		}else{
			return false;
			}
		}
	public boolean isSameYear(int anio){
		if(year==anio){
			return true;
		}else{
			return false;
			}
		}
	public boolean isSame(int fecha){
		if(date==fecha){
			return true;
		}else{
			return false;
			}
		}

	public Date(int day, int month, int year) throws DateException{
			this.year = year;
			if(month >= 1 && month <= 12){
				this.month = month;
			}else{
				throw new DateException("mes "+mes+" no valido" + "valores posbles entre 1 y 12");
			}
			this.day = day;

		}

		public String toString(){
			return this.day + "/" + this.month "/" + this.year;
		}

}
