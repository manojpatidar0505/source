package in.co.basic;

public class ClassLoaderExample {
	static{
		System.out.println("StaticBLock");
	}
public static void main(String[] args) {
	System.out.println("Class Loadef For Hashmap"+java.util.HashMap.class.getClassLoader());
	System.out.println("class loader for this class: "
			+ ClassLoaderExample.class.getClassLoader().toString());

}
}
