package cn.edu.nuc.process;

import java.util.Scanner;

public class ProcessTest1 {

	public static void main(String[] args) {

		new ProcessTest1().testIf();
		
		/** if������� */
		// ��һ��if���if--
		int a = 12, b = 3;
		if (a > b) {
			System.out.println("a����b");
		}
		// �ڶ���if���if--else--
		if (a > b) {
			System.out.println("a����b");
		} else {
			System.out.println("a������b");
		}
		// ������if���if--else if--else if--....else
		if (a > b) {
			System.out.println("a����b");
		} else if (a == b) {
			System.out.println("a����b");
		} else {
			System.out.println("aС��b");
		}

		// ע��1,ifֻ����������ĵ�һ������������������
		// ��Ҫ�ӣ�����ϰ������
		if (a > b)
			;// �������ݶ����������Ч����Ϊ�С�����
		{
			System.out.println("�����");
			System.out.println("a����b");
		}
		if (a > b) {
			System.out.println("a����b");
		}
		// ע��2,��Ҫд�������������䣬
		// �����ѷ�Χխ��д��ǰ��
		a = 50;
		if (a > 20) {

		} else if (a > 40) {

		} else if (a > 60) {

		}

		
	}
	/*100 ~ 90(��90) A
	90 ~ 80(��80) B
	80 ~ 0(��0) C
	����F*/
	public void testIf(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ȼ��ж�ϵͳ");
		System.out.print("�����������");
		int score = sc.nextInt();//�ڿ���̨�õ�һ��int������
		System.out.println();
		char stage;
		if(score>=90&&score<=100){
			stage = 'A';
		}else if(score>=80&&score<90){
			stage = 'B';
		}else if(score>=0&&score<80){
			stage = 'C';
		}else{
			stage = 'F';
		}
		System.out.println("�����ȼ���"+stage);
	}

}
