package fr.xiaomi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		
		enumSingleton.hello();
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		singleton.hello();
		singleton2.hello();
		
	}

}
