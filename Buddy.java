//This is our linked list class
public class Buddy{
	public String First_Name;
	public String Email;
	public int School;
	public int Time;
	public int Subject;
	public Buddy next;

	Buddy(){
	}

	Buddy(String frst, String eml, int schl, int tm, int sbjct){
		First_Name = frst;
		Email = eml;
		School = schl;
		Time = tm;
		Subject = sbjct;
	}

	String getFirst_Name(){
		return First_Name;
	}

	String getEmail(){
		return Email;
	}

	int getSchool(){
		return School;
	}

	int getTime(){
		return Time;
	}

	int getSubject(){
		return Subject;
	}
}
