package fr.xiaomi;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton(){
		System.out.println("Create Singleton.");
	};
	
	public static Singleton getInstance(){
		System.out.println("Get instance Singleton.");
		return INSTANCE;
	}
	
	public void hello(){
		System.out.println("Hello Singleton.");
	}
	
}
