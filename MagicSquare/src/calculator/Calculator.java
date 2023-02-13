package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Calculator {
	
	public static void main(String[] args) {	//BufferedReader를 사용하려면 throws IOException 있어야함 = try/catch로 해결
		
		//다음에는 scanner 쓰기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){	
        	
			try {
				System.out.println("First value=>");
	        	BigInteger first = new BigInteger(br.readLine());
	        	System.out.println("연산자=>");
	        	String calcStr = br.readLine();
	        	//System.out.println("[" + calcStr + "] len=" + calcStr.length());
	        	System.out.println("Second value=>");	        	
				BigInteger second = new BigInteger(br.readLine());
        		
				switch(calcStr){
				case "+":	//더하기
					System.out.println("더하기  : "+first.add(second));
					break;
				case "-":	//빼기
					System.out.println("빼기 : :"+first.subtract(second));
			        break;
				case "*":	//곱하기
					System.out.println("곱하기 : "+first.multiply(second));
				    break;
				case "/":	//나누기
					System.out.println("나누기 : "+first.divide(second));
			       	break;
				}
//				스위치랑 같은 코드
//				if(calcStr.compareTo("+") == 0){
//				}else if(calcStr.compareTo("-") == 0){
//				}else if(calcStr.compareTo("*") == 0){
//				}else if(calcStr.compareTo("/") == 0){
//				}
//		        
				System.out.print("try again (Y/N) =>");
				String escmsg = br.readLine();	//탈출 조건 입력받기
				
//	        	System.out.println("[" + escmsg + "] len=" + escmsg.length());	//입력받은 데이터확인
	        	if(escmsg.compareToIgnoreCase("N")== 0 ){
	        		System.out.println("끝!!!!");
	        		break;
	        	}

			} catch (IOException e) {	// throws IOException으로 클래스를 입포트하는 대신 캐치로 잡아내기
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       	
	        
        }	//while e

        return;	//while 밖에 있어야 Y 선택 시 시작점으로 넘어감
        
    }	//main e

}
