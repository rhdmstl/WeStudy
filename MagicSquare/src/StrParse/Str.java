package StrParse;

import java.util.Scanner;

public class Str {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String a = "0";
	    
	    
	    while(true){
	    	System.out.println("출력할 수를 입력하세요: ");
		    String input = scanner.next();
		    //System.out.println("/" + input + "/");
		    if(input.equals(a)){
		    	System.out.println("끝!!!!");
		    	break;
		    }
		    
		    
		    for (int i = 0; i < input.length(); i++){
		        char c = input.charAt(i);	//int -> char 변환
			        if (Character.isDigit(c)) {	//문자 숫자 판별
//			        	int num = Integer.parseInt(String.valueOf(input));
			            int num = Character.getNumericValue(c);	//shar -> int 변환
			            //String s = String.format("%3d",num);	//띄어쓰기 조절
			            System.out.print(String.format("입력한 수 : %3d",num));
			        }	//if e
		    }
//		    break ;
//		    scanner.close(); 가비지 컬렉터가 다 쓴 데이터를 가져감
	    }	//while e
	}	//main e
}
