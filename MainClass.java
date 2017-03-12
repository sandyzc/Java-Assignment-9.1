package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDTV one = new HDTV("Sony",50);
		HDTV two = new HDTV("Panasonic",56);
		HDTV three = new HDTV("Bpl",60);
		HDTV four = new HDTV("LeTv",65);
		HDTV five = new HDTV("Micromax",32);
		
		ArrayList<HDTV> array = new ArrayList<>();
		array.add(one);
		array.add(two);
		array.add(three);
		array.add(four);
		array.add(five);
		
		array.sort(null);
		
	Iterator<HDTV> iterator = array.iterator();
	
	while(iterator.hasNext()){
		HDTV str = iterator.next();
		System.out.println(str);
		
	}
		
		

	}

}
