/*
 * ��ĳ���Ҫ����������һ�ű�Ȼ�󣬸���������������е����ƣ���������������֮�����̡�

ע�⣺�κ���������֮�����̶��Ѿ�����������Ҫ���㾭��������ת��

�����ʽ:
���ȣ����������ɸ����е����֡�ÿ�����ֶ�ֻ��һ��Ӣ�ĵ��ʣ��м䲻���ո���������š�����������Ϊ��###��������#�ţ�ʱ����ʾ�����������������###������һ�����е����֡�����Ƕ����ĳ������ֵ�����Ϊn��
Ȼ��������nxn��һ���������󡣵�һ�е�ÿһ�����֣���ʾ�������������е�һ���������ε���һ������֮�����̡�����ͬһ������֮������Ϊ0��
����������������е����֡�
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
