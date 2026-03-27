package day8.work;

public class CargoPlane extends Plane{
	CargoPlane(){}
	CargoPlane(String planeName, int fulSize){
		super(planeName, fulSize);
	}
	@Override
	public void flight(int distance) {
		setFulSize(getFulSize() - (distance/10)*50);
	}
}