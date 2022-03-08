import java.util.Scanner;
public class Email{
	 private String firstName;
	 private String lastName;
	 private String password;
	 private String department;
	 private String email ; 
	 private int defaultPasswordLength = 10 ;
	 private String alternateEmail;
	 private String companySuffix = "company.com";
	 public Email(String firstName,String lastName){
		 this.firstName = firstName;
		 this.lastName = lastName ;
		 System.out.println("Email Created " );
		 
		 this.department = setDepartment();
		 System.out.println("Department:-  " + this.department );
		 
		 this.password = randomPassword(defaultPasswordLength);
		 System.out.println("Your password is : " + this.password);
		 
		 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		 System.out.println("Your email is :" + email);
	 }
	 private String setDepartment(){
		 System.out.print("Department CODES\n1 for Sales\n2 for Development\n3 for Accouting\nEnter the Department CODE :- ");
		 Scanner in = new Scanner(System.in);
		 int depChoice = in.nextInt();
		 if (depChoice == 1 ){
			 return " sales " ;
		 }
		 else if(depChoice == 2 ){
			 return "Development" ;
		 }
		 else if (depChoice == 3 ){
			 return "Accounting";
		 }
		 else{
			 return " !" ; 
		 }
	 }
	 private String randomPassword(int length){
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		 char[]password = new char[length];
		 for (int i=0 ; i<length; i++){
			 int rand = (int)(Math.random() * passwordSet.length());
			 password[i] = passwordSet.charAt(rand);
		 }
		 return new String(password);
	 }

	 public void setAlternateEmail(String altEmail){
		 this. alternateEmail = altEmail ; 
	 }
	 public void changePassword(String password){
		 this.password = password ;
	 }
	 
	 public String getAlternateEmail(){
		 return alternateEmail ;
	 }
	 public String getPassword(){
		 return password ;
	 }
	
	 
	 
}