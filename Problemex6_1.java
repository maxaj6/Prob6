package problemex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_1 {
	
	public static void main(String[] args) throws IOException{
		HashMap<String, String> english2japanese = new HashMap<String, String>();
		english2japanese.put("cat", "猫");
		english2japanese.put("dog", "犬");
		english2japanese.put("bird", "鳥");
		english2japanese.put("tiger", "トラ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("英語で動物の名前を入力してください:");
        String buf = br.readLine();
        
        buf = english2japanese.getOrDefault(buf,"none");
        if(buf == "none") {
        	System.out.println("対応するデータは登録されていません。");
        }
        else {
        	System.out.println("「"+buf+"」です。");
        }
	}

}
