package cn.edu.nuc.object;

public class Student extends Perple {

	private int no;
	public int a = 10;

	// this�� super�ؼ���ֻ��ʵ�������е���
	// ������Ӧ�Ĺ��캯������������๹�캯����һ��
	public Student() {
		// ����ִ�и���Ĺ��캯��,
		// û��������Ĭ�ϵ��ø��๹�캯��
		super();
		System.out.println("Student��ִ��");
		// System.out.println(super.getAge());
	}

	public Student(int no) {
		// 1.�ȿ���û��this������������Ӧ�Ĺ��캯����
		// 2.�ٿ���û��super�����������Ӧ�ĸ��๹�캯��
		// û��super�������ʽ�����޲ι��캯��
		this();
		System.out.println("Student��(int no)ִ��");
		this.no = no;
	}
	
	public void printFatherValue(){
		System.out.println("���Ǹ�����û�е�");
	}
	
	@Override
	public int getAge(){
		super.getAge();
		System.out.println("Student��getAge()");
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
		System.out.println("��������Student���Ǹ���ķ���");
	}
	
	
	
	

}
