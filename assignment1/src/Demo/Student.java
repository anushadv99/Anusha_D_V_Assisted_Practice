package Demo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the city: ");
		String city= scr.nextLine();
		
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}else if (city == "Noida") {  
		System.out.println("city is noida");  
		}else if(city == "Agra") {  
		System.out.println("city is agra");  
		}else {  
		System.out.println(city);  
		}  

	}

}
