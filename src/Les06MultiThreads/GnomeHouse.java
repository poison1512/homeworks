package Les06MultiThreads;

public class GnomeHouse extends Thread {

	public GnomeHouse(int maxPriority) {
		start();
			}

	@Override
	public void run() {
		Gnome gnome = new Gnome("Ghimli");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Gnome.name + Gnome.nam);
	}

}
