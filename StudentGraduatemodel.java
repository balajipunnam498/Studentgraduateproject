package model;

public class StudentGraduatemodel {
private int Studentid;
private String StudentName;
private int Grade;
private int age;
public String toString() {
	return "\n"+"Student Name : "+StudentName+"\n"+"Student ID : "+Studentid+"\n"+"Grade : "+Grade+"\n"+"Age : "+age+"\n"+"--------------------";
}
public int getStudentid() {
	return Studentid;
}
public void setStudentid(int studentid) {
	Studentid = studentid;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getGrade() {
	return Grade;
}
public void setGrade(int grade) {
	Grade = grade;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
