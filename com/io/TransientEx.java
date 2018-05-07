package com.io;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientEx implements Serializable {
	private String user;
	private transient String pwd;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/*private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		System.out.println("wiriting tran");
		os.writeObject(pwd);
	}

	private void readObject(ObjectInputStream is)  throws Exception{
		is.defaultReadObject();
		System.out.println("reading");
		pwd = (String) is.readObject();
	}*/
	

}
