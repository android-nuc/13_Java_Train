package cn.edu.nuc.packageclass;

public class PackageClassTest1 {
	
	private static String s71 = "Android";
	private static String s72 = "Android";
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**包装类*/
		//把基本数据类型封装成类
		//byte short int long float double char boolean
		//byte -> Byte
		//short ->Short
		//int -> Integer
		//long ->Long
		//float ->Float
		//double ->Double
		//char ->Character
		//boolean ->Boolean
		
		/**基本数据类型和包装类的转换*/
		boolean bool = true;
		//创建包装类对象
		Boolean boolObj = new Boolean(true);
		//基本数据类型 ->包装类
		boolObj = new Boolean(bool);
		//包装类 ->基本数据类型       ***Value();
		bool = boolObj.booleanValue();
		
		Integer intObj = new Integer(15);
		int i = intObj.intValue();
		
		/**String类型和基本数据类型的转换*/
		String sInt = "198";
		//String类型 ->包装类
		Integer intObj2 = new Integer(sInt);
		int i2 = intObj2.intValue();
		//String类型 ->基本数据类型
		int i22 = Integer.parseInt("1383");
		float f22 = Float.parseFloat("123.24f");
		//基本数据类型->String类型
		String s3 = String.valueOf(15);
		double d3 = 235.234235;
		String s33 = String.valueOf(d3);
		String s333 = d3+"";
		
		Integer i4 = new Integer(2);
		Integer i44 = new Integer(2);
		System.out.println(i4==i44);
		//碰到基本数据类型比较，使用==
		//碰到引用类型比较，使用equals
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
