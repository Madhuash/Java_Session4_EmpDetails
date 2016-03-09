import java.util.Scanner;

public class EncapsTest {
	
	    public static void main(String args[]){
	    	EmpDetails obj = new EmpDetails();
	    	Scanner scc = new Scanner(System.in);
	    	
	    	 System.out.println("Enter Emplyee Name");
	    	 String EmpName = scc.next();
	    	 System.out.println("Enter Emplyee Age");
	    	 int EmpAge = scc.nextInt();
	    	 System.out.println("Enter Emplyee Number");
	    	 int EmpSSN = scc.nextInt();
	    	 
	         obj.setEmpName(EmpName);
	         obj.setEmpAge(EmpAge);
	         obj.setEmpSSN(EmpSSN);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}

