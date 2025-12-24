package com.demo;

public class BufferString {

	public static void main(String[] args) {
		//stringbuffer has initial capacity of 16
		StringBuffer sb = new StringBuffer(); 
		System.out.println(sb.capacity());
		//System.out.print(sb.reverse());
		sb.append("Ronaldo is ");
		//sb.ensureCapacity(31);
		sb.trimToSize(); 
		System.out.println(sb.capacity());
		/*
		StringBuilder sbl = new StringBuilder("Ashmit");  //total capacity = 16(default)+6(Ashmit)=22
		System.out.println(sbl.capacity());
		*/
	}

}
