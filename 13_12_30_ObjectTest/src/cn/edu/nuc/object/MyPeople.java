package cn.edu.nuc.object;

public class MyPeople {
	
	/**����*/
	private int age;// ����
	private String name;// ����

	/** ���캯�� */
	public MyPeople(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	/** ��ʾ��������� */
	public void display()
	{
		System.out.println("���䣺" + age);
		System.out.println("������" + name);
	}

}
