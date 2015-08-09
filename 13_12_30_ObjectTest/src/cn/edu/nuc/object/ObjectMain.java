package cn.edu.nuc.object;

public class ObjectMain
{

	public static void main(String[] args)
	{

		People p1 = new People(14);
		People p2 = new People(34.6f);
		
		// int a = 10;
		// p2.setAge(a);
		// System.out.println(a);
		
		p1.setAge(10);
		p2.setOtherPeopleAge(p1);
		System.out.println(p1.getAge());

		/*
		 * 1。编写Java程序，用于显示人的姓名和年龄。 定义一个人类（Person）， 该类中应该有两个私有属性，
		 * 
		 * 姓名（name）和年龄（age）。 定义构造方法，用来初始化数据成员 。 再定义显示（display）方法， 将姓名和年龄打印出来。
		 */

		MyPeople myP1 = new MyPeople(13, "李四");
		myP1.display();
		// System.out.println(p1.getAge());

		/*
		 * 2.编写Java程序，模拟简单的计算器。
		 * 定义名为Number的类，
		 * 其中有两个整型数据成员n1和n2，
		 * 应声明为私有。编写构造方法，赋予n1和n2初始值，
		 * 再为该类定义加（addition）、减（subtration）、
		 * 乘（multiplication）、除（division）
		 * 等公有成员方法，
		 * 分别对两个成员变量执行加、减、乘、除的运算。 
		 * 在main方法中创建Number类的对象，
		 * 调用各个方法，并显示计算结果。
		 */
		
		Number num = new Number(12,5);
		System.out.println(num.add());
		System.out.println(num.sub());
		System.out.println(num.mul());
		System.out.println(num.div());
		
		
	}

}
