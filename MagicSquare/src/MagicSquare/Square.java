package MagicSquare;

import java.util.Scanner;

public class Square {	//������

	public void Square(){}	//Ŭ���� ȣ�� �� �� �ְ� �����ڸ����
	
	public void test(){	//�Է� �ޱ�
		while(loop()){	// ������ ����ϴ� �޼ҵ� ȣ��
			System.out.println("------>");	// �����ʴ� �� �Է� �� ȣ��
		}
	}

	//������ ĭ �� �Է¹ޱ�
	private int getInput(){	
		
		int a = 0 ;		//�������� ������
		
		while(true){	//�Է� �ȳ��ϱ�
			System.out.println("Ȧ���� �Է��ϼ���=>");
			
			Scanner scanner = new Scanner(System.in);	//�Է� Ŭ����
			
			String strIn = scanner.next();	//������ ĭ ��_String���� ���� �޾Ƽ� ���ڿ� ���� ���
			
			try {	
				a = Integer.parseInt(strIn);	//���ڷ� ���� ���� ���ڷ� �Ľ����ֱ�
				break;	//������
			} catch (Exception e) {
				//e.printStackTrace();	�̰� ������ ���ڿ� �޾����� �����ȳ� ����
			}
		}
		return a;	//������ ��
	}
	
	private boolean loop(){	//������ ���

		int a = getInput();	//�Է¹޴� �޼ҵ� Ȧ��
		
		if( a == 0) return false;	//0 �Է½� �޼ҵ� ����
		
		int[][] b = new int[a][a];	//������ �ȿ� �� �� ,ĭ��
		
		int i=0,j=a/2,v = 1; //���� ���� ����
		
		if( a % 2 !=0 ){	//�Է¹��� ���� Ȧ�� �϶�
			System.out.println("�Է��� Ȧ�� : "+ a); 
		}else{	//¦���϶�
			System.out.println("¦���� �ȵ˴ϴ�"); 
			return true;	//�޼ҵ� ����
		}
		
		while(true){	//��� �ݺ�
			if(i < 0){	
				i=a-1;	// ���� ù�ຸ�� �۾����� ��� ���������� �Ѿ��.
			}
			if(j == a){		
				j = 0 ;	//���� ������������ Ŀ���� ��� ù ���� �Ѿ��.
			}
			if(b[i][j]==0){
				b[i][j] = v;
			}
			if(v % a == 0){	//���� ���� ����̸� �ุ ����
				i++;
			}else{
				i--;
				j++;
			}
				v++;
			if(v == a*a+1){	//��������
				break;
			}
		}//while e
		
		print(a, b);	//��� �Լ� ȣ��(������ ���)
		
		return true;	//��
	}
	
	//��� �޼ҵ� 
	private void print(int a, int[][] b){	
		//loop()���� �μ� �޾ƿ���
			for(int k =0 ; k < a ; k++){	//���� ĭ�� ���� ��� ����
				for(int k2 = 0 ; k2 < a ; k2++){	//���� ĭ�� ���� ��� ����
					String s = String.format("%3d",b[k][k2]);	//���� ����
					System.out.print(s);	//ȭ�� ���
				}
				System.out.println();
			}
		
	}	//��� �޼ҵ� e
}
