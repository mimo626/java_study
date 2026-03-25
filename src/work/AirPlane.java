package work;

public class AirPlane extends Plane{
	AirPlane(){}
	AirPlane(String planeName, int fulSize){
		super(planeName, fulSize);
	}
	@Override
	public void flight(int distance) {
		setFulSize(getFulSize() - (distance/10)*30);
	}
}
