package work;

public class PlaneTest {
	 public static void main(String args[]) {
		 Plane[] planes = new Plane[2];
		 AirPlane air = new AirPlane("L747", 1000);
		 CargoPlane cargo = new CargoPlane("C40", 1000);
		 planes[0] = air;
		 planes[1] = cargo;
		 
		 printInfo(planes);
		 
		 int fuel = 100;
//		 air.flight(fuel);
//		 cargo.flight(fuel);
		 // 배열로 하기
		 for(Plane p : planes) p.flight(fuel);
		 System.out.println("\n[ " + fuel + " 운항 ]");
		 printInfo(planes);

		 fuel = 200;
		 for(Plane p : planes) p.refuel(fuel);
		 System.out.println("\n[ "+fuel + " 주유 ]");
		 printInfo(planes);
	 }
	public static void printInfo(Plane[] list) {
		System.out.println("Plane\tfuelSize");
		System.out.println("------------------------");

		for(Plane p : list) {
			// 문자열의 길이에 따라 띄어쓰기 간격이 다르기에 \t이 아닌 printf 사용
			System.out.printf("%-10s %d\n", p.getPlaneName(), p.getFulSize());		}
	 }
	}
