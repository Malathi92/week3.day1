package Week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("the student id is :"+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("the student name is:"+name);
		System.out.println("the student id is :"+id);
	}
	public void getStudentInfo(String name,long phnNumber,String email)
	{
		System.out.println("the student name is:"+name);
		System.out.println("the student phnnumber is :"+phnNumber);
		System.out.println("the student email id is :"+email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s=new Students();
		System.out.println("Method overloading here");
		s.getStudentInfo(42);
		s.getStudentInfo(32,"malathi");
		s.getStudentInfo("preetha",9080405063l,"preetha@gmail.com");
		
	}	
		
	}
