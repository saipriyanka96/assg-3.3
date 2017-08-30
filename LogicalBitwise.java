import java.util.*;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//The wild character(*) is used to specify that all classes with that package are available to our program

public class LogicalBitwise {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//LogiaclBitwise is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
			
		System.out.println("Logical AND operator");//first to check logical operator
//System is a final class in java.lang package
	//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		
			
		//to initialize values we have take the variables
		int p=10;//declaring a  value to the integer and p holds the value 10(1010)  
		int q=20;//declaring a  value to the integer and p holds the value 20(10100)
		int r=30;//declaring a  value to the integer and p holds the value 30(11110)
		int s=40;//declaring a  value to the integer and p holds the value 40(101000)
		
		boolean ans=q>p && q<r && r<s;
//boolean declare the value is true or false only. By default the boolean primitive type is false
//here q is greater than p, and q is less than r and r is less than s,here exp1,exp2,exp3 are 
//true so the statement it is true		
		System.out.println("answer of the condition"+ans);
	
		boolean ans1=q<p && q<r && r<s;
//here q is less than p,and q is less than r,and r is less than s.
//expression1 is false and exp2 and expression 3 are true so that given statement is false		
		System.out.println("answer of the condition"+ans1);
		
		boolean ans2=q>p && q>r && r>s;
//here q is greater than p,q is greater than r,r is greater than s
//exp1 is true and exp2,exp3 are false so that statement is false		
		System.out.println("answer of the condition"+ans2);
		
		boolean answ3=q<p && q>r && q<s && r<s;
//here q is less than p,and q is greater than r,q is less than s and r is less than s.
//The given exp1,exp2 are false,exp3 and exp4 are there is an error at q<p,q>r sothat it is false 
		System.out.println("answer of the condition"+answ3);
		
		System.out.println("to show bitwise AND operator");//bitwise operator
		System.out.println("answer of the condition"+(p&q));//here value is zero
		System.out.println("answer of the condition"+(q&r));//here value is 20
		System.out.println("answer of the condition"+(q&s));//after calculating value becomes zero
		System.out.println("answer of the condition"+(r&s));//r=11110,s=101000
															//			=01000
															//			=0010
	}

}
