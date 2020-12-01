package projetJava;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		

		    Scanner scanIt = new Scanner(System.in);
		    System.out.print("Enter two numbers: ");

		    // nextDouble() reads the next double from the keyboard
		    double first = scanIt.nextDouble();
		    double second = scanIt.nextDouble();

		    System.out.print("Enter an operator (+, -, *, /): ");
		    char operator = scanIt.next().charAt(0);
		    double result;
		    
		    
		    
		    
		    switch(operator) {
		    	
		    case '+':
		    	result = first + second;
		    	break;
		    case '-':
		    	result = first - second;
		    	break;
		    case '*': 
		    	result = first * second;
		    	break;
		    case '/':
		    	result = first / second;
		    	break;
		    default:
		    	System.out.print("error was founded");
		    	return;
		    }
		    
		   
		   
		    System.out.println("The operation is : " + first + " " + operator + " " + second + " = " + result);
		  }
	}

