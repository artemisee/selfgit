import java.util.Scanner;

public class ch57 {

	public static void main(String[] args) {
/*
* ����Ҫ������������ʽ��Ȼ���������������ʽ�ĺͣ�Ҳ���ǰѶ�Ӧ�����ϵ�ϵ�����Ȼ�������
����Ҫ����������Ϊ100��[Ŀǰ��Ҫ����-1�����������]
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
 * ��ĳ�����Ҫ����һ������n����Χ��[3,100]�����ʾ���������̵ı߳�������n=3�ͱ�ʾ��һ��3x3�����̡�
 * Ȼ��Ҫ����n�У�ÿ��n�����֣�ÿ��������1��0�����α�ʾ[0,0]��[n-1,n-1]λ���ϵ����ӡ�1��ʾX��0��ʾO����д��ĸO����
��ĳ���Ҫ�ж������Ƿ����ĳһ����ʤ����ʤ�������Ǵ������л����л������Խ��߻��������Խ���������ͬ�����ӡ�
������ڣ�����������ʤһ����ĸ��X��O����д��ĸX��O�������û���κ�һ����ʤ�������NIL��������д��ĸ���м�����ĸI��India��I����
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
////		�����
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
////		�����
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
////		���Խ���
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
 * ��ĳ���Ҫ����һ���ı��������Կո�ָ�Ϊ���ɸ����ʣ��ԡ�.����������Ҫ��������ı���ÿ�����ʵĳ��ȡ�
 * ����ĵ����������޹أ����԰������ַ��ţ����硰it's����һ�����ʣ�����Ϊ4��ע�⣬���п��ܳ��������Ŀո�
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
