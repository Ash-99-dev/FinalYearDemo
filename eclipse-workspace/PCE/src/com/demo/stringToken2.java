package com.demo;

import java.util.StringTokenizer;

public class stringToken2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Hii I am me";
        StringTokenizer st = new StringTokenizer(sentence, " ");

        if (st.hasMoreTokens()) {
            String firstWord = st.nextToken();

            for (int i = 0; i < firstWord.length(); i++) {
                System.out.println(firstWord.charAt(i));
            }

            int lastChar = firstWord.length() - 1;
            System.out.println("Last character: " + firstWord.charAt(lastChar));
        }
	}

}
