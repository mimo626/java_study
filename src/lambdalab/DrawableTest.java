package lambdalab;
import java.util.Random;

@FunctionalInterface
interface Drawable {
	void draw();
}

enum Shape{
	RECT,
	CIRCLE,
	DIAMOND
}

public class DrawableTest {
	public static void main(String[] args) {

		output(() -> {
			Random rand = new Random();
			int num = rand.nextInt(3);
	
			Shape[] shapes = Shape.values();
			
			if (shapes[num] == Shape.RECT) System.out.println("사각형을 그립니다.");
			else if (shapes[num] == Shape.CIRCLE) System.out.println("원을 그립니다.");
			else if (shapes[num] == Shape.DIAMOND) System.out.println("마 름모를 그립니다.");	
		});
	}

	public static void output(Drawable d) {
		System.out.println("전달된 객체의 클래스명 : " + d.getClass().getName());
		d.draw();
	}
}

