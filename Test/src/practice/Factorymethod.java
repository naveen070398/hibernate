package practice;

interface vehicle
{
	void cost();
	void milage();
}
abstract class car implements vehicle
{
	void wheels()
	{
		System.out.println("car has wheels");
	}
}
abstract class Bike implements vehicle
{
	void stand()
	{
		System.out.println("Bike has stand");
	}
}
class swift extends car
{
	public void cost()
	{
		System.out.println("swift cost is 10 lakhs");
	}
	public void milage()
	{
		System.out.println("swift milage is 25km");
	}
}
class Benz extends car
{
	public void cost()
	{
		System.out.println("Benz cost is 40 lakhs");
	}
	public void milage()
	{
		System.out.println("Benz milage is 10km");
	}
}
class Tiger extends Bike
{
	public void cost()
	{
		System.out.println("Tiger cost is 5 lakhs");
	}
	public void milage()
	{
		System.out.println("Tiger milage is 30km");
	}
}
class KTM extends Bike
{
	public void cost()
	{
		System.out.println("KTM cost is 2 lakhs");
	}
	public void milage()
	{
		System.out.println("KTM milage is 40km");
	}
}
class CarFactory
{
	car getCar(String car)
	{
		if(car.equals("swift"))
			return new swift();
		else if(car.equals("Benz"))
			return new Benz();
		return null;
	}
}
class BikeFactory
{
	Bike getBike(String bike)
	{
		if(bike.equals("Tiger"))
			return new Tiger();
		else if(bike.equals("KTM"))
			return new KTM();
		return null;
	}
}

