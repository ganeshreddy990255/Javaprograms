package Plane;

public class Plane {
	void takeoff() {
		System.out.println("plane is taking off");
	
	}
	void fly() {
		System.out.println("plane is flying");
		
	}
	void land() {
		System.out.println("plane is landing");
	
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("cargo plane is flying");
		
	}
	void CarryGoods() {
		System.out.println("cargo plane carry good");
	}
}
class passengerplane extends Plane {
	@Override
	void fly() {
		System.out.println("passenger plane is flying");
		
	}
	void carryhumans() {
		System.out.println("passenger plane carry humans");
	}
}
class Fighter extends Plane {
	@Override
	void fly() {
		System.out.println("Fighter plane is flying");
	}
	void carryweapons() {
		System.out.println("Fighterplane carry weapons");
	}
	}

public class Launch {
	public static void main(String[] args) {
		Plane ref;
		CargoPlane cp = new CargoPlane();
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.CarryGoods();
		System.out.println("=============");
		passengerplane pp = new passengerplane();
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryhumans();
		System.out.println("============");
		Fighter Plane fp = new Fighter Plane();
		
		
		

		
		
		
		
		
		
	
		
		
		
	}
	


	

}
