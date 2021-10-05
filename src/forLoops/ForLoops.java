package forLoops;

public class ForLoops {

	public static void main(String[] args) {
		cap();
		decrease(7, '\\', '/');
		increase(7, '/', '\\');
		cap();
	}

	public static void decrease(int number1, char symbol1, char symbol2) {

		int h = 1;
		for (int i = number1; i > 0; i = i - 2) {
			for(int r = h; r>0; r--) {
				System.out.print(" ");
			}
			System.out.print(symbol1);
			for (int j = 0; j < i; j++) {
				System.out.print(":");
			}
			System.out.println(symbol2);
			h++;
		}}
		public static void increase(int number1, char symbol1, char symbol2) {

			int h = 4;
			for (int i = 0; i < number1; i = i + 2) {
				for(int r = h; r>0; r--) {
					System.out.print(" ");
				}
				System.out.print(symbol1);
				for (int j = 0; j <= i; j++) {
					System.out.print(":");
				}
				System.out.println(symbol2);
				h--;
			}
			
	}public static void cap() {

		System.out.print("|");
		for (int i = 0; i < 9 ;i++) {
			
				System.out.print("\"");
		}
		System.out.println("|");
}}
