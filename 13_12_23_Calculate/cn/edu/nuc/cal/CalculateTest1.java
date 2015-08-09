package cn.edu.nuc.cal;

public class CalculateTest1 {

	public static void main(String[] args) {

		// 算数运算符
		// “+”的用法
		// short、byte运算时自动转换成int型
		short a = 1;
		byte b = 2;
		int c = a + b;
		// "+"也可以用作连接符
		System.out.println("Android" + "实验室" + 305);

		// “-”运算同“+”，这里就不讲了

		// "*"!="X" c=a*b
		short a2 = 32767;
		short a3 = 32767;
		// 乘法一定要注意范围
		int a4 = a2 * a3 * a2 * a3 * a2 * a3 * a2 * a3;
		System.out.println(a4);

		// “/”除法
		// 只要/左右两个参数有一个是浮点型，
		// 那么，结果就是浮点型
		int c1 = 17 / 6;
		double d1 = 5.2 / 2.1;
		System.out.println(d1);
		//除数不能为0
		//int c2 = 5/0;
		//对于除以0的运算，如果左右两个参数有一个是浮点型，
		//则会输出无穷大或者无穷小
		float d2 =5.0f/0;
		float d3 =-5/0.0f;
		System.out.println(d2);
		System.out.println(d3);
		
		//%取余运算
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
		//有兴趣的自己计算去吧
		int cc = aa++ - --bb*++aa/bb-->>2%aa--;
		byte dd=-5;
		System.out.println(dd&9);
		System.out.println(dd>>2);//-2
		System.out.println(dd>>>2);
		
		int ff = 5;
		//位移普遍使用是为了*2的倍数，和除以2的倍数的问题
		//位移不改变原先的值
		// byte 和 short 位移自动转换成32位，int型
		//尽量不要算负数的位移
		System.out.println(ff<<2);
		System.out.println(ff>>2);
		/**作业
		 * 输出9*9乘法口诀表*/
	}

}
