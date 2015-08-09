package cn.edu.nuc.object;

import java.io.IOException;

public class People
{
	// 属性修饰符 public protected 无修饰符 private

	private int age; // 年龄
	private String name; // 名字
	
	//初始化块
	{
		age = 16;
		name = "张三";
		System.out.println(age);
		System.out.println(name);
	}
	

	// 构造函数不要写返回值,命名必须与类重名
	// 构造函数可以
	public People() 
	{
		System.out.println("People()");
	}
	// overload //重载，参数类型或者数量不同
	public People(int a)
	{
		//如果想调用其他构造函数
		//使用this关键字实现
		//this表示当前实例
		this(11.1f);
		age=a;
		System.out.println("People(int a)");
	}

	public People(float a)
	{
		System.out.println("People(float a)");
	}

	// 方法的构成
	// 1.修饰符
	// 2.返回值类型
	//	返回值类型可以是基本数据类型，
	// 也可以是引用类型
	// 3.方法名
	// 方法名一般由动词+名词/形容词构成
	// 首字母必须小写，其后每个单词第一个字母大写
	// 4.参数
	// 参数可以无参数，可以有多个参数
	// 这里的参数叫做形参
	// 5.抛异常
	// throws 异常
	// 6.方法体
	// 局部变量
	public Animal findAnimal(int hight, String name) throws IOException
	{
		int a = hight;
		return new Animal();
	}

	/** 获取年龄 */
	public int getAge()
	{
		return age;
	}

	/**
	 * 设置年龄
	 * 
	 * @param age_i
	 *            年龄
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/** 获取名字 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 设置名字
	 * 
	 * @param name_i
	 *            名字
	 */
	public void setName(String name_i)
	{
		name = name_i;
	}

	public void setOtherPeopleAge(People p)
	{
		p.setAge(100000);
	}

}
