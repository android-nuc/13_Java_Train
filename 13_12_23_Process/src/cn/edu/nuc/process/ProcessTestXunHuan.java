package cn.edu.nuc.process;

public class ProcessTestXunHuan {
	public static void main(String[] args){
		int n=0;
		//while -->先判断条件，后执行程序块
		while(n<10){
			System.out.println(n);
			n++;
		}
		
		//do--while  -->先执行程序块，后判断条件
		do{
			System.out.println(n);
			n++;
		}while(n<10);
		
		//通过break防止死循环的发生
		while(true){
				break;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int i=0;
		// 三个参数都允许没有值，但中间的判断语句不要空
		for (;i<10; ) {
			System.out.println("试试");
			i++;
		}
		//初始化可以同时进行多个
		for (int j = 0,k=0,l=0; j < args.length; j++) {
			
		}
		
		
		
		
	}
}
