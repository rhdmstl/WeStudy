package StrParse;

import java.util.Scanner;

public class Parse {

		public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.print("입력할 수 : ");
		    String input = scan.nextLine();
		    for (int i = 0; i < input.length(); i++) {
		        char c = input.charAt(i);
		        if (Character.isDigit(c)) {
		            int num = Character.getNumericValue(c);
		            System.out.print(num);
		        }
		    }
		    scan.close();
		
	}	//main e
		
}	
