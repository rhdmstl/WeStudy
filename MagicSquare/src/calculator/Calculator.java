package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Calculator {
	
	public static void main(String[] args) {	//BufferedReader�� ����Ϸ��� throws IOException �־���� = try/catch�� �ذ�
		
		//�������� scanner ����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){	
        	
			try {
				System.out.println("First value=>");
	        	BigInteger first = new BigInteger(br.readLine());
	        	System.out.println("������=>");
	        	String calcStr = br.readLine();
	        	//System.out.println("[" + calcStr + "] len=" + calcStr.length());
	        	System.out.println("Second value=>");	        	
				BigInteger second = new BigInteger(br.readLine());
        		
				switch(calcStr){
				case "+":	//���ϱ�
					System.out.println("���ϱ�  : "+first.add(second));
					break;
				case "-":	//����
					System.out.println("���� : :"+first.subtract(second));
			        break;
				case "*":	//���ϱ�
					System.out.println("���ϱ� : "+first.multiply(second));
				    break;
				case "/":	//������
					System.out.println("������ : "+first.divide(second));
			       	break;
				}
//				����ġ�� ���� �ڵ�
//				if(calcStr.compareTo("+") == 0){
//				}else if(calcStr.compareTo("-") == 0){
//				}else if(calcStr.compareTo("*") == 0){
//				}else if(calcStr.compareTo("/") == 0){
//				}
//		        
				System.out.print("try again (Y/N) =>");
				String escmsg = br.readLine();	//Ż�� ���� �Է¹ޱ�
				
//	        	System.out.println("[" + escmsg + "] len=" + escmsg.length());	//�Է¹��� ������Ȯ��
	        	if(escmsg.compareToIgnoreCase("N")== 0 ){
	        		System.out.println("��!!!!");
	        		break;
	        	}

			} catch (IOException e) {	// throws IOException���� Ŭ������ ����Ʈ�ϴ� ��� ĳġ�� ��Ƴ���
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       	
	        
        }	//while e

        return;	//while �ۿ� �־�� Y ���� �� ���������� �Ѿ
        
    }	//main e

}
