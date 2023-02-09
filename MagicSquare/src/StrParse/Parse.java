package StrParse;

import java.util.Scanner;

public class Parse {

	Scanner scanner = new Scanner(System.in);
	
	public void test(){
		while(loop(null)){
			System.out.println("입력한 수");
		}
	}
	
	//마방진 칸 수 입력받기
	private int getInput(){	
		
		int a = 0 ;		//마방진을 끝내기
		
		while(true){	//입력 안내하기
			System.out.println("입력한 수 =>");
			
			String input = scanner.next();	//마방진 칸 수_String으로 먼저 받아서 문자열 오류 잡기
			
			try {	
				a = Integer.parseInt(input);	//문자로 받은 값을 숫자로 파싱해주기
				break;	//나가기
			} catch (Exception e) {
				//e.printStackTrace();	이게 있으면 문자열 받았을때 에러안내 나옴
			}
		}
		return a;	//마방진 끝
	}
	
	public boolean loop(String input){
		
		int a = getInput();	//입력받는 메소드 홀수
		
		if( a == 0) return false;	//0 입력시 메소드 종료
		
		while(true){
			for(int i =0 ; i <input.length() ; i++){
				char c = input.charAt(i);
				if(Character.isDigit(c)){
					int number = Character.getNumericValue(c);
					//String s = String.format("%3d",number);	//띄어쓰기 조절
					System.out.print("입력한 수"+number);
				}	//if e
			
			}	//for e
			
			return true;
			
		}	//while e
		
	}	//loop e
		
}	
