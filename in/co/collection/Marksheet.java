package in.co.collection;

public class Marksheet implements Comparable<Marksheet> {
public int rollNo;
public String name;
public int marks;
public Marksheet(int rollNo,String name,int mark) {
	this.rollNo=rollNo;
	this.name=name;
	this.marks=mark;
	
}
 /*public boolean equals(Object obj) {
	 if(obj==null){
		 return false;
	 }
	 if(!(obj instanceof Marksheet)){
		 return false;
	 }
	 Marksheet marksheet=(Marksheet)obj;
	 return this.rollNo.equals(marksheet.rollNo);
	 };*/
	@Override
	public int compareTo(Marksheet o) {
	
		
		return rollNo-o.rollNo;
	}
	
	public String toString(){
		return rollNo+","+name+","+marks;
	}
	

}
