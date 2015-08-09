package cn.edu.nuc.array;

import java.util.Arrays;


public class ArrayTest
{

	public static void main(String[] args)
	{

		/** 数组的定义/声明 */
		// 以下两种方式都可以，推荐使用int[] a
		// 因为数组是一种类型
		int[] a;
		int b[];
		// 数组不可以在声明的时候指定长度

		// 数组的支持的类型有如下
		// 1、基本数据类型(byte,short,int ,long)
		// (float,double) (boolen) (char)
		// 2、引用类型(类，数组)
		String[] s;

		/** 数组的初始化 */
		// 数组的初始化必须指定数组的大小
		// 1.静态初始化
		a = new int[] { 4, 6, 2, 9 };
		int[] a1 = { 4, 6, 2, 9 };

		// 2.动态初始化，指定数组大小，元素值为默认值
		int[] c;
		c = new int[6];// 指定数组大小
		// boolean 默认是false；
		// 引用默认是null

		/** 数组的使用 */
		c[0] = 7;
		System.out.println(c.length);
		// 给每个数组元素赋值
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		// 打印输出每个数组元素
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i]);
		}
		// 注意数组的大小，避免数组索引越界异常
		//System.out.println(c[6]);

		// foreach结构
		// foreach不会改变数组元素的值，只能读
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
		
		/**多维数组*/
		//java中很多人不赞成称为多维数组。
		//认为所有数组都是一维的
		int[][] q;
		//创建了3个int[]
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
