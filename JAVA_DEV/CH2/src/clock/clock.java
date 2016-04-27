package clock;
import java.lang.String;

public class clock {
	private display hour=new display(24);
	private display minute=new display(60);
	private display second=new display(60);
	
	
	public clock(int hour, int minute, int second){
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);	
	}
	
	public void tick(){
		while(true){
			second.increase();
			if(second.getValue()==0){
				minute.increase();
				if(minute.getValue()==0){
					hour.increase();
					}
			}
			System.out.printf("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
		}
	}
	
//	public String toString(){
//		return String.format("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
//	}
	
	
	public static void main(String[] args) {
		clock clock=new clock(0,0,0);
		clock.tick();
		System.out.println(clock);
		

	}

}
