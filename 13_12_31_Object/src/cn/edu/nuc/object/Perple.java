package cn.edu.nuc.object;

public class Perple {

	private int age;
	private String name;
	
	public int a = 1000000;
	
	public Perple(){
		System.out.println("Person类执行");
	}
	
	public int getAge(){
		System.out.println("Person类getAge()");
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void printMessage(){
		System.out.println("这是父类的Message");
	}
	
	
	

}
