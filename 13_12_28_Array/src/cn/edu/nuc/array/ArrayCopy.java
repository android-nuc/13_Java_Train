package cn.edu.nuc.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		// ʵ����Random��Ķ���
		
		int[] array1 = new int[rand.nextInt(10)];
		//�������10���ڵ�����Ϊarray1�ĳ���
		
		System.out.println("array1�ĳ���:"+array1.length);
		
		for(int i = 0;i<array1.length;i++)
		{
			array1[i] =rand.nextInt(20) ;
			//�������20���ڵ�����Ϊarray1[i]��ֵ
			
			System.out.println("array1["+i+"]="+array1[i]);
		}
		
		/**�����copy*/
		
		//System.arraycopy(array1, 0, array2, 0, array1.length);
		
		//	array1����Դ����
		//	0����Դ������ʼλ��
		//	array2��Ŀ������
		//	0��Ŀ��������ʼλ��
		//	array1.length����Դ����ĳ���
		
		int[] array2 = new int[array1.length];
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println();
		for(int i = 0;i<array1.length;i++)
		{
			System.out.println("array2["+i+"]="+array2[i]);
		}
		
		//System.arraycopy(array1, x, array2, y, z);
		
		//	array1����Դ����
		//	x����Դ������ʼλ�õ� x ��Ԫ��
		//	array2��Ŀ������
		//	y��Ŀ��������ʼλ�õ� y ��Ԫ��
		//	z����Դ����� x ��Ԫ�ؿ�ʼ���� z ��Ԫ��
		
		
		int[] a1 = { 1, 3, 1, 3, 1, 3, 1, 3 };
		int[] a2 = { 2, 4, 2, 4, 2, 4, 2, 4 };
		
		for(int i=0;i<a2.length;i++)
		{
			System.out.println("a2["+i+"]="+a2[i]);
		}
		System.out.println();
		
		System.arraycopy(a1, 2, a2, 3, 4);
		for(int i=0;i<a2.length;i++)
		{
			System.out.println("a2["+i+"]="+a2[i]);
		}
		
		int[] aaa = new int[] { 2, 5, 8, 9 };
		int[] bbb ;
		//������ݼ���ctrl+shift+o
		//�������飬���ı�ԭ�������ֵ
		//bbb����ָ��һ����ַ
		bbb=Arrays.copyOf(aaa, aaa.length);
		System.out.println(bbb.length);
		for (int i = 0; i < bbb.length; i++) 
		{
			System.out.print(bbb[i]+" ");
		}
		
			
		
		

	}

}
