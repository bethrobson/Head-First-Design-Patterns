package singleton.classic;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
			Singleton singleton2 = Singleton.getInstance();
	}
}
