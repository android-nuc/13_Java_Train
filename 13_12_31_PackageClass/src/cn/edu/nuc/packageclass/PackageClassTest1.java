package cn.edu.nuc.packageclass;

public class PackageClassTest1 {
	
	private static String s71 = "Android";
	private static String s72 = "Android";
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**��װ��*/
		//�ѻ����������ͷ�װ����
		//byte short int long float double char boolean
		//byte -> Byte
		//short ->Short
		//int -> Integer
		//long ->Long
		//float ->Float
		//double ->Double
		//char ->Character
		//boolean ->Boolean
		
		/**�����������ͺͰ�װ���ת��*/
		boolean bool = true;
		//������װ�����
		Boolean boolObj = new Boolean(true);
		//������������ ->��װ��
		boolObj = new Boolean(bool);
		//��װ�� ->������������       ***Value();
		bool = boolObj.booleanValue();
		
		Integer intObj = new Integer(15);
		int i = intObj.intValue();
		
		/**String���ͺͻ����������͵�ת��*/
		String sInt = "198";
		//String���� ->��װ��
		Integer intObj2 = new Integer(sInt);
		int i2 = intObj2.intValue();
		//String���� ->������������
		int i22 = Integer.parseInt("1383");
		float f22 = Float.parseFloat("123.24f");
		//������������->String����
		String s3 = String.valueOf(15);
		double d3 = 235.234235;
		String s33 = String.valueOf(d3);
		String s333 = d3+"";
		
		Integer i4 = new Integer(2);
		Integer i44 = new Integer(2);
		System.out.println(i4==i44);
		//���������������ͱȽϣ�ʹ��==
		//�����������ͱȽϣ�ʹ��equals
		Integer i5 = 2;
		Integer i55 = 2;
		System.out.println(i5==i55);
		Integer i51 = 222;
		Integer i551 = 222;
		System.out.println(i51.equals(i551));
		
		String s61 = "Android";
		String s62  ="Android";
		String s81 = "Andr";
		String s82 = "oid";
		String s84 = "Andr"+"oid";
		String s83 = s81 + s82;
		System.out.println(s62==s84);
		System.out.println(s62==s83);
		System.out.println(s71==s72);
		

	}

}
