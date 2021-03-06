/*
 * 你的程序要读入这样的一张表，然后，根据输入的两个城市的名称，给出这两个城市之间的里程。

注意：任何两个城市之间的里程都已经给出，不需要计算经第三地中转。

输入格式:
首先，你会读到若干个城市的名字。每个名字都只是一个英文单词，中间不含空格或其他符号。当读到名字为“###”（三个#号）时，表示城市名字输入结束，###并不是一个城市的名字。如果记读到的城市名字的数量为n。
然后，你会读到nxn的一个整数矩阵。第一行的每一个数字，表示上述城市名单中第一个城市依次到另一个城市之间的里程。表中同一个城市之间的里程为0。
最后，你会读到两个城市的名字。
 */
package cityMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class cityMap {
	
	ArrayList<String> city = new ArrayList<String>();
	HashMap<String, Integer> dist = new HashMap<String, Integer>();
	
	Scanner in = new java.util.Scanner(System.in);
	
	public void addCity(){
		String name=in.next();
		while (!name.equals("###")){
			city.add(name);
			name=in.next();
		}
		
	}
	
	
	public void addDist(){
		for(String citya:city){
			for(String cityb:city){
				int distant=in.nextInt();
				dist.put(citya+cityb,distant);
			}
		}
	}
	
	public int getDist(){
		String citya=in.next();
		String cityb=in.next();
		return dist.get(citya+cityb);
	}
	
	

	public static void main(String[] args) {
		cityMap a = new cityMap();
        a.addCity();
        a.addDist();
        System.out.println(a.getDist());

	}

}
