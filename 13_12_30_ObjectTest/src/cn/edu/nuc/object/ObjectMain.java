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
		 * 1����дJava����������ʾ�˵����������䡣 ����һ�����ࣨPerson���� ������Ӧ��������˽�����ԣ�
		 * 
		 * ������name�������䣨age���� ���幹�췽����������ʼ�����ݳ�Ա �� �ٶ�����ʾ��display�������� �������������ӡ������
		 */

		MyPeople myP1 = new MyPeople(13, "����");
		myP1.display();
		// System.out.println(p1.getAge());

		/*
		 * 2.��дJava����ģ��򵥵ļ�������
		 * ������ΪNumber���࣬
		 * �����������������ݳ�Աn1��n2��
		 * Ӧ����Ϊ˽�С���д���췽��������n1��n2��ʼֵ��
		 * ��Ϊ���ඨ��ӣ�addition��������subtration����
		 * �ˣ�multiplication��������division��
		 * �ȹ��г�Ա������
		 * �ֱ��������Ա����ִ�мӡ������ˡ��������㡣 
		 * ��main�����д���Number��Ķ���
		 * ���ø�������������ʾ��������
		 */
		
		Number num = new Number(12,5);
		System.out.println(num.add());
		System.out.println(num.sub());
		System.out.println(num.mul());
		System.out.println(num.div());
		
		
	}

}
