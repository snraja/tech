
// OO Principle 
//		OPEN-CLOSED PRINCIPLE (OCP)
// 		Classes should be open for extension and closed for modification

// Decorator Pattern
//		Attach additional responsibilities to an object dynamically. 
//		Decorators provide a flexible alternative to subclassing for extending functionality.

// IMP: Decorators are the same type as the components they decorate, either through inheritance
//		or interface implementation


abstract class Beverage
{
	String description = "Unknown Beverage";
	
	public String getDescription() 
	{
		return description;
	}

	public abstract double cost();
}	

class HouseBlendBeverage extends Beverage
{
	public String getDescription()
	{
		return "House Blend";
	}

	public double cost()
	{
		return 1.99f;
	}
}

class DecafBeverage extends Beverage
{
	public String getDescription()
	{
		return "De-caf";
	}

	public double cost()
	{
		return 3.95f;
	}
}

abstract class CondimentDecorator extends Beverage
{
	public abstract String getDescription();
}

class MochaDecorator extends CondimentDecorator
{
	Beverage beverage;
	public MochaDecorator(Beverage bev)
	{
		this.beverage = bev;
	}

	public String getDescription()
	{
		return  beverage.getDescription() + ", Mocha";
	}

	public double cost()
	{
		return beverage.cost() + 6.19f;
	}
}

class SoyDecorator extends CondimentDecorator
{
	Beverage beverage;
	public SoyDecorator(Beverage bev)
	{
		this.beverage = bev;
	}

	public String getDescription()
	{
		return beverage.getDescription() + ", Soy";
	}

	public double cost()
	{
		return beverage.cost() + 2.29f;
	}

}

class DecoratorTest
{
	public static void main(String[] args) 
	{
		Beverage hbBev = new HouseBlendBeverage();
		hbBev = new MochaDecorator(hbBev);
		hbBev = new SoyDecorator(hbBev);

		System.out.println("Cost of " + hbBev.getDescription() + " is " + hbBev.cost());

		Beverage decaf = new DecafBeverage();
		decaf =  new SoyDecorator(decaf);
		decaf =  new MochaDecorator(decaf);
		decaf = new MochaDecorator(decaf);
		System.out.println("Cost of " + decaf.getDescription() + " is " + decaf.cost());
			
	}
}






