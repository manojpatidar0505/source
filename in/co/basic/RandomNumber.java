package in.co.basic;

public class RandomNumber {
	public static void random(){
		for(int i=0;i<5;i++){	
			int m=(int)(Math.random()*100);
			//System.out.println(Math.random()*100);
			System.out.println(m);
		
		}
		
	}
public static void main(String[] args) {
	random();
}
}
