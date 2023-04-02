package day7_2dArray;

public class Customer {

	 String cname;
	 String email;
	 
	 void get()
	 {
		 cname="Amit";
		 email="amit@gmail.com";
		 
	 }
	  
	 void show()
	 {
		 System.out.println(cname +"  "+ email);
	 }
	 
	 void check()
	 {
		 if(cname.equals("Amit"))
			 System.out.println("welcome");
		 else
			 System.out.println("not allowed");
	 }

}
