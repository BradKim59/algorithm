import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String text = "Hello ";
		for (int i =0; i<n; i++) {
			String input = sc.next();
			if (i == (n-1)) {
				text += input+".";
			} else {
				text += input+",";				
			}
		}
			System.out.printf(text);				
	}
}
