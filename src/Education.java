
public class Education {
	private String schools="UMD , MC, RARITAN VALLEY, \nNWACC, SALEM HIGH, NATHAN HALE HIGH,\n"
			+ "OCCIDENTAL PUBLIC SCHOOL ,GANDAKI BOARDING,\nEVEREST ENGLISH SCHOOL, NEW SUMMIT SCHOOL"; 
	public Education(){

	}




	public String  getSchools(){

		return "UMD , MC, RARITAN VALLEY, \nNWACC, SALEM HIGH, NATHAN HALE HIGH,\n"
				+ "OCCIDENTAL PUBLIC SCHOOL ,GANDAKI BOARDING,\nEVEREST ENGLISH SCHOOL, NEW SUMMIT SCHOOL"; 
	}



	@Override
	public String toString(){

		return ("The last 10 school attended are "+this.schools);
	}

}