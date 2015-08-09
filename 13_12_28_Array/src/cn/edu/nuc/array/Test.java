package cn.edu.nuc.array;

public class Test {
	public static void main(String[] args) {
		/*
		 * 输入数组，最大的与第一个元素交换
		 * ， 最小的与最后一个元素交换，输出数组 如：int arr[] = { 12, 5, 98, 56, 1,
		 * 58, 3, 48, 3 }; 输出：98 5 12 56 3 58 3 48 1
		 */
		int arr[] = { 12, 5, 98, 56, 1, 58, 3, 48, 3 };
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int min, max;
		max = arr[0];
		min = arr[arr.length - 1];
		// 一定要记住，数组最大索引值为数组长度减1
		int maxIndex = 0, minIndex = arr.length - 1;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max)
			{
				max = arr[i];
				maxIndex = i;
			}
			if (arr[i] < min) 
			{
				min = arr[i];
				minIndex = i;
			}
		}
		if (maxIndex != 0) 
		{
			int temp = arr[0];
			arr[0] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		if (minIndex != arr.length - 1)
		{
			int temp = arr[arr.length - 1];
			arr[arr.length - 1] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
