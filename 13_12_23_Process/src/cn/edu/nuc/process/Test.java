package cn.edu.nuc.process;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 1.��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
		// ���룺a��ֵ�����ĸ���n
		// �����s
		// ����2+22+222+2222+22222(��ʱ����5�������)��
		// �Ͻ���int s = 2+22+222+2222+22222;
		// ����ǣ�24690
		Scanner sc = new Scanner(System.in);
		System.out.print("������a��ֵ:");
		int a = sc.nextInt();
		System.out.print("������n��ֵ:");
		int n = sc.nextInt();
		int tem =0;
		int s =0;
		System.out.print("s=");
		for (int i = 0; i < n; i++) {
			tem += a;//tem=tem+a;
			System.out.print(tem);
			s +=tem;
			a *=10;
			if(i==n-1){
				System.out.print("=");
			}else{
				System.out.print("+");
			}
		}
		System.out.println(s);
		
		
		
		
	}

}
