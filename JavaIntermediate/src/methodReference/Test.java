package methodReference;

public class Test {

	public static void main(String[] args) {

		School sch= new School();
		Noteable nt= sch:: noteLecture;
		nt.note("Lecture");
		
		Noteable nt2=sch::noteObservation;
		nt2.note("Online");
		
		School mySchool= new School();
		mySchool.noteLecture("lecture");
		mySchool.noteLecture("lecture");
		mySchool.noteLecture("lecture");


	}

}
