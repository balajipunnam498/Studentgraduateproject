package studentGraduateclient;

import java.util.Scanner;

import services.StudentGraduateService;

public class Studentgraduateclient {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StudentGraduateService objectservice = new StudentGraduateService();
		objectservice.addGraduate(98, "Balaji", 21);
		objectservice.addGraduate(84, "Teja", 22);
		objectservice.addGraduate(89, "Siva", 20);
		objectservice.addGraduate(91, "RamSai", 23);
		objectservice.addUnderGraduate(73, "Prasad", 25);
		objectservice.addUnderGraduate(74, "Subbu", 24);
		while(true) {
			System.out.println("\n"+"1.Add Graduate Student Details"+"\n"+"2.Add UnderGraduate Students Details"+"\n"+"3.Check Graduate Student Details"+"\n"+"4.Check UnderGraduate Student Details"+"\n"+"5.All Students"+"\n"+"6.Exit");
				System.out.print("Enter Your Choice : ");
				int choice=in.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter Grade : ");
					int grade=in.nextInt();
					System.out.print("Enter Name : ");
					String name= in.next();
					System.out.print("Enter age : ");
					int age=in.nextInt();
					System.out.print(objectservice.addGraduate(grade,  name, age));
					break;
				case 2:
					System.out.print("Enter Grade : ");
					int ugrade=in.nextInt();
					System.out.print("Enter Name : ");
					String uname= in.next();
					System.out.print("Enter age : ");
					int uage=in.nextInt();
					System.out.print(objectservice.addUnderGraduate(ugrade, uname, uage));
					break;
				case 3:
					System.out.print("Enter ID : ");
					int gid=in.nextInt();
					System.out.println(objectservice.Checkgraduate(gid));
					
					break;
				case 4:
					System.out.print("Enter ID: ");
					int uid=in.nextInt();
					System.out.println(objectservice.checkUnderGraduate(uid));
					break;
				case 5:
					System.out.println("----Graduate Students------");
					System.out.println(objectservice.StudentgraduateDetails.toString());
					System.out.println("----Under Graduate Students----");
					System.out.println(objectservice.StudentUndergraduateDetails.toString());
					break;
				case 6:
					System.out.println("Thankyou....");
					System.exit(0);
					break;
					default:
						System.out.println("Inavlid Choice");
				}
				
					
			
		}
	}
}
