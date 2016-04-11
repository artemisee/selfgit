import java.util.Scanner;

public class ch57 {

	public static void main(String[] args) {
/*
* 程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系数相加然后输出。
程序要处理的幂最大为100。[目前需要输入-1结束，待解决]
*/
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
		Scanner in = new Scanner (System.in);
//		String x=in.nextLine();
//		System.out.println(x.length());
		String S;
		S=in.next();
		while(!S.equals(**)){
			System.out.print(S+" ");
			System.out.println(S.length()+" ");
			S=in.next();
			}
		
	}

}
