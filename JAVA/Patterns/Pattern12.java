package Patterns;

public class Pattern12 {

	public static void main(String[] args) {

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = a; j > i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
