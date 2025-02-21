package services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.StudentGraduatemodel;

public class StudentGraduateService {
	int Gid = 101;
	int Uid = 101;
	
	public ArrayList<StudentGraduatemodel> StudentgraduateDetails = new ArrayList<>();
	public ArrayList<StudentGraduatemodel> StudentUndergraduateDetails = new ArrayList<>();

	boolean isPassedG(int grade) {
		if(grade>80) {
			return true;
		}
		return false;
	}
	boolean isPassedU(int grade) {
		if(grade>70) {
			return true;
		}
		return false;
	}

	public  String  collectResult() {
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime updatedDate = date.plusDays(5).plusHours(4);
		DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-MMM-yy 'at' h:mm a");
		String formattedDate = updatedDate.format(formated);
		return "You can Take Your Certificates on " + formattedDate;
	}

	public String addGraduate(int grade, String Name, int age) {
		StudentGraduatemodel object = new StudentGraduatemodel();
		object.setAge(age);
		object.setGrade(grade);
		object.setStudentid(Gid);
		Gid++;
		object.setStudentName(Name);
		StudentgraduateDetails.add(object);
		return "Details Added Succesfully";
	}

	public String addUnderGraduate(int grade, String Name, int age) {
		StudentGraduatemodel object1 = new StudentGraduatemodel();
		object1.setAge(age);
		object1.setGrade(grade);
		object1.setStudentid(Uid);
		Uid++;
		object1.setStudentName(Name);
		StudentUndergraduateDetails.add(object1);
		return "Details Added Succesfully";
	}
	
public String Checkgraduate(int id) {
	for(StudentGraduatemodel i:StudentgraduateDetails) {
		if(i.getStudentid()==id && i.getGrade()>=80) {
			return i.toString()+"\n"+collectResult();
		}
		else if(i.getStudentid()==id && i.getGrade()<80) {
		return i.toString()+"\n"+"Status: Failed";
		}
	}
	return "" ;
}
public String checkUnderGraduate(int id) {
	for(StudentGraduatemodel i: StudentUndergraduateDetails) {
		if(i.getStudentid()==id && i.getGrade()>=70) {
			return i.toString()+"\n"+collectResult();
		}
		else if(i.getStudentid()==id && i.getGrade()<=70) {
			return i.toString()+"\n"+"Status: Failed";
		}
	}
	return "Student Not Found ";
}

}
