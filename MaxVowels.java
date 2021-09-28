package com.hcl;
import java.util.Scanner;
public class MaxVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Word : ");
        String sentence = sc.nextLine();
        String word = "";
        String wordMostVowel = "";
        int temp = 0;
        int vowelCount = 0;
        char ch;
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (ch != ' ' && i != (sentence.length() - 1)) {
                word += ch;  
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; 
                }
            } else { 
                if (vowelCount > temp) {
                    temp = vowelCount;
                    wordMostVowel = word;
                }
                word = "";
                vowelCount = 0;
            }    
        }
        System.out.println("The word with the most vowels (" + temp + ") is: " + " " + wordMostVowel);
	}

}
