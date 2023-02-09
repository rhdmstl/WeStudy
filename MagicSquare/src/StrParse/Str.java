package StrParse;

import java.util.Scanner;

public class Str {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int a = 0;
	    while(true){
	    	System.out.println("출력할 수를 입력하세요: ");
		    String input = scanner.nextLine();
		    for (int i = 0; i < input.length(); i++) {
		        char c = input.charAt(i);
			        if (Character.isDigit(c)) {
			            int num = Character.getNumericValue(c);
			            //String s = String.format("%3d",num);	//띄어쓰기 조절
			            System.out.println(String.format("입력한 수 : %3d",num));
			        }	//if e
		    }
//		    return a;
//		    scanner.close(); 가비지 컬렉터가 다 쓴 데이터를 가져감
	    }	//while e
	}	//main e
}
