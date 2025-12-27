package com.questions;

class TArea{
	int l;
	int b;
	static float half;
	TArea(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	public float display() {
		return half*l*b;
	}
}
public class trinagleArea {

	public static void main(String[] args) {
		TArea.half = 0.5f;
		TArea a = new TArea(2,5);
		System.out.println(a.display());
	}

}
