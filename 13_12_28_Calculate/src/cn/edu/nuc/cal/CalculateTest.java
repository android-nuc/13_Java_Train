package cn.edu.nuc.cal;

public class CalculateTest {

	public static void main(String[] args) {

		// 算数运算符
		// + - * / % ++ ---

		// 位运算符
		// & | ^ << >> >>>

		/** 赋值运算符 */
		// 把直接量复制给变量
		int a = 5;
		// 把表达式复制给变量
		a = 5 + 6;
		// 把引用复制给对象
		String s1 = "sss";
		String s2 = s1;
		// 赋值可以连续赋值
		int b, c, d;
		a = b = c = d = 7;

		a = a + 6;
		// 扩展赋值运算符
		// java中推荐使用如下方式运算
		a += 6;
		a -= 6;
		a *= 6;
		a /= 6;// --> a=a/6
		a &= 3;
		a |= 3;

		/** 比较运算符 */
		// >,>=,<,<=,==,!=
		// 注意在判断时用“==”，不要用“=”
		// 碰到引用类型的时候使用==需要谨慎
		System.out.println(5 == 4);

		/** 逻辑运算符 */
		// &&,&,||,|,!,^
		a = 5;
		b = 9;
		// 短路，前面的符合条件，后面的不会理
		if (a > 7 && b++ > 7) {
			System.out.println("成功   a=" + a + "  b=" + b);
		} else {
			System.out.println("失败   a=" + a + "  b=" + b);
		}
		a = 5;
		b = 9;
		if (a > 7 & b++ > 7) {
			System.out.println("成功   a=" + a + "  b=" + b);
		} else {
			System.out.println("失败   a=" + a + "  b=" + b);
		}

		/** 三目运算符 */
		// ？：
		int aa = 5 > 4 ? 7 : 2;
		String bb = a>b? "a大":"b大";
		System.out.println(bb);
		int cc = a>b?a++:b++;

	}

}
