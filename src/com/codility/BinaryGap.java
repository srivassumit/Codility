package com.codility;

/**
 * <a>https://codility.com/programmers/lessons/1-iterations/binary_gap/</a>
 * 
 * @author Sumit
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(5));
		System.out.println(bg.solution(15));
		System.out.println(bg.solution(1041));
		System.out.println(bg.solution(2147483647));
		System.out.println(bg.solution(2000000001));
	}

	public int solution(int N) {
		int count = 0;
		int maxCount = 0;
		String binary = Integer.toString(N, 2);
		if (!binary.contains("1")) {
			return binary.length();
		}
		for (char c : binary.toCharArray()) {
			if (c == '0') {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}
		}
		return maxCount;
	}

}
