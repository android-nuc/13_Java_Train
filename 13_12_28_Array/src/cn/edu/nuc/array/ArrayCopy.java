package cn.edu.nuc.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		// 实例化Random类的对象
		
		int[] array1 = new int[rand.nextInt(10)];
		//随机产生10以内的数作为array1的长度
		
		System.out.println("array1的长度:"+array1.length);
		
		for(int i = 0;i<array1.length;i++)
		{
			array1[i] =rand.nextInt(20) ;
			//随机产生20以内的数作为array1[i]的值
			
			System.out.println("array1["+i+"]="+array1[i]);
		}
		
		/**数组的copy*/
		
		//System.arraycopy(array1, 0, array2, 0, array1.length);
		
		//	array1：来源数组
		//	0：来源数组起始位置
		//	array2：目的数组
		//	0：目的数组起始位置
		//	array1.length：来源数组的长度
		
		int[] array2 = new int[array1.length];
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println();
		for(int i = 0;i<array1.length;i++)
		{
			System.out.println("array2["+i+"]="+array2[i]);
		}
		
		//System.arraycopy(array1, x, array2, y, z);
		
		//	array1：来源数组
		//	x：来源数组起始位置第 x 个元素
		//	array2：目的数组
		//	y：目的数组起始位置第 y 个元素
		//	z：来源数组第 x 个元素开始复制 z 个元素
		
		
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
		//导包快捷键：ctrl+shift+o
		//复制数组，不改变原先数组的值
		//bbb重新指向一个地址
		bbb=Arrays.copyOf(aaa, aaa.length);
		System.out.println(bbb.length);
		for (int i = 0; i < bbb.length; i++) 
		{
			System.out.print(bbb[i]+" ");
		}
		
			
		
		

	}

}
