package day4;

public class MethodLab4 {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			System.out.print((i == 4) ? getRandom(10) + "\n" : getRandom(10) + ", ");
		}
		
		for(int i = 0; i<5; i++) {
			System.out.print((i == 4) ? getRandom(10, 20) + "" : getRandom(10, 20) + ", ");
		}

	}
	
	   static int getRandom(int n) {
		   return (int)(Math.random()*n) + 1;
	   }
	   
	   static int getRandom(int n1, int n2) {
		   return (int)(Math.random()*(n2 - n1 + 1)) + n1;
	   }

}
