
public class Tester {

	public static void main(String[] args) {
		CoinsChange c =new CoinsChange();
		int[]coins= new int[] {1,2,5};
		int amount=11;
		System.out.println(c.coinChange(coins, amount));

	}

}
