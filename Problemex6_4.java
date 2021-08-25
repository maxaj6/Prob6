package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problemex6_4 {
	public static void main(String[] args) throws IOException{
		HashSet<Character> hash_alphabet = new HashSet<Character>();
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("英単語を入力してください:");
        String input = br.readLine();
        for(int idx = 0; idx<input.length(); idx++) {
        	hash_alphabet.add(input.charAt(idx));
        }
        System.out.println("");
        
        System.out.print("使用されているアルファベット");
        for(char c:hash_alphabet) {
        	System.out.print(c+" ");
        }
	}
}
