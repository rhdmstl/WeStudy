package StrParse;

import java.util.Scanner;

public class Parse {
	
	public static void main(String[] args) {
		
		System.out.println("����� ���ڸ� �Է��ϼ���");
		int a = 0;
		while(true){
			
			Scanner scanner = new Scanner(System.in);
			
			String strIn = scanner.next();
			
			try {
				System.out.println("�Է��� �� : "+ strIn);
				
				a = Integer.parseInt(strIn);	//���ڷ� ���� ���� ���ڷ� �Ľ����ֱ�
				break; //0�� ������ ����
				
			} catch (Exception e) {
				//throw e;
			}
		}
		//return a;
		
	}	//main e
		
}	
