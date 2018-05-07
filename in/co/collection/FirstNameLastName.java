package in.co.collection;

import java.util.Comparator;

import javax.swing.ComboBoxEditor;

public class FirstNameLastName implements Comparator<FirstNameLastName>{
public String fname;
public String lname;
public FirstNameLastName(String fname,String lname) {
	this.fname=fname;
	this.lname=lname;
	// TODO Auto-generated constructor stub
}
public FirstNameLastName() {
	// TODO Auto-generated constructor stub
}
@Override
public int compare(FirstNameLastName o1, FirstNameLastName o2) {
	if(o1.fname.equals(o2.fname))
	{
		return o1.fname.compareTo(o2.fname);
	}else{
		return o1.lname.compareTo(o2.lname);
	}
	
}
public String toString(){
	return fname+" ,"+lname;
}

}
