package cn.edu.nuc.object;

import java.io.IOException;

public class People
{
	// �������η� public protected �����η� private

	private int age; // ����
	private String name; // ����
	
	//��ʼ����
	{
		age = 16;
		name = "����";
		System.out.println(age);
		System.out.println(name);
	}
	

	// ���캯����Ҫд����ֵ,����������������
	// ���캯������
	public People() 
	{
		System.out.println("People()");
	}
	// overload //���أ��������ͻ���������ͬ
	public People(int a)
	{
		//���������������캯��
		//ʹ��this�ؼ���ʵ��
		//this��ʾ��ǰʵ��
		this(11.1f);
		age=a;
		System.out.println("People(int a)");
	}

	public People(float a)
	{
		System.out.println("People(float a)");
	}

	// �����Ĺ���
	// 1.���η�
	// 2.����ֵ����
	//	����ֵ���Ϳ����ǻ����������ͣ�
	// Ҳ��������������
	// 3.������
	// ������һ���ɶ���+����/���ݴʹ���
	// ����ĸ����Сд�����ÿ�����ʵ�һ����ĸ��д
	// 4.����
	// ���������޲����������ж������
	// ����Ĳ��������β�
	// 5.���쳣
	// throws �쳣
	// 6.������
	// �ֲ�����
	public Animal findAnimal(int hight, String name) throws IOException
	{
		int a = hight;
		return new Animal();
	}

	/** ��ȡ���� */
	public int getAge()
	{
		return age;
	}

	/**
	 * ��������
	 * 
	 * @param age_i
	 *            ����
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/** ��ȡ���� */
	public String getName() 
	{
		return name;
	}

	/**
	 * ��������
	 * 
	 * @param name_i
	 *            ����
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
