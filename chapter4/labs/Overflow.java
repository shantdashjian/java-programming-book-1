package chapter4.labs;

public class Overflow {
	int big;

	public static void main(String[] args) {
		Overflow overflow = new Overflow();
		overflow.big = 2_147_483_647;

		System.out.println(overflow.big);
		System.out.println(overflow.big + 1);
	}
}
