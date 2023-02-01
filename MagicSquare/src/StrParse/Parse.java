package StrParse;

import java.util.Scanner;

public class Parse {
	
	public static void main(String[] args) {
		
		System.out.println("출력할 숫자를 입력하세요");
		int a = 0;
		while(true){
			
			Scanner scanner = new Scanner(System.in);
			
			String strIn = scanner.next();
			
			try {
				System.out.println("입력한 수 : "+ strIn);
				
				a = Integer.parseInt(strIn);	//문자로 받은 값을 숫자로 파싱해주기
				break; //0을 누르면 종료
				
			} catch (Exception e) {
				//throw e;
			}
		}
		//return a;
		
	}	//main e
		
}	
