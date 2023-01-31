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
				System.out.println(String.format("입력한 수 : %3s", strIn));
				a = Integer.parseInt(strIn);	//문자로 받은 값을 숫자로 파싱해주기
			
				//break; //사용 시 정수만 입력하면 루프 종료됨
				
			} catch (Exception e) {
				//e.printStackTrace();
				//throw e;
			}
		}
		//return a;
		
	}	//main e
		
}	
