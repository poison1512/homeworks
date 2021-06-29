package Les06MultiThreads;

import java.util.Iterator;

public class Gnome extends Thread {

	public static String name;

	public static int nam = (int) (Math.random() * 100);

	public Gnome(String name) {
		this.name = name;
		start();
	}

//	public Gnome(int minPriority) {
//		// TODO Auto-generated constructor stub
//	}

	public static int getNam() {
		return nam;
	}

	@Override
	public void run() {
		GoldMine.setGoldQNT(1000);
		while (GoldMine.goldQNT >= 3) {
			String qnt = "";
			GoldMine.setGoldQNT(GoldMine.goldQNT - 3);
			for (int i = 0; i < GoldMine.getGoldQNT(); i++) {
				qnt += "•";
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(qnt);
			}
		}
	}
}
