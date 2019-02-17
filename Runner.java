//this is our runner file, with more time, this could definitely be cleaned up.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Runner{
	public static void main(String[]args){
		Buddy head = new Buddy();
		head = list();
		int length = lengthOfBuddy(head);
		System.out.println("There is a total of "+length+" tutors available.");
		System.out.println(head.getFirst_Name());
		Buddy scnd = schl(head);
		System.out.println("This is second "+scnd.getFirst_Name());
		Buddy thrd = sbjct(scnd);
		System.out.println("This is third "+thrd.getFirst_Name());
		Buddy frth = tm(thrd);
		System.out.println("This is fourth "+frth.getFirst_Name());
		while(frth.next!=null){
			System.out.println("The study buddy that matches best to your inputs is: "+frth.getFirst_Name());
			System.out.println(frth.getSchool());
			System.out.println(frth.getSubject());
			System.out.println(frth.getTime()+"pm");
			frth = frth.next;
		}
	}
	
	public static Buddy schl(Buddy head){
		Scanner s = new Scanner(System.in);
		Buddy temp = new Buddy();
		temp = head;
		Buddy hold = new Buddy();
		System.out.println("What school do you attend?");
		System.out.println("Input a number ONLY");
		System.out.println("1. UTD");
		System.out.println("2. UNT");
		System.out.println("3. UTEP");
		int in = s.nextInt();
		while(temp.next != null){
			int h = temp.getSchool();
			if(in == h){
				hold.First_Name = temp.First_Name;
				System.out.println(hold.getFirst_Name());
				hold.Email = temp.Email;
				hold.School = temp.School;
				hold.Time = temp.Time;
				hold.Subject = temp.Subject;
				hold.next = new Buddy();
				hold = hold.next;
				temp = temp.next;
			}
			temp = temp.next;
		}
		int h = temp.getSchool();
		if(in == h){
			hold.First_Name = temp.First_Name;
			hold.Email = temp.Email;
			hold.School = temp.School;
			hold.Time = temp.Time;
			hold.Subject = temp.Subject;
			return hold;			
		}
		return hold;
	}
	
	public static Buddy sbjct(Buddy head){
		Scanner s = new Scanner(System.in);
		Buddy temp = new Buddy();
		temp = head;
		Buddy hold = new Buddy();
		System.out.println("What class would you like to study?");
		System.out.println("Input a number ONLY");
		System.out.println("1. Science");
		System.out.println("2. Computer Science");
		System.out.println("3. Math");
		System.out.println("4. Writing");
		int in = s.nextInt();
		while(temp.next != null){
			int h = temp.getSchool();
			if(in == h){
				hold.First_Name = temp.First_Name;
				hold.Email = temp.Email;
				hold.School = temp.School;
				hold.Time = temp.Time;
				hold.Subject = temp.Subject;
				hold.next = new Buddy();
				hold = hold.next;
				temp = temp.next;
			}
			temp = temp.next;
		}
		int h = temp.getSchool();
		if(in == h){
			hold.First_Name = temp.First_Name;
			hold.Email = temp.Email;
			hold.School = temp.School;
			hold.Time = temp.Time;
			hold.Subject = temp.Subject;
			return hold;			
		}
		return hold;
	}
	
	public static Buddy tm(Buddy head){
		Scanner s = new Scanner(System.in);
		Buddy temp = new Buddy();
		temp = head;
		Buddy hold = new Buddy();
		System.out.println("What time would you like to study?");
		System.out.println("Input a number ONLY");
		System.out.println("1. 1pm");
		System.out.println("2. 2pm");
		System.out.println("3. 3pm");
		System.out.println("3. 4pm");
		int in = s.nextInt();
		while(temp.next != null){
			int h = temp.getSchool();
			if(in == h){
				hold.First_Name = temp.First_Name;
				hold.Email = temp.Email;
				hold.School = temp.School;
				hold.Time = temp.Time;
				hold.Subject = temp.Subject;
				hold.next = new Buddy();
				hold = hold.next;
				temp = temp.next;
			}
			temp = temp.next;
		}
		int h = temp.getSchool();
		if(in == h){
			hold.First_Name = temp.First_Name;
			hold.Email = temp.Email;
			hold.School = temp.School;
			hold.Time = temp.Time;
			hold.Subject = temp.Subject;
			return hold;			
		}
		return hold;
	}
	
	public static Buddy list(){
		try{
			File f = new File ("info.txt");
			Scanner scnr = new Scanner(f);
			String hold0 = scnr.nextLine();
			String hold1 = scnr.nextLine();
			String hold2 = scnr.nextLine();
			int a = Integer.parseInt(hold2);
			String hold3 = scnr.nextLine();
			int b = Integer.parseInt(hold3);
			String hold4 = scnr.nextLine();
			int c = Integer.parseInt(hold4);
			Buddy head = new Buddy(hold0, hold1, a, b, c);
			Buddy temp = head;
			while(scnr.hasNextLine()){
				for(int i = 0; i<5; i++){
					if(i == 0){
						hold0 = scnr.nextLine();
					}
					else if(i == 1){
						hold1 = scnr.nextLine();
					}
					else if(i == 2){
						hold2 = scnr.nextLine();
						a = Integer.parseInt(hold2);
					}
					else if(i == 3){
						hold3 = scnr.nextLine();
						b = Integer.parseInt(hold3);
					}
					else if(i==4){
						hold4 = scnr.nextLine();
						c = Integer.parseInt(hold4);
					}
					else{
						System.out.println("Error");
					}
				}
				temp.next = new Buddy(hold1, hold2, a, b, c);
				temp = temp.next;
			}
			return head;
		}
		catch(FileNotFoundException e){
            System.out.println("Error. File was not found!:(");
        }
		return null;
	}
	
	public static int lengthOfBuddy(Buddy head){
		Buddy temp = new Buddy();
		temp = head;
		int counter = 0;
		while(temp != null){
			counter +=1;
			temp = temp.next;
		}
		return counter;
	}
}
