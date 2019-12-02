package headfirst.designpatterns.strategy.challenge;

import java.util.Scanner;

public class PhotoWithPhone {
 
	public static void main(String[] args) {
 
		PhoneCameraApp cameraApp = new BasicCameraApp();
		String share = getSharing();
		switch (share) {
			case("t"): cameraApp.setShareStrategy(new Txt()); break;
			case("e"): cameraApp.setShareStrategy(new Email()); break;
			case("s"): cameraApp.setShareStrategy(new Social()); break;
			default: cameraApp.setShareStrategy(new Txt());
		}
		cameraApp.take();
		cameraApp.edit();
		cameraApp.save();
		cameraApp.share();
	}
	public static String getSharing() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Share with txt (t), email (e), or social media (s)?");
		String appName = scanner.next();
		scanner.close();
		return appName;
	}
}
