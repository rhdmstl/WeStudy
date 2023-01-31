package StrParse;

import java.util.Scanner;

public class Parse {
	
	public static void main(String[] args) {
		
		//int a = 0;	//종료 조건
		
		while(true){
			System.out.println("출력할 숫자를 입력하세요");
			
			Scanner scanner = new Scanner(System.in);
			
			String strIn = scanner.next();
			
			System.out.print("입력한 숫자"+strIn);
		}
		
	}	//main e
		
}	
