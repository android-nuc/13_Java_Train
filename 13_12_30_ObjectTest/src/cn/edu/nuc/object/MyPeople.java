package cn.edu.nuc.object;

public class MyPeople {
	
	/**属性*/
	private int age;// 年龄
	private String name;// 名字

	/** 构造函数 */
	public MyPeople(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	/** 显示年龄和姓名 */
	public void display()
	{
		System.out.println("年龄：" + age);
		System.out.println("姓名：" + name);
	}

}
