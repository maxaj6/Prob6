package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_2 {

	public static void main(String[] args) throws IOException{
		
		HashMap<Character, Character> num2kanji = new HashMap<Character, Character>();
		num2kanji.put('1', '一');
		num2kanji.put('2', '二');
		num2kanji.put('3', '三');
		num2kanji.put('4', '四');
		num2kanji.put('5', '五');
		num2kanji.put('6', '六');
		num2kanji.put('7', '七');
		num2kanji.put('8', '八');
		num2kanji.put('9', '九');
		num2kanji.put('0', '〇');
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("整数の値を入力してください:");
        String num = br.readLine();
        int length = num.length();
        
        StringBuilder ans = new StringBuilder();
        
        int idx_num = 0;
        boolean is_print = true;
        for(int i = 0; i < length+length/3; i++) {
        	if(i != 0 && (length+length/3-i)%4 == 0) {
        		ans.append(",");
        	}
        	else {
        		char picked = num.charAt(idx_num);
        		picked = num2kanji.getOrDefault(picked,'f');
        		if (picked == 'f') {
        			is_print = false;
        		}
        		ans.append(num2kanji.get(num.charAt(idx_num)));
        		idx_num++;
        	}
        }
        if(is_print == true) {
        	System.out.println(ans);	
        }
        else {
        	System.out.println("整数の値を入力してください。");
        }
	}
}
