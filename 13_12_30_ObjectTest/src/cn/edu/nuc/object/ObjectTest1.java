package cn.edu.nuc.object;

import javax.rmi.CORBA.Util;

import org.omg.SendingContext.RunTime;

public class ObjectTest1 {

	// 1.类的声明
	// 类由以下组成
	// 类修饰符 public static abstract final private
	final class ClassTest1 {
		// 不能用作父类
	}

	private class ClassTest2 {
		// 只能在类中声明，而且要在类中使用
	}

	// 类名
	// 第一个字母必须大写，尽量不要使用_ $
	// 每个单词的首字母必须大写，不允许有空格

	// 父类->基类->超类
	// extends 父类
	// 父类只允许有一个，如果没有父类，
	// 则默认继承Object类

	// 接口interface
	// implements 接口1，接口2，...

	// 类体
	// 类体由｛｝组成，里面包含类的属性和方法

//	private class ClassTest3 extends Util 
//		implements Runnable, RunTime {
//		
//	}

}
