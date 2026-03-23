package day6;

public class BlockTest {
	static {
		System.out.println("*static 블럭 수행*");
	}
	{
		System.out.println("#instance 블럭 수행#");
	}

	public BlockTest() {
		System.out.println("#생성자 수행#");
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		// BlockTest에는 toString이 없으니 부모의 toString이 자동으로 출력됨 
		System.out.println(bt);
		System.out.println(bt.toString());
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}
}
