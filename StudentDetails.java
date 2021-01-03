import java.util.*;
public class StudentDetails {
	String name;
	int rollno;
	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no of student");
		rollno = sc.nextInt();
		System.out.println("enter name of the student");
		name = sc.nextLine();
	}
	void display(){
		System.out.println("roll no is" +rollno);
		System.out.println("name is" +name);
	}
}
