package StrParse;

import java.util.Scanner;

public class Str {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int a = 0;
	    while(true){
	    	System.out.println("����� ���� �Է��ϼ���: ");
		    String input = scanner.nextLine();
		    for (int i = 0; i < input.length(); i++) {
		        char c = input.charAt(i);
			        if (Character.isDigit(c)) {
			            int num = Character.getNumericValue(c);
			            //String s = String.format("%3d",num);	//���� ����
			            System.out.println(String.format("�Է��� �� : %3d",num));
			        }	//if e
		    }
//		    return a;
//		    scanner.close(); ������ �÷��Ͱ� �� �� �����͸� ������
	    }	//while e
	}	//main e
}
