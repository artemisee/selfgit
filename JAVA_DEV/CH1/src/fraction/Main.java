package fraction;

/*
 * Fraction(int a, int b)
    构造一个a/b的分数。

这个类要提供以下的功能：

double toDouble();
    将分数转换为double
Fraction plus(Fraction r);
    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。
Fraction multiply(Fraction r);
    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
void print();
    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。

注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。
 */
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	int a;
	int b;
	
	Fraction(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	double toDouble()
	{
		return (double)a/b;
	}
	
	Fraction plus(Fraction r)
	{
		int m=a*r.b+r.a*b;
		int n=b*r.b;
		return new Fraction(m,n);
	}
	
	Fraction multiply(Fraction r)
	{
		int m=a*r.a;
		int n=b*r.b;
		return new Fraction (m,n);
	}
	void print()
	{	
		for(int i=2;i<=Math.min(a,b);i++){
			if(a%i==0&b%i==0){
				a=a/i;
				b=b/i;
			}
		}
		if (a/b==1){
			System.out.println("1");
		}
		else{
			System.out.println(a+"/"+b);
		}
		
	}
}