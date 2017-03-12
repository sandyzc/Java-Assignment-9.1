package com.collection;

public class HDTV implements Comparable<HDTV>{
	String brandname;
	int size;

	public HDTV(String brandname, int size) {
		super();
		this.brandname = brandname;
		this.size = size;
	}
	

	@Override
	public String toString() {
		return "HDTV [brandname=" + brandname + ", size=" + size + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

	
	@Override
	public int compareTo(HDTV o) {
		// TODO Auto-generated method stub
		return this.size-o.size;
	}

}
