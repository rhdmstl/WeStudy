package MagicSquare;

import java.util.Scanner;

public class Square {	//마방진

	public void Square(){}	//클래스 호출 할 수 있게 생성자만들기
	
	public void test(){	//입력 받기
		while(loop()){	// 마방진 계산하는 메소드 호출
			System.out.println("------>");	// 맞지않는 답 입력 시 호출
		}
	}

	//마방진 칸 수 입력받기
	private int getInput(){	
		
		int a = 0 ;		//마방진을 끝내기
		
		while(true){	//입력 안내하기
			System.out.println("홀수를 입력하세요=>");
			
			Scanner scanner = new Scanner(System.in);	//입력 클래스
			
			String strIn = scanner.next();	//마방진 칸 수_String으로 먼저 받아서 문자열 오류 잡기
			
			try {	
				a = Integer.parseInt(strIn);	//문자로 받은 값을 숫자로 파싱해주기
				break;	//나가기
			} catch (Exception e) {
				//e.printStackTrace();	이게 있으면 문자열 받았을때 에러안내 나옴
			}
		}
		return a;	//마방진 끝
	}
	
	private boolean loop(){	//마방진 계산

		int a = getInput();	//입력받는 메소드 홀수
		
		if( a == 0) return false;	//0 입력시 메소드 종료
		
		int[][] b = new int[a][a];	//마방진 안에 들어갈 수 ,칸수
		
		int i=0,j=a/2,v = 1; //넣을 값의 조건
		
		if( a % 2 !=0 ){	//입력받은 수가 홀수 일때
			System.out.println("입력한 홀수 : "+ a); 
		}else{	//짝수일때
			System.out.println("짝수는 안됩니다"); 
			return true;	//메소드 종료
		}
		
		while(true){	//계산 반복
			if(i < 0){	
				i=a-1;	// 행이 첫행보다 작아지는 경우 마지막으로 넘어간다.
			}
			if(j == a){		
				j = 0 ;	//열이 마지막열보다 커지는 경우 첫 열로 넘어간다.
			}
			if(b[i][j]==0){
				b[i][j] = v;
			}
			if(v % a == 0){	//넣은 수가 배수이면 행만 증가
				i++;
			}else{
				i--;
				j++;
			}
				v++;
			if(v == a*a+1){	//종료조건
				break;
			}
		}//while e
		
		print(a, b);	//출력 함수 호출(마방진 모양)
		
		return true;	//끝
	}
	
	//출력 메소드 
	private void print(int a, int[][] b){	
		//loop()에서 인수 받아오기
			for(int k =0 ; k < a ; k++){	//세로 칸에 맟춰 계속 증가
				for(int k2 = 0 ; k2 < a ; k2++){	//가로 칸에 맟춰 계속 증가
					String s = String.format("%3d",b[k][k2]);	//띄어쓰기 조절
					System.out.print(s);	//화면 출력
				}
				System.out.println();
			}
		
	}	//출력 메소드 e
}
