package cn.edu.nuc.array;

import java.util.Arrays;


public class ArrayTest
{

	public static void main(String[] args)
	{

		/** ����Ķ���/���� */
		// �������ַ�ʽ�����ԣ��Ƽ�ʹ��int[] a
		// ��Ϊ������һ������
		int[] a;
		int b[];
		// ���鲻������������ʱ��ָ������

		// �����֧�ֵ�����������
		// 1��������������(byte,short,int ,long)
		// (float,double) (boolen) (char)
		// 2����������(�࣬����)
		String[] s;

		/** ����ĳ�ʼ�� */
		// ����ĳ�ʼ������ָ������Ĵ�С
		// 1.��̬��ʼ��
		a = new int[] { 4, 6, 2, 9 };
		int[] a1 = { 4, 6, 2, 9 };

		// 2.��̬��ʼ����ָ�������С��Ԫ��ֵΪĬ��ֵ
		int[] c;
		c = new int[6];// ָ�������С
		// boolean Ĭ����false��
		// ����Ĭ����null

		/** �����ʹ�� */
		c[0] = 7;
		System.out.println(c.length);
		// ��ÿ������Ԫ�ظ�ֵ
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		// ��ӡ���ÿ������Ԫ��
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i]);
		}
		// ע������Ĵ�С��������������Խ���쳣
		//System.out.println(c[6]);

		// foreach�ṹ
		// foreach����ı�����Ԫ�ص�ֵ��ֻ�ܶ�
		for (int i : c) 
		{
			i = 0;
			System.out.println(i);
		}

		int[] aa = new int[] { 2, 5, 8, 9 };
		int[] bb = new int[] { 10, 50, 30, 90, 40 };
		System.out.println(aa[1]);
		System.out.println(bb[1]);
		bb = aa;
		System.out.println(aa[1]);
		System.out.println(bb[1]);
		bb[1] = 50;
		System.out.println(aa[1]);
		System.out.println(bb[1]);
		
		/**��ά����*/
		//java�кܶ��˲��޳ɳ�Ϊ��ά���顣
		//��Ϊ�������鶼��һά��
		int[][] q;
		//������3��int[]
		q = new int[3][];
		q[0] = new int[]{2,5,7,8};
		q[1] = new int[]{3,6,4};
		q[2] = new int[]{4,2,6,9};
		for (int[] qq : q) 
		{
			for (int i :qq) 
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}
		System.out.println(q[1][3]);
		
		
		
		}
		
		
		

}
