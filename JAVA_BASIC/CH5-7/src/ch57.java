import java.util.Scanner;


public class ch57 {

	public static void main(String[] args) {
/*
* ����Ҫ������������ʽ��Ȼ���������������ʽ�ĺͣ�Ҳ���ǰѶ�Ӧ�����ϵ�ϵ�����Ȼ�������
����Ҫ����������Ϊ100��[Ŀǰ��Ҫ����-1�����������]
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
//		

//		String S;
//		S=in.nextLine();
//		 String[] line=S.split("\\s+");		
//		for (int i=0; i<line.length-1;i++){
//			System.out.print(line[i].length()+" ");
//		}
//		System.out.print(line[line.length-1].length()-1);
/*
 * ÿ����������������������д�ɼ���������Ҳ�ɳ�Ϊ��������˵���ʽ���⼸�������Ͷ�������������������������磬6���Ա��ֽ�Ϊ2x3����24���Ա��ֽ�Ϊ2x2x2x3��
���ڣ���ĳ���Ҫ����һ��[2,100000]��Χ�ڵ�������Ȼ����������������ֽ�ʽ���������ľ�������ʱ�����������
 */
//		Scanner in = new Scanner (System.in);
//		int a=in.nextInt();
//		fac(a);
/*
 * һ�������������������п���������������������һ�������ǡ�õ��ڳ��������������֮�ͣ�������ͳ�Ϊ����������6=1��2��3(6��������1,2,3)��
���ڣ���Ҫдһ�����򣬶�������������n��m��1<=n<m<1000�������[n,m]��Χ�����е�������
��ʾ������дһ���������ж�ĳ�����Ƿ���������

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

	
