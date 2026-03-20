package day5;

public class MethodLab8 {

	public static void main(String[] args) {
		System.out.println("[ 실행 결과 ]\n");
		System.out.println(isRightTriangle(3, 4, 5));
		System.out.println(isRightTriangle(1, 2, 3));
	}
	
	static boolean isRightTriangle(int width, int height, int hypo) {
		return (width*width) + (height*height) == (hypo*hypo);
	}

}
