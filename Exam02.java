import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int R = sc.nextInt();
		int N = sc.nextInt();
		List<Integer> arrX = new ArrayList<Integer>();
		List<Integer> arrY = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			int x_i = sc.nextInt();
			int y_i = sc.nextInt();
			arrX.add(x_i);
			arrY.add(y_i);
		}
		for (int j = 0; j < N; j++) {
			if (Math.pow(arrX.get(j) - a, 2)+Math.pow(arrY.get(j) - b, 2) >= Math.pow(R, 2)) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}
	}
}
