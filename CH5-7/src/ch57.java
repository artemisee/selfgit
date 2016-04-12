import java.util.Scanner;


public class ch57 {

	public static void main(String[] args) {
/*
* 程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系数相加然后输出。
程序要处理的幂最大为100。[目前需要输入-1结束，待解决]
*/
//
//		Scanner in= new Scanner (System.in);
//		int[] factor = new int[101];
//		for(int i=0;i<101;i++){
//			factor[i]=0;
//		}
//		int x= in.nextInt();
//		while(x>=0){
//			factor[x]=factor[x]+in.nextInt();
//			x=in.nextInt();
//		}
//		for(int i=100;i>1;i--){
//			if(factor[i]>0){
//			System.out.print(factor[i]+"x"+i+"+");
//			}
//		}
//		if(factor[1]>0){
//			System.out.print(factor[1]+"x"+"+");
//		}
//		System.out.print(factor[0]);
/*
 * 你的程序先要读入一个整数n，范围是[3,100]，这表示井字棋棋盘的边长。比如n=3就表示是一个3x3的棋盘。
 * 然后，要读入n行，每行n个数字，每个数字是1或0，依次表示[0,0]到[n-1,n-1]位置上的棋子。1表示X，0表示O（大写字母O）。
你的程序要判断其中是否存在某一方获胜，获胜的条件是存在整行或整列或整条对角线或整条反对角线上是相同的棋子。
如果存在，则输出代表获胜一方字母：X或O（大写字母X或O）；如果没有任何一方获胜，则输出NIL（三个大写字母，中间是字母I（India的I）。
 */
//		Scanner in= new Scanner (System.in);
//		final int SIZE=in.nextInt();
//		int[][] board=new int[SIZE][SIZE];
//		boolean gotResult=false;
//		int numOfX=0;
//		int numOfO=0;
//		
//		for(int i=0;i<board.length;i++)
//		{
//			for (int j=0; j<board[i].length; j++)
//			{
//				board[i][j]=in.nextInt();
//			}
//		}
////		检查行
//		for(int i=0;i<board.length;i++)
//		{
//			for (int j=0;j<board[i].length;j++)
//			{
//				numOfX=0;
//				numOfO=0;
//				if(board[i][j]==1)
//				{
//					numOfX++;
//				}
//				else
//				{
//					numOfO++;
//				}
//			}
//			if (numOfX==SIZE||numOfO==SIZE)
//			{
//				gotResult=true;
//				break;
//			}
//		}
////		检查列
//		if(!gotResult){
//			for(int i=0;i<SIZE;i++)
//			{
//				for (int j=0;j<SIZE;j++)
//				{
//					numOfX=0;
//					numOfO=0;
//					if(board[j][i]==1)
//					{
//						numOfX++;
//					}
//					else
//					{
//						numOfO++;
//					}
//				}
//				if (numOfX==SIZE||numOfO==SIZE)
//				{
//					gotResult=true;
//					break;
//				}
//			}
//		}
//		
////		检查对角线
//		if(!gotResult){
//			numOfX=0;
//			numOfO=0;
//			for (int i=0; i<SIZE;i++)
//			{
//				if(board[i][SIZE-i-1]==1)
//				{
//					numOfX++;
//				}
//				else
//				{
//					numOfO++;
//				}
//			}
//			if (numOfX==SIZE||numOfO==SIZE)
//			{
//				gotResult=true;
//			}
//		}
//		if(!gotResult){
//			numOfX=0;
//			numOfO=0;
//			for (int i=0; i<SIZE;i++)
//			{
//				if(board[i][i]==1)
//				{
//					numOfX++;
//				}
//				else
//				{
//					numOfO++;
//				}
//			}
//			if (numOfX==SIZE||numOfO==SIZE)
//			{
//				gotResult=true;
//			}
//		}
//		if(gotResult)
//		{
//			if(numOfX==SIZE){
//				System.out.println("X");
//			}
//			if(numOfO==SIZE){
//				System.out.println("O");
//			}
//		}
//		else{
//			System.out.println("NIL");
//		}
/*
 * 你的程序要读入一行文本，其中以空格分隔为若干个单词，以‘.’结束。你要输出这行文本中每个单词的长度。
 * 这里的单词与语言无关，可以包括各种符号，比如“it's”算一个单词，长度为4。注意，行中可能出现连续的空格
 */
//		

//		String S;
//		S=in.nextLine();
//		 String[] line=S.split("\\s+");		
//		for (int i=0; i<line.length-1;i++){
//			System.out.print(line[i].length()+" ");
//		}
//		System.out.print(line[line.length-1].length()-1);
/*
 * 每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。
 */
//		Scanner in = new Scanner (System.in);
//		int a=in.nextInt();
//		fac(a);
/*
 * 一个正整数的因子是所有可以整除它的正整数。而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。
现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。
提示：可以写一个函数来判断某个数是否是完数。

 */
//		Scanner in = new Scanner (System.in);
//		int n=in.nextInt();
//		if (n==1){
//			n=n+1;
//		}
//		int m=in.nextInt();
//		boolean isfirst=true;
//		int count=0;
//		for(int i=n;i<=m;i++){
//			if(isPerfect(i)){
//				if(isfirst){
//					System.out.print(i);
//					isfirst=false;
//					count=count+1;
//				}
//				else{
//					System.out.print(" "+i);
//					count=count+1;
//				}
//			}
//		}
//		if(count==0){
//			System.out.print(" ");
//		}
		
//		for (int i=n; i<=m;i++){
//			int origan=i;
//			int time=1;
//			int sum=0;
//			int cnt=0;
//			int[] factor=new int [50];
//			for(int k=0; k<factor.length;k++){
//				factor[k]=0;
//			}
//			for (int p=0; p<factor.length;p++){
//				for(int j=2;j<=i;j++){
//					if(i%j==0){
//						factor[p]=j;
//						origan=origan/j;
//						time=time*j;
//						sum=sum+j;
//						break;
//						}
//				cnt=cnt+1;
//				if(time==i){
//					break;
//				}
//				}
//			if(sum==i){
//				perfect[i]=1;
//			}
//			}
//		}
//		System.out.print(perfect[2]);
//		for (int i=0; i<perfect.length;i++){
//			if(perfect[i]==1){
//				System.out.print(i+" ");
//			}
//		}
//		for(int i=0;i<factor.length;i++){
//			factor[i]=0;
//		}
//		for(int j=0;j<factor.length;j++){
//			for(int i=2; i<=a;i++ ){
//				if(a%i==0){
//					factor[j]=i;
//					a=a/i;
//					sum=sum*i;
//					break;
//				}
//			}
//			cnt=cnt+1;		
//			if(sum==origan){
//				break;
//			}
//		}
//		for(int i=0;i<(cnt-1);i++){
//			if(factor[i]>0){
//				System.out.print(factor[i]+"x");
//			}
//		}
//		System.out.print(factor[(cnt-1)]);
	}
//		public static void fac(int a){
//		int origan=a;
//		int cnt=0;
//		System.out.print(origan+"=");
//		int sum=1;
//		int [] factor = new int[50];
//		for(int i=0;i<factor.length;i++){
//			factor[i]=0;
//		}
//		for(int j=0;j<factor.length;j++){
//			for(int i=2; i<=a;i++ ){
//				if(a%i==0){
//					factor[j]=i;
//					a=a/i;
//					sum=sum*i;
//					break;
//				}
//			}
//			cnt=cnt+1;		
//			if(sum==origan){
//				break;
//			}
//		}
//		for(int i=0;i<(cnt-1);i++){
//			if(factor[i]>0){
//				System.out.print(factor[i]+"x");
//			}
//		}
//		System.out.print(factor[(cnt-1)]);
//	}

//	public static boolean isPerfect(int a){
//		int origan=a;
//		int cnt=0;
//		int sum=1;
//		int [] factor = new int[50];
//		for(int i=0;i<factor.length;i++){
//			factor[i]=0;
//		}
//		for(int i=2; i<=a;i++ ){
//			if(a%i==0){
//				factor[cnt]=i;
//				cnt=cnt+1;
//			}			
//		}
//		for(int i=0;i<(cnt-1);i++){
//			if(factor[i]>0){
//				sum=sum+factor[i];
//			}
//		}
//		if(sum==origan){
//			return true;	
//		}
//		else{
//			return false;
//		}
//	}

}

	
