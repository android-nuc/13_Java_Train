package cn.edu.nuc.process;

/**Switch的用法*/
public class ProcessTestSwitch {
	
	public static void main(String[] args){
		
		//注意1.
		//Switch 只支持byte short int char 还有枚举
		//部分Java支持String java7以后的支持
		long a = 17;
		char c ='E';
		String s = "班级141";
		switch (s) {
		case "班级141":
			System.out.println("内容是5");
			
		case "班级142":
			System.out.println("内容是10");
			break;
		case "班级143":
			System.out.println("内容是15");
			break;
		default:
			System.out.println("内容是其他");
			break;
		}
		
		
		//注意2
		//break的使用，
		//程序碰到break会跳出当前if，else,switch,for,while,do
		//break使用与否根据自己程序定，千万不要忽视break
		
		
		
		
	}

}
