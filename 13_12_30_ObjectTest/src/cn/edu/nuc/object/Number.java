package cn.edu.nuc.object;

public class Number {

	private int n1;
	private int n2;

	public Number(int n1, int n2) 
	{
		this.n1 = n1;
		this.n2 = n2;
	}

	public int add()
	{
		return n1 + n2;
	}
	
	public int add(int n1,int n2)
	{
		return n1+n2;
	}

	public int sub()
	{
		return n1 - n2;
	}

	public int mul() 
	{
		return n1 * n2;
	}
	
	public int div() 
	{
		return n1 / n2;
	}

}
