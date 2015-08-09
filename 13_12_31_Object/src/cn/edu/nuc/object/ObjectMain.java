package cn.edu.nuc.object;

public class ObjectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Perple p1 = new Perple();
		Student s1 = new Student(12);
		System.out.println(s1.a);
		s1.printFatherValue();
		s1.getAge();
		
		//多态
		//父类   调用     子类覆盖的父类方法
		//子类是一种特殊的父类
		//编译时会检查对象是否具有指定函数
		Perple p1 = new Student();
		//运行时会调用引用的相应方法
		p1.printMessage();
		Perple p2 = new Perple();
		p2.printMessage();
		//同一个方法表现出不同的形态
		
		
		
		

	}

}
