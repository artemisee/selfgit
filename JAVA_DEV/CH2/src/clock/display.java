package clock;

public class display {
	private int value=0;
	private int limit=0;
	
	public display(int limit){
		this.limit=limit;
	}
	
	public void setValue(int value){
		this.value=value;
	}
	
	public void increase(){
		value++;
		if (value==limit){
		value=0;
		}
	}
	
	public int getValue(){
		return value;
	}

	public static void main(String[] args) {
		display d=new display(24);
		for(;;){
			d.increase();
			System.out.println(d.getValue());
		}

	}

}
