package in.co.basic;

public class MainEx {
public void main(){
	System.out.println("main");
}
public static void main(String[] args) {
	System.out.println(args.toString());
	MainEx ex=new MainEx();
	ex.main();
}
}
