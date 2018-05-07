package com.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TransExternalizable implements Externalizable {
	String name;
	int maths;
	int physics;
	int chemistry;
	transient int temp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(name);
		oo.writeInt(physics);
		oo.writeInt(chemistry);
		oo.writeInt(maths);
		oo.writeInt(temp);

	}

	public void readExternal(ObjectInput oi) throws ClassNotFoundException, IOException {
		name = (String) oi.readObject();
		physics = oi.readInt();
		chemistry = oi.readInt();
		maths = oi.readInt();
		temp = oi.readInt();
	}
}
