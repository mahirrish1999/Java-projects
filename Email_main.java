import java.util.Scanner;
public class Email_main{
 public static void main (String args[]){
	 Scanner in = new Scanner(System.in);
	 System.out.print("Input first name : ");
     String X = in.nextLine();
	 System.out.print("Input Last name : ");
     String Y = in.nextLine();
     Email em1 = new Email (X,Y);
	 System.out.print(" For safty put an alternated Email address : ");
     String A = in.nextLine();
	 em1.setAlternateEmail(A);
	 System.out.println("Your new Email is :- " + A);
	 System.out.print("Put an alternate new password : ");
     String B = in.nextLine();
	 em1.changePassword(B);
	 System.out.println("Your new password is :- " + B);
	 System.out.println("HAVE A NICE DAY :-D");
	 
  }
}
