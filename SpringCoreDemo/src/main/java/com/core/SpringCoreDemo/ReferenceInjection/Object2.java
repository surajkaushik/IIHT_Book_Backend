package com.core.SpringCoreDemo.ReferenceInjection;

public class Object2 {
	
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	

	public Object2(int no) {
		super();
		this.no = no;
	}

	@Override
	public String toString() {
		return "Object2 [no=" + no + "]";
	}
	

}
