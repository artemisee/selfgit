import java.util.Scanner;

public class ch34 {

	public static void main(String[] args) {
//		------------------------------3.1--------------------------
/*
 ��ĳ���Ҫ����һϵ�����������ݣ�����-1��ʾ���������-1��������������ݡ�������������������е�������ż���ĸ�����		
 */
//		Scanner in= new Scanner (System.in);
//		int x=in.nextInt();
//		int odd=0;
//		int even=0;
//		while (x!=-1){
//			if (x%2==0){
//				even=even+1;
//			}
//			else {
//				odd=odd+1;
//			}
//			x=in.nextInt();
//		}
//		System.out.println(odd+" "+even);
//		-------------------------------3.2----------------------------
/*
 ������������ֵ�ǳ��õı����㷨����ż������һ�ּ򵥵�����ֵ������һ��������
 �Ӹ�λ��ʼ��ÿһλ���ֱ�ţ���λ��1�ţ�ʮλ��2�ţ��Դ����ơ���������ڵ�nλ�ϵ����ּ���x��
 ���x��n����ż����ͬ�������һ��1���������һ��0������������˳��Ѷ�Ӧλ�ı�ʾ��ż�Ե�0��1����¼������
 ���γ���һ�����������֡����磬����342315��������������־���001101
 */
//		Scanner in= new Scanner (System.in);
//		int num;
//		int count=0;
//		int a=0;
//		int b=0;
//		int c=0;
//		double sum=0;
//		int x=in.nextInt();
//		while (x>0){
//			num=x%10;
//			count=count+1;
//			a=num%2;
//			b=count%2;
//			if (a==b){
//				c=1;
//			}
//			else{
//				c=0;
//			}
//			sum=sum+c*(Math.pow(2, count-1));
//			x=x/10;
//		}
//		System.out.println((int)sum);
//		��Լ��������д���������ǻ�����><
//		--------------------------4.2------------------------------
/*
 ��ĳ���Ҫ����һ����������Χ��[-100000,100000]��Ȼ���ú���ƴ�������������ÿһλ���������
������1234���������
yi er san si
ע�⣬ÿ���ֵ�ƴ��֮����һ���ո񣬵��������ֺ���û�пո񡣵���������ʱ��������Ŀ�ͷ���ϡ�fu������-2341���Ϊ��
fu er san si yi
*/
//		Scanner in= new Scanner (System.in);
//		int x=in.nextInt();
//		if (x<0){
//			System.out.print("fu ");
//			x=Math.abs(x);
//		}
//		int a=x;
//		int count=0;
//		int b=1;
//		while (a>0){
//			count=count+1;
//			a=a/10;
//		}
//		for (int i=count;i>0;i--){
//			for (int j=1;j<i;j++){
//				b=b*10;
//			}
//			switch(x/b){
//			case 1:System.out.print("yi");
//			break;
//			case 2:System.out.print("er");
//			break;
//			case 3:System.out.print("san");
//			break;
//			case 4:System.out.print("si");
//			break;
//			case 5:System.out.print("wu");
//			break;
//			case 6:System.out.print("liu");
//			break;
//			case 7:System.out.print("qi");
//			break;
//			case 8:System.out.print("ba");
//			break;
//			case 9:System.out.print("jiu");
//			break;
//			case 0:System.out.print("ling");
//			break;
//			}
//			if(i!=1){
//				System.out.print(" ");
//			}
//			x=x%b;
//			b=1;
//			
//		}
//		---------------------4.1---------------------------------
/*
 ������Ϊ2�ǵ�һ��������3�ǵڶ���������5�ǵ������������������ơ�
���ڣ�������������n��m��0<n<=m<=200����ĳ���Ҫ�����n����������m������֮�����е������ĺͣ�������n�������͵�m��������
 */
//		Scanner in= new Scanner (System.in);
//		int m=in.nextInt();
//		int n=in.nextInt();
//		int count=0;
//		int sum=0;
//		for (int i=2;i<1000;i=i+1){
//			int isPrime=1;
//			for (int j=2;j<i;j++){
//				if (i%j==0){
//					isPrime=0;
//					break;
//				}
//			}
//			if (isPrime==1){
//				count=count+1;
//				if(count>=m&count<=n){
//					sum=sum+i;	
//				}
//			}
//		}
//		System.out.print(sum);	

	}
}
