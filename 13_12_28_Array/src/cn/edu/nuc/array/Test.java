package cn.edu.nuc.array;

public class Test {
	public static void main(String[] args) {
		/*
		 * �������飬�������һ��Ԫ�ؽ���
		 * �� ��С�������һ��Ԫ�ؽ������������ �磺int arr[] = { 12, 5, 98, 56, 1,
		 * 58, 3, 48, 3 }; �����98 5 12 56 3 58 3 48 1
		 */
		int arr[] = { 12, 5, 98, 56, 1, 58, 3, 48, 3 };
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		int min, max;
		max = arr[0];
		min = arr[arr.length - 1];
		// һ��Ҫ��ס�������������ֵΪ���鳤�ȼ�1
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
