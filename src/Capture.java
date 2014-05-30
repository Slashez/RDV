import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Capture {
	public static BufferedImage getScreen() {
		BufferedImage screenCap;
		try {
			Rectangle screenRect = new Rectangle(
					(Toolkit.getDefaultToolkit().getScreenSize()));
			screenCap = new Robot().createScreenCapture(screenRect);
		} catch (HeadlessException e) {
			e.printStackTrace();
			return null;
		} catch (AWTException e) {
			e.printStackTrace();
			return null;
		}
		return screenCap;
	}
}