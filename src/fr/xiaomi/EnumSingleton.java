package fr.xiaomi;

import java.io.Serializable;

public enum EnumSingleton implements Serializable{
	INSTANCE;
	public void hello(){
		System.out.println("Hello Enum Singleton.");
	};
}
