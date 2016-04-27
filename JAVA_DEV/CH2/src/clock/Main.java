package clock;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		clock clock = new clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
