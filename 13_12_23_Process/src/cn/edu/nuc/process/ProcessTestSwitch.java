package cn.edu.nuc.process;

/**Switch���÷�*/
public class ProcessTestSwitch {
	
	public static void main(String[] args){
		
		//ע��1.
		//Switch ֻ֧��byte short int char ����ö��
		//����Java֧��String java7�Ժ��֧��
		long a = 17;
		char c ='E';
		String s = "�༶141";
		switch (s) {
		case "�༶141":
			System.out.println("������5");
			
		case "�༶142":
			System.out.println("������10");
			break;
		case "�༶143":
			System.out.println("������15");
			break;
		default:
			System.out.println("����������");
			break;
		}
		
		
		//ע��2
		//break��ʹ�ã�
		//��������break��������ǰif��else,switch,for,while,do
		//breakʹ���������Լ����򶨣�ǧ��Ҫ����break
		
		
		
		
	}

}
