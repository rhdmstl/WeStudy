package StrParse;

import java.util.Scanner;

public class Str {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String a = "0";
	    
	    
	    while(true){
	    	System.out.println("����� ���� �Է��ϼ���: ");
		    String input = scanner.next();
		    //System.out.println("/" + input + "/");
		    if(input.equals(a)){
		    	System.out.println("��!!!!");
		    	break;
		    }
		    
		    
		    for (int i = 0; i < input.length(); i++){
		        char c = input.charAt(i);	//int -> char ��ȯ
			        if (Character.isDigit(c)) {	//���� ���� �Ǻ�
//			        	int num = Integer.parseInt(String.valueOf(input));
			            int num = Character.getNumericValue(c);	//shar -> int ��ȯ
			            //String s = String.format("%3d",num);	//���� ����
			            System.out.print(String.format("�Է��� �� : %3d",num));
			        }	//if e
		    }
//		    break ;
//		    scanner.close(); ������ �÷��Ͱ� �� �� �����͸� ������
	    }	//while e
	}	//main e
}
