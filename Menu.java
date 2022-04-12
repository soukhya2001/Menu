package menu;

public class Menu {
  public static void main(String[] args)
  {
	  int n;
	  int a;
	  do {
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("Enter 1 to Check the number is Buzz or not");
	   System.out.println("Enter 2 to check the number is positive or not:");
	   System.out.println("Enter 3 to Check the number is ever or odd");
	  System.out.println("Enter 0 to Quit");
	  System.out.println("Enter your Choice:");
	      n=sc.nextInt();
	  switch(n)
	  {
	  case 1:{
		  System.out.println("Enter a Number:");
		  int b=sc.nextInt();
		  if(b%10==7 || b%7==0)
		  {
			  System.out.println(b+" is a Buzz Number:");
		  }
		  else {
			  System.out.println(b+"is not a Buzz Number:");
		  }
		  break;
	  }
	  case 2:
	  {
		  System.out.println("Enter a Number:");
		  int c=sc.nextInt();
		  if(c>0)
		  {
			  System.out.println(c+"is Positive Number:");
		  }
		  else if(c<0)
		  {
			  System.out.println(c+"is Negative Number:");
		  }
		  else {
			  System.out.println("The Number is ZERO:");
		  }
		  break;
	  }
	  case 3:
	  {
		  System.out.println("Enter a Number:");
		  int d=sc.nextInt();
		  if(d%2==0)
		  {
			  System.out.println(d+"is a EVEN Number:");
		  }
		  else {
			  System.out.println(d+"is a ODD Number:");
			  
		  }
		  break;
	  }
	  case 0:
	  { 
		  break;
	  }
	  default:
	  {
		  System.out.println("OOPS! Wrong Choice:");
	  }
	  }
	 
	  }while(n!=0);
	   
  }
}
