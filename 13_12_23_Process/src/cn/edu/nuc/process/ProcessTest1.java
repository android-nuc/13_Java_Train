package cn.edu.nuc.process;

import java.util.Scanner;

public class ProcessTest1 {

	public static void main(String[] args) {

		new ProcessTest1().testIf();
		
		/** if条件语句 */
		// 第一种if语句if--
		int a = 12, b = 3;
		if (a > b) {
			System.out.println("a大于b");
		}
		// 第二种if语句if--else--
		if (a > b) {
			System.out.println("a大于b");
		} else {
			System.out.println("a不大于b");
		}
		// 第三种if语句if--else if--else if--....else
		if (a > b) {
			System.out.println("a大于b");
		} else if (a == b) {
			System.out.println("a等于b");
		} else {
			System.out.println("a小于b");
		}

		// 注意1,if只对条件语句后的第一个“；”内容起作用
		// 都要加｛｝，习惯问题
		if (a > b)
			;// 下面内容对条件语句无效，因为有“；”
		{
			System.out.println("结果是");
			System.out.println("a大于b");
		}
		if (a > b) {
			System.out.println("a大于b");
		}
		// 注意2,不要写有歧义的条件语句，
		// 尽量把范围窄的写在前面
		a = 50;
		if (a > 20) {

		} else if (a > 40) {

		} else if (a > 60) {

		}

		
	}
	/*100 ~ 90(含90) A
	90 ~ 80(含80) B
	80 ~ 0(含0) C
	其他F*/
	public void testIf(){
		Scanner sc = new Scanner(System.in);
		System.out.println("分数等级判断系统");
		System.out.print("请输入分数：");
		int score = sc.nextInt();//在控制台得到一个int型数据
		System.out.println();
		char stage;
		if(score>=90&&score<=100){
			stage = 'A';
		}else if(score>=80&&score<90){
			stage = 'B';
		}else if(score>=0&&score<80){
			stage = 'C';
		}else{
			stage = 'F';
		}
		System.out.println("分数等级："+stage);
	}

}
