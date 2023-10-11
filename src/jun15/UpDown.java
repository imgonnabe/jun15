package jun15;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {

		int number = (int) (Math.random() * 100) + 1;
		System.out.println(number);

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = 1;
		for (int i = 0; i < num; i++) {
			int[] arr = new int[num];
			arr[i] = sc.nextInt();

			if (arr[i] < number) {
				System.out.println("UP");
			} else if (arr[i] > number) {
				System.out.println("DOWN");
			} else {
				System.out.println("정답");
				break;
			}
			num++;
		}
		System.out.println(num);
		sc.close();
	}

}
