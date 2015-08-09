package cn.edu.nuc.process;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 1.求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
		// 输入：a的值，数的个数n
		// 输出：s
		// 例如2+22+222+2222+22222(此时共有5个数相加)。
		// 严禁：int s = 2+22+222+2222+22222;
		// 结果是：24690
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入a的值:");
		int a = sc.nextInt();
		System.out.print("请输入n的值:");
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
