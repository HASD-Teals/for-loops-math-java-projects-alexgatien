package forLoops;

public class Triforce {
	
	
	public static void main(String[] args) {
	
	
	top (9);
	bottom(9);
	
	
}
	public static void top(int number1) {

		int h = 1;
		for (int i = number1; i > 0; i = i - 2) {
			for (int r = h; r > 0; r--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			
				for (int r = h+h; r > 0; r--) {
					System.out.print(" ");
				}
				
				for (int v = 0; v < i; v++) {
					System.out.print("#");
				}
			System.out.println();
			h++;
		}}
		public static void bottom(int number1) {

			int h = 1;
			for (int i = number1; i > 0; i = i - 2) {
				for (int r = h+1+(number1/2); r > 0; r--) {
					System.out.print(" ");
				}
				
				for (int j = 0; j < i; j++) {
					System.out.print("#");
				}
				System.out.println();
				h++;
			}
	

	}}



/*
######### #########
 #######   #######
  #####     #####
   ###       ###
    #         # 
     #########
      #######
       #####
        ###
         #
*/