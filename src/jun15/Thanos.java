package jun15;

import java.util.Arrays;
import java.util.Scanner;

public class Thanos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();// 원소 개수 넣기

		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(arr));// 배열 생성

		if (input % 2 == 0) {// 원소 개수 짝수라면
			int[] newArr = new int[(input / 2)];// 새로운 배열 생성
			for (int i = 0; i < (input / 2); i++) {
				int num = (int) (Math.random() * input);// 원래 있던 배열의 인덱스 무작위로 뽑기
				newArr[i] = arr[num];
				if (arr[num] == 0) {// 중복 제거
					i--;
				}
				arr[num] = 0;
			}
			System.out.println(Arrays.toString(newArr));
		} else {// 원소 개수 홀수라면
			int[] newArr2 = new int[(input / 2) + 1];// 새로운 배열 생성
			for (int i = 0; i < (input / 2) + 1; i++) {
				int num = (int) (Math.random() * input);// 원래 있던 배열의 인덱스 무작위로 뽑기
				newArr2[i] = arr[num];
				if (arr[num] == 0) {// 중복 제거
					i--;
				}
				arr[num] = 0;
			}
			System.out.println(Arrays.toString(newArr2));
		}

	}
}