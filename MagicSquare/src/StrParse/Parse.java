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
				System.out.println(String.format("�Է��� �� : %3s", strIn));
				a = Integer.parseInt(strIn);	//���ڷ� ���� ���� ���ڷ� �Ľ����ֱ�
			
				//break; //��� �� ������ �Է��ϸ� ���� �����
				
			} catch (Exception e) {
				//e.printStackTrace();
				//throw e;
			}
		}
		//return a;
		
	}	//main e
		
}	
