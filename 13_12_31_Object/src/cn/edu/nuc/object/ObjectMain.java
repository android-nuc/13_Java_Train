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
		
		//��̬
		//����   ����     ���า�ǵĸ��෽��
		//������һ������ĸ���
		//����ʱ��������Ƿ����ָ������
		Perple p1 = new Student();
		//����ʱ��������õ���Ӧ����
		p1.printMessage();
		Perple p2 = new Perple();
		p2.printMessage();
		//ͬһ���������ֳ���ͬ����̬
		
		
		
		

	}

}
