package cn.edu.nuc.cal;

public class CalculateTest1 {

	public static void main(String[] args) {

		// ���������
		// ��+�����÷�
		// short��byte����ʱ�Զ�ת����int��
		short a = 1;
		byte b = 2;
		int c = a + b;
		// "+"Ҳ�����������ӷ�
		System.out.println("Android" + "ʵ����" + 305);

		// ��-������ͬ��+��������Ͳ�����

		// "*"!="X" c=a*b
		short a2 = 32767;
		short a3 = 32767;
		// �˷�һ��Ҫע�ⷶΧ
		int a4 = a2 * a3 * a2 * a3 * a2 * a3 * a2 * a3;
		System.out.println(a4);

		// ��/������
		// ֻҪ/��������������һ���Ǹ����ͣ�
		// ��ô��������Ǹ�����
		int c1 = 17 / 6;
		double d1 = 5.2 / 2.1;
		System.out.println(d1);
		//��������Ϊ0
		//int c2 = 5/0;
		//���ڳ���0�����㣬�����������������һ���Ǹ����ͣ�
		//������������������С
		float d2 =5.0f/0;
		float d3 =-5/0.0f;
		System.out.println(d2);
		System.out.println(d3);
		
		//%ȡ������
		int c11 = 17 % 6;
		double d11 = 5.3 % 2.1;
		System.out.println(d11);
		
		//++
		int aa =5;
		int bb = ++aa;
		System.out.println(aa);
		System.out.println(bb);
		//--
		aa=5;
		bb=4;
		//����Ȥ���Լ�����ȥ��
		int cc = aa++ - --bb*++aa/bb-->>2%aa--;
		byte dd=-5;
		System.out.println(dd&9);
		System.out.println(dd>>2);//-2
		System.out.println(dd>>>2);
		
		int ff = 5;
		//λ���ձ�ʹ����Ϊ��*2�ı������ͳ���2�ı���������
		//λ�Ʋ��ı�ԭ�ȵ�ֵ
		// byte �� short λ���Զ�ת����32λ��int��
		//������Ҫ�㸺����λ��
		System.out.println(ff<<2);
		System.out.println(ff>>2);
		/**��ҵ
		 * ���9*9�˷��ھ���*/
	}

}
