package cn.edu.nuc.object;

public class Perple {

	private int age;
	private String name;
	
	public int a = 1000000;
	
	public Perple(){
		System.out.println("Person��ִ��");
	}
	
	public int getAge(){
		System.out.println("Person��getAge()");
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void printMessage(){
		System.out.println("���Ǹ����Message");
	}
	
	
	

}
