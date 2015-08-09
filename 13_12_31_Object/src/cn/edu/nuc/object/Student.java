package cn.edu.nuc.object;

public class Student extends Perple {

	private int no;
	public int a = 10;

	// this和 super关键字只能实例方法中调用
	// 父类相应的构造函数必须放在子类构造函数第一行
	public Student() {
		// 首先执行父类的构造函数,
		// 没有声明则默认调用父类构造函数
		super();
		System.out.println("Student类执行");
		// System.out.println(super.getAge());
	}

	public Student(int no) {
		// 1.先看有没有this，有则跳到相应的构造函数中
		// 2.再看有没有super，有则调用相应的父类构造函数
		// 没有super则调用隐式父类无参构造函数
		this();
		System.out.println("Student类(int no)执行");
		this.no = no;
	}
	
	public void printFatherValue(){
		System.out.println("这是父类中没有的");
	}
	
	@Override
	public int getAge(){
		super.getAge();
		System.out.println("Student类getAge()");
		return 10;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("这是子类Student覆盖父类的方法");
	}
	
	
	
	

}
