package com.demo;

/**
 * @author Sumit
 *
 */
public class DemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoTest dt = new DemoTest();
		System.out.println(dt.solution(new int[] { -1, 3, -4, 5, 1, -6, 2, 1 }));
		System.out.println(Integer.toString(5,2));
	}

	public int solution(int[] A) {
		int n = A.length;
		if (n == 0) {
			return -1;
		} else if (ArraySum(A) == 0) {
			return 0;
		} else {
			for (int i = 0; i < n; i++) {
				long lSum = 0;
				long rSum = 0;
				for (int j = 0; j < i; j++) {
					lSum += A[j];
				}
				for (int j = i + 1; j < n; j++) {
					rSum += A[j];
				}
				if (lSum == rSum) {
					return i;
				}
			}
		}
		return -1;
	}

	public long ArraySum(int[] array) {
		long sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

}
