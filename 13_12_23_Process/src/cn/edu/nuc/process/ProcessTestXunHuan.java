package cn.edu.nuc.process;

public class ProcessTestXunHuan {
	public static void main(String[] args){
		int n=0;
		//while -->���ж���������ִ�г����
		while(n<10){
			System.out.println(n);
			n++;
		}
		
		//do--while  -->��ִ�г���飬���ж�����
		do{
			System.out.println(n);
			n++;
		}while(n<10);
		
		//ͨ��break��ֹ��ѭ���ķ���
		while(true){
				break;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int i=0;
		// ��������������û��ֵ�����м���ж���䲻Ҫ��
		for (;i<10; ) {
			System.out.println("����");
			i++;
		}
		//��ʼ������ͬʱ���ж��
		for (int j = 0,k=0,l=0; j < args.length; j++) {
			
		}
		
		
		
		
	}
}
