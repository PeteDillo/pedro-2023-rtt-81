package loops;

public class FirstForLoop {
	public static void main(String[]args) {
		for(int i = 0; i< 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}
}
