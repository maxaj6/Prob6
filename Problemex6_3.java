package problemex6;

import java.util.HashSet;

public class Problemex6_3 {

	public static void main(String[] args) {
		HashSet<Integer> hash_num = new HashSet<Integer>();
		RandGenerator rnd = new RandGenerator();
		
		System.out.print("乱数:");
		for(int i = 0; i < 10; i++) {
			int generated = rnd.generateRand(11);
			System.out.print(generated+" ");
			hash_num.add(generated);
		}
		System.out.println("");
		
		System.out.print("出現した数:");
		for(int i:hash_num) {
			System.out.print(i+" ");
			
		}
	}
}
