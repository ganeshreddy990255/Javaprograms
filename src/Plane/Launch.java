package Plane;

class plane{
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

class Cargoplane extends plane{
	@Override
	void fly() {
		System.out.println("Cargoplane is flying");
	}
	void  CarryGoods() {
		System.out.println("Cargoplane carryGoods");
		
	}
}
class passengerplane extends plane {
	@Override
	void fly() {
		System.out.println("passengerplane is flying");
	}
	void carryhumans() {
		System.out.println("passengerplane carryhumans");
		
	}
}
class Fighterplane extends plane {
	@Override
	void fly() {
		System.out.println("Fighterplane is flying");
	}
	void carryweapons() {
		System.out.println("Fighterplane carryweapons");
	}
}

public class Launch {
public static void main(String[] args) {
	Cargoplane cp = new Cargoplane();
	cp.takeoff();
	cp.fly();
	cp.land();
	cp.CarryGoods();
	System.out.println("==============");
	passengerplane pp = new passengerplane();
	pp.takeoff();
	pp.fly();
	pp.land();
	pp.carryhumans();
	System.out.println("==================");
	Fighterplane fp = new Fighterplane();
	fp.takeoff();
	fp.fly();
	fp.land();
	fp.carryweapons();
	
}
}
