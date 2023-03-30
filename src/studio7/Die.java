package studio7;

public class Die {
	private int n;

	public Die(int side) {
		n = side;
	}
	
	public int getSide() {
	
		int side = (int) (Math.random() * n) + 1;
		return side;
	}
	
	public static void main(String[] args) {
		Die firstDie = new Die(100);
		System.out.println(firstDie.getSide());
	}

	
}
