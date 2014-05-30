import java.awt.EventQueue;

public class Core {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Menu c = new Menu();
			}
		});
	}
}
