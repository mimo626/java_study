package day7.mobile;

public class Ltab extends Mobile{
	public Ltab(){}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	// 어노테이션 역할: 개발자 실수 감소 - 오버로딩인지 오버라이딩인지 구분, 제대로된 오버라이드인지 확인 가
	@Override
   public void operate(int time) {
		// super를 안 써도 부모에만 있는 메서드기 때문에 그냥 써도 부모 메서드 실행
//	   super.setBatterySize(super.getBatterySize() - time*10);
		setBatterySize(getBatterySize() - time*10);

   };
	@Override
   public void charge(int time) {
	   setBatterySize(getBatterySize() + time*10);
   };
}
