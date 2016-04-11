import java.util.Scanner;

public class ch34 {

	public static void main(String[] args) {
//		------------------------------3.1--------------------------
/*
 你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。		
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
 对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。对于一个整数，
 从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。这个整数在第n位上的数字记作x，
 如果x和n的奇偶性相同，则记下一个1，否则记下一个0。按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，
 就形成了一个二进制数字。比如，对于342315，这个二进制数字就是001101
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
//		大约还有异或的写法不过总是会忘记><
//		--------------------------4.2------------------------------
/*
 你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
如输入1234，则输出：
yi er san si
注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
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
 我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
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
