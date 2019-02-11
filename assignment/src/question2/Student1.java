package question2;


public class Student1 
{

	public static void main(String[] args)
	{
	    Student a = new Student("rohit", "indore");
	    Student b = new Student("akshay", "bangalore");
	     // System.out.println(a);  // toString()
	     // a.setAddress("bangalore");
	     // System.out.println(a);  
	      System.out.println(a.getName());
	      System.out.println(a.getAddress());
	      a.addCourseGrade("java", 70);
	      a.addCourseGrade("cpp", 80);
	      a.addCourseGrade("c", 82); 
	      a.printGrades();
	      System.out.printf("The average grade is %.2f%n", a.getAverageGrade());
	      
	      
	      System.out.println(b.getName());
	      System.out.println(b.getAddress());
	      b.addCourseGrade("hindi", 60);
	      b.addCourseGrade("maths", 79);
	      b.addCourseGrade("science", 92); 
	      b.printGrades();
	      System.out.printf("The average grade is %.2f%n", b.getAverageGrade());
	   }
	

}

	


