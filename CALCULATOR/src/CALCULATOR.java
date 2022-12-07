 import java.util.Scanner;
public class CALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a,b, ch;
       
       System.out.println("Enter first number:");
       a=sc.nextInt();
       System.out.println("Enter second number:");
       b=sc.nextInt();
       
      
       System.out.println("Enter your choice 1-> Add    2-> Substract  3 -> Multiply  4 -> Divide \n Enter your choice");
       ch=sc.nextInt();
       if(ch==1)
    	    System.out.println("Addition="+(a+b));
       else if(ch==2)
    	    System.out.println("Substraction="+(a-b));
       else if(ch==3)
            System.out.println("Multiplication="+(a*b));
       else if(ch==4)
    	    System.out.println("Division="+(a/b));
       else
    	    System.out.println("Invalid choice you have to choose a valid option");
    	    		
	}

}
