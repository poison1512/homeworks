package Les06MultiThreads;

public class GoldMine {
	private GoldMine goldMine;
	public static int goldQNT;

	public GoldMine(GoldMine goldMine) {
		super();
		this.goldMine = goldMine;
	}


	public static int getGoldQNT() {
		return goldQNT;
	}

	public static void setGoldQNT(int goldQNT) {
		GoldMine.goldQNT = goldQNT;
	}
}
