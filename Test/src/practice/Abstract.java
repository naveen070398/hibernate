package practice;

abstract class bikes
{
	abstract void mileage();
	abstract void cost();
	
}
class MT15 extends bikes
{
	public void cost()
	{
		System.out.println("MT15 cost is 1,83,000");
	}
	public void mileage()
	{
		System.out.println("MT15 mileage is 50kmph");
	}
}
class Rx100 extends bikes
{
	public void cost()
	{
		
		System.out.println("Rx100 cost is 1,20,000");
	}
	public void mileage()
	{
		System.out.println("Rx100 mileage is 40kmph ");
	}
}
public class Abstract
{
	public static void main(String[] args)
	{
		bikes b;
		b=new MT15();
		b.cost();
		b.mileage();
		b=new Rx100();
		b.cost();
		b.mileage();
	}
}