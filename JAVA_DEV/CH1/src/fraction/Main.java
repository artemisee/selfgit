package fraction;

/*
 * Fraction(int a, int b)
    ����һ��a/b�ķ�����

�����Ҫ�ṩ���µĹ��ܣ�

double toDouble();
    ������ת��Ϊdouble
Fraction plus(Fraction r);
    ���Լ��ķ�����r�ķ�����ӣ�����һ���µ�Fraction�Ķ���ע��Сѧ���꼶ѧ���������������ӵĹ���
Fraction multiply(Fraction r);
    ���Լ��ķ�����r�ķ�����ˣ�����һ���µ�Fraction�Ķ���
void print();
    ���Լ��ԡ�����/��ĸ������ʽ�������׼����������лس����С����������1/1��Ӧ�����1�������Ӵ��ڷ�ĸʱ������Ҫ����������֣���31/30��һ����ȷ�������

ע�⣬�ڴ��������������Ӧ�û������Ϊ�����ʽ����2/4Ӧ�ñ�����Ϊ1/2��
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