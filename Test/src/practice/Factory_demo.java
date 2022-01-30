package practice;


public class Factory_demo {
			public static void main(String[] args) {
				CarFactory cf=new CarFactory();
				System.out.println("\t Car Details: ");
				car c=cf.getCar("swift");
				c.wheels();
				c.cost();
				c.milage();
				car c1=cf.getCar("Benz");
				c1.wheels();
				c1.cost();
				c1.milage();
				
				BikeFactory bf=new BikeFactory();
				System.out.println("\n\t Bike Details: ");
				Bike b=bf.getBike("Tiger");
				b.stand();
				b.cost();
				b.milage();
				Bike b1=bf.getBike("KTM");
				b1.stand();
				b1.cost();
				b1.milage();
			}

	}

